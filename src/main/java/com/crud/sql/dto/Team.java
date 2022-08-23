package com.crud.sql.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="team")
public class Team {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "name")
	private String name;
	
	@ManyToOne
    @JoinColumn(name="party_id")
    private Party party;

	/**
	 * void constructor
	 */
	public Team() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param name
	 * @param party
	 */
	public Team(int id, String name, Party party) {
		super();
		this.id = id;
		this.name = name;
		this.party = party;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the party
	 */
	public Party getParty() {
		return party;
	}

	/**
	 * @param party the party to set
	 */
	public void setParty(Party party) {
		this.party = party;
	}

	@Override
	public String toString() {
		return "Team [id=" + id + ", name=" + name + ", party=" + party + "]";
	}
	
	
	
	

}
