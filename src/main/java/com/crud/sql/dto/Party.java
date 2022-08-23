package com.crud.sql.dto;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="parties")
public class Party {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "startAt")
	private Date startAt;
	@Column(name = "finalAt")
	private Date finalAt;
	
	
	@OneToMany
    @JoinColumn(name="player_id")
    private List<Player> player;
	
	@OneToMany
    @JoinColumn(name="game_id")
    private List<Game> game;
	
	@OneToMany
    @JoinColumn(name="team_id")
    private List<Team> team;

	/**
	 * void constructor
	 */
	public Party() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param startAt
	 * @param finalAt
	 * @param player
	 * @param game
	 * @param team
	 */
	public Party(int id, Date startAt, Date finalAt, List<Player> player, List<Game> game, List<Team> team) {
		super();
		this.id = id;
		this.startAt = startAt;
		this.finalAt = finalAt;
		this.player = player;
		this.game = game;
		this.team = team;
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
	 * @return the startAt
	 */
	public Date getStartAt() {
		return startAt;
	}

	/**
	 * @param startAt the startAt to set
	 */
	public void setStartAt(Date startAt) {
		this.startAt = startAt;
	}

	/**
	 * @return the finalAt
	 */
	public Date getFinalAt() {
		return finalAt;
	}

	/**
	 * @param finalAt the finalAt to set
	 */
	public void setFinalAt(Date finalAt) {
		this.finalAt = finalAt;
	}

	/**
	 * @return the player
	 */
	public List<Player> getPlayer() {
		return player;
	}

	/**
	 * @param player the player to set
	 */
	public void setPlayer(List<Player> player) {
		this.player = player;
	}

	/**
	 * @return the game
	 */
	public List<Game> getGame() {
		return game;
	}

	/**
	 * @param game the game to set
	 */
	public void setGame(List<Game> game) {
		this.game = game;
	}

	/**
	 * @return the team
	 */
	public List<Team> getTeam() {
		return team;
	}

	/**
	 * @param team the team to set
	 */
	public void setTeam(List<Team> team) {
		this.team = team;
	}

	@Override
	public String toString() {
		return "Party [id=" + id + ", startAt=" + startAt + ", finalAt=" + finalAt + ", player=" + player + ", game="
				+ game + ", team=" + team + "]";
	}
	
	
	
	

}
