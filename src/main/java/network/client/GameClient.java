package network.client;

import bundle.data.DuelsGameData;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;

public class GameClient implements Runnable {

	private DuelsGameData data;
	private String host;
	private int port = 8080;
	private boolean closeRequested = false;

	public GameClient(DuelsGameData data, String host) {
		super();
		this.data = data;
		this.host = host;
	}

	@Override
	public void run() {
		EventLoopGroup group = new NioEventLoopGroup();
		try {
			Bootstrap bootstrap = new Bootstrap();
			bootstrap.group(group);
			bootstrap.channel(NioSocketChannel.class);
			bootstrap.handler(new GameClientInitializer(data));
			Channel channel = bootstrap.connect(host, port).sync().channel();
//			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Client started at " + channel.localAddress());
			while (!closeRequested) {
//				channel.writeAndFlush(data.getState()).sync();
			}
			channel.close();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			group.shutdownGracefully();
		}
	}

}
