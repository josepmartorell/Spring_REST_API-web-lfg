package com.crud.sql.service;

import java.util.List;

import com.crud.sql.dto.Player;

public interface IPlayerService {
	//CRUD methods
	public List<Player> listPlayers();	
	public Player savePlayer(Player player);	
	public Player playerXID(int id);
	public Player updatePlayer(Player player);	
	public void eliminatePlayer(int id);

}
