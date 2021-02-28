package network;

import bundle.GameBundleWrapper;
import bundle.loading.DuelsLoadingData;
import common.event.GameEvent;
import event.servertoclient.ServerToClientIdCreationEvent;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

public class DuelsClientHandler extends SimpleChannelInboundHandler<GameEvent> {

	private GameBundleWrapper wrapper;

	public DuelsClientHandler(GameBundleWrapper wrapper) {
		this.wrapper = wrapper;
	}

	@Override
	protected void channelRead0(ChannelHandlerContext ctx, GameEvent msg) throws Exception {
		System.out.println(msg);
		if (msg instanceof ServerToClientIdCreationEvent) {
			ServerToClientIdCreationEvent event = (ServerToClientIdCreationEvent) msg;
			DuelsLoadingData data = (DuelsLoadingData) (wrapper.getBundle().getData());
			data.setId(event.getId());
		}
	}

}
