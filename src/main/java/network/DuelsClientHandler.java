package network;

import bundle.GameBundleWrapper;
import bundle.game.DuelsGameData;
import bundle.loading.DuelsLoadingData;
import common.event.GameEvent;
import event.servertoclient.ServerToClientGameStateEvent;
import event.servertoclient.ServerToClientIdCreationEvent;
import event.servertoclient.ServerToClientStartingGameStateEvent;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

public class DuelsClientHandler extends SimpleChannelInboundHandler<GameEvent> {

	private GameBundleWrapper wrapper;

	public DuelsClientHandler(GameBundleWrapper wrapper) {
		this.wrapper = wrapper;
	}

	@Override
	protected void channelRead0(ChannelHandlerContext ctx, GameEvent msg) throws Exception {
		if (msg instanceof ServerToClientIdCreationEvent) {
			DuelsLoadingData data = (DuelsLoadingData) (wrapper.getBundle().getData());
			ServerToClientIdCreationEvent event = (ServerToClientIdCreationEvent) msg;
			data.setId(event.getId());
		}
		if (msg instanceof ServerToClientStartingGameStateEvent) {
			DuelsLoadingData data = (DuelsLoadingData) (wrapper.getBundle().getData());
			data.setState(((ServerToClientStartingGameStateEvent) msg).getState());
		}
		if (msg instanceof ServerToClientGameStateEvent) {
			System.out.println(msg);
			if (wrapper.getBundle().getData() instanceof DuelsGameData) {
				DuelsGameData data = (DuelsGameData) (wrapper.getBundle().getData());
				data.getStates().add(((ServerToClientGameStateEvent) msg).getState());
			}
		}
	}
}
