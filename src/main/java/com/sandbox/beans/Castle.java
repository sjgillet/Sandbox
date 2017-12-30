package com.sandbox.beans;

import java.util.List;

public class Castle {

	private int castleId; 
	
	private String castleName; 
	
	private String faction; 
	
	private int wallStrength; 
	
	private List<Troop> garrison;

	public int getCastleId() {
		return castleId;
	}

	public void setCastleId(int castleId) {
		this.castleId = castleId;
	}

	public String getCastleName() {
		return castleName;
	}

	public void setCastleName(String castleName) {
		this.castleName = castleName;
	}

	public String getFaction() {
		return faction;
	}

	public void setFaction(String faction) {
		this.faction = faction;
	}

	public int getWallStrength() {
		return wallStrength;
	}

	public void setWallStrength(int wallStrength) {
		this.wallStrength = wallStrength;
	}

	public List<Troop> getGarrison() {
		return garrison;
	}

	public void setGarrison(List<Troop> garrison) {
		this.garrison = garrison;
	}

	public Castle(int castleId, String castleName, String faction, int wallStrength, List<Troop> garrison) {
		super();
		this.castleId = castleId;
		this.castleName = castleName;
		this.faction = faction;
		this.wallStrength = wallStrength;
		this.garrison = garrison;
	}

	public Castle(String castleName, String faction, int wallStrength, List<Troop> garrison) {
		super();
		this.castleName = castleName;
		this.faction = faction;
		this.wallStrength = wallStrength;
		this.garrison = garrison;
	}

	public Castle() {
		super();
	}

	@Override
	public String toString() {
		return "Castle [castleId=" + castleId + ", castleName=" + castleName + ", faction=" + faction
				+ ", wallStrength=" + wallStrength + ", garrison=" + garrison + "]";
	} 
	
	
	

}
