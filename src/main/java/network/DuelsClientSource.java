package network;

import common.source.GameSource;

public class DuelsClientSource implements GameSource {

	private static final long serialVersionUID = -482372584226448557L;
	private String description;

	public DuelsClientSource(String description) {
		super();
		this.description = description;
	}

	@Override
	public String getDescription() {
		return description;
	}

}
