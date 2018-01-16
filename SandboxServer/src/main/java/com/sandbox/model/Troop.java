package com.sandbox.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TROOP")
public class Troop {
	@Id
	@SequenceGenerator(name = "TROOP_ID", sequenceName = "TROOP_ID")
	@GeneratedValue(generator = "TROOP_ID", strategy = GenerationType.SEQUENCE)
	@Column(name = "ID")
	private long id; 
	
	@Column(name = "TROOP_NAME")
	private String troopName;
	
	@Column(name = "SALUTE")
	private String saluteMsg;
	
	@Column(name = "STRENGTH")
	private int strength;
		
	

	public Troop() {
		super();
	}	
	public Troop(String troopName, String saluteMsg, int strength) {
		super();
		this.troopName = troopName;
		this.saluteMsg = saluteMsg;
		this.strength = strength;
	}
	public Troop(long id, String troopName, String saluteMsg, int strength) {
		super();
		this.id = id;
		this.troopName = troopName;
		this.saluteMsg = saluteMsg;
		this.strength = strength;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTroopName() {
		return troopName;
	}
	public void setTroopName(String troopName) {
		this.troopName = troopName;
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
	@Override
	public String toString() {
		return "Troop [id=" + id + ", troopName=" + troopName + ", saluteMsg=" + saluteMsg + ", strength=" + strength
				+ "]";
	} 
	
	
	
	
}
