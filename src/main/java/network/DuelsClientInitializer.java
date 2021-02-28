package network;

import bundle.GameBundleWrapper;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.serialization.ClassResolvers;
import io.netty.handler.codec.serialization.ObjectDecoder;
import io.netty.handler.codec.serialization.ObjectEncoder;

public class DuelsClientInitializer extends ChannelInitializer<SocketChannel> {

	private GameBundleWrapper wrapper;

	public DuelsClientInitializer(GameBundleWrapper wrapper) {
		this.wrapper = wrapper;
	}

	@Override
	protected void initChannel(SocketChannel channel) throws Exception {
		ChannelPipeline pipeline = channel.pipeline();
		pipeline.addLast("decoder", new ObjectDecoder(ClassResolvers.cacheDisabled(null)));
		pipeline.addLast("encoder", new ObjectEncoder());
		pipeline.addLast("handler", new DuelsClientHandler(wrapper));
	}
}
