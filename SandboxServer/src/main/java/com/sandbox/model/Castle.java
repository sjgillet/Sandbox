package com.sandbox.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;


@Entity
public class Castle {
	@Id
	@SequenceGenerator(name = "CASTLE_ID", sequenceName = "CASTLE_ID")
	@GeneratedValue(generator = "CASTLE_ID", strategy = GenerationType.SEQUENCE)
	@Column(name = "ID")
	private long id; 
	
	@Column
	private String name; 
	
	@Column
	private String factionName; 
	
	@Column
	private int wallStrength;
	
	@OneToMany
	@JoinTable(name = "GARRISON")
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
