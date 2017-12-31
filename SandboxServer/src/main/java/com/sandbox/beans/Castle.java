package com.sandbox.beans;

import java.util.List;

public class Castle {
	
	private int castleId; 
	private String castleName; 
	private String faction; 
	private int wallIntegrity; 
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
	public int getWallIntegrity() {
		return wallIntegrity;
	}
	public void setWallIntegrity(int wallIntegrity) {
		this.wallIntegrity = wallIntegrity;
	}
	public List<Troop> getGarrison() {
		return garrison;
	}
	public void setGarrison(List<Troop> garrison) {
		this.garrison = garrison;
	}
	public Castle(int castleId, String castleName, String faction, int wallIntegrity, List<Troop> garrison) {
		super();
		this.castleId = castleId;
		this.castleName = castleName;
		this.faction = faction;
		this.wallIntegrity = wallIntegrity;
		this.garrison = garrison;
	}
	public Castle(String castleName, String faction, int wallIntegrity, List<Troop> garrison) {
		super();
		this.castleName = castleName;
		this.faction = faction;
		this.wallIntegrity = wallIntegrity;
		this.garrison = garrison;
	}
	public Castle() {
		super();
	}
	@Override
	public String toString() {
		return "Castle [castleId=" + castleId + ", castleName=" + castleName + ", faction=" + faction
				+ ", wallIntegrity=" + wallIntegrity + ", garrison=" + garrison + "]";
	} 
	
	
	
	

}
