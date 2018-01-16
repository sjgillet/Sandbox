package com.sandbox.model;

import java.util.List;

public class Castle {
	private long id; 
	private String name; 
	private String factionName; 
	private int wallStrength; 
	private List<Troop> garrison;
	
	public Castle(String name, String factionName, int wallStrength, List<Troop> garrison) {
		super();
		this.name = name;
		this.factionName = factionName;
		this.wallStrength = wallStrength;
		this.garrison = garrison;
	}
	public Castle(long id, String name, String factionName, int wallStrength, List<Troop> garrison) {
		super();
		this.id = id;
		this.name = name;
		this.factionName = factionName;
		this.wallStrength = wallStrength;
		this.garrison = garrison;
	}
	public Castle() {
		super();
	} 
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFactionName() {
		return factionName;
	}
	public void setFactionName(String factionName) {
		this.factionName = factionName;
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
	@Override
	public String toString() {
		return "Castle [id=" + id + ", name=" + name + ", factionName=" + factionName + ", wallStrength=" + wallStrength
				+ ", garrison=" + garrison + "]";
	}

	
	
}
