package network.client;

import common.source.GameSource;

public class ClientSource implements GameSource {

	private static final long serialVersionUID = -482372584226448557L;
	private String description;

	public ClientSource(String description) {
		super();
		this.description = description;
	}

	@Override
	public String getDescription() {
		return description;
	}

}
