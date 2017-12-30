package com.sandbox.beans;

public class Troop {

	private int troopId; 
	
	private String name; 
	
	private String faction;
	
	private String saluteMsg; 
	
	private int strength;

	public int getTroopId() {
		return troopId;
	}

	public void setTroopId(int troopId) {
		this.troopId = troopId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFaction() {
		return faction;
	}

	public void setFaction(String faction) {
		this.faction = faction;
	}

	public String getSaluteMsg() {
		return saluteMsg;
	}

	public void setSaluteMsg(String saluteMsg) {
		this.saluteMsg = saluteMsg;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public Troop(int troopId, String name, String faction, String saluteMsg, int strength) {
		super();
		this.troopId = troopId;
		this.name = name;
		this.faction = faction;
		this.saluteMsg = saluteMsg;
		this.strength = strength;
	}

	public Troop() {
		super();
	}

	public Troop(String name, String faction, String saluteMsg, int strength) {
		super();
		this.name = name;
		this.faction = faction;
		this.saluteMsg = saluteMsg;
		this.strength = strength;
	}

	@Override
	public String toString() {
		return "Troop [troopId=" + troopId + ", name=" + name + ", faction=" + faction + ", saluteMsg=" + saluteMsg
				+ ", strength=" + strength + "]";
	} 
	
	
	
}
