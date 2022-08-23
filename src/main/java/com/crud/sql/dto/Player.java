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
@Table(name="player")
public class Player {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "alias")
	private String alias;
	
	@ManyToOne
    @JoinColumn(name="party_id")
    private Party party;

	/**
	 * void constructor
	 */
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param alias
	 * @param party
	 */
	public Player(int id, String alias, Party party) {
		super();
		this.id = id;
		this.alias = alias;
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
	 * @return the alias
	 */
	public String getAlias() {
		return alias;
	}

	/**
	 * @param alias the alias to set
	 */
	public void setAlias(String alias) {
		this.alias = alias;
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
		return "Player [id=" + id + ", alias=" + alias + ", party=" + party + "]";
	}
	
	


	
	
	

}
