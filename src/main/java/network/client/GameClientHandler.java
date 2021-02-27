package network.client;

import bundle.data.DuelsGameData;
import common.event.GameEvent;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

public class GameClientHandler extends SimpleChannelInboundHandler<GameEvent> {

	private DuelsGameData data;

	public GameClientHandler(DuelsGameData data) {
		this.data = data;
	}

	@Override
	protected void channelRead0(ChannelHandlerContext ctx, GameEvent msg) throws Exception {
		System.out.println(msg);
//		if (msg instanceof TileMapDataEvent) {
//			TileMapDataEvent event = (TileMapDataEvent) msg;
//			TileMap map = event.getMap();
//			data.getState().setMap(map);
//			data.addDisplayable(map);
//		}
	}


}
