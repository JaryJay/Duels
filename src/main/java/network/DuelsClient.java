package network;

import event.MessageSentGameEvent;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import source.DuelsClientSource;

public class DuelsClient implements Runnable {

	private DuelsClientSource source;
	private String host;
	private int port = 8080;
	private boolean closeRequested = false;

	public DuelsClient(String host) {
		super();
		this.host = host;
		source = new DuelsClientSource(0);
	}

	@Override
	public void run() {
		EventLoopGroup group = new NioEventLoopGroup();
		try {
			Bootstrap bootstrap = new Bootstrap();
			bootstrap.group(group);
			bootstrap.channel(NioSocketChannel.class);
			bootstrap.handler(new DuelsClientInitializer());
			Channel channel = bootstrap.connect(host, port).sync().channel();
			System.out.println("Client started at " + channel.localAddress());
			while (!closeRequested) {
				channel.writeAndFlush(new MessageSentGameEvent("Client says hello!", System.currentTimeMillis(), source));
			}
			channel.close();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			group.shutdownGracefully();
		}
	}

}
