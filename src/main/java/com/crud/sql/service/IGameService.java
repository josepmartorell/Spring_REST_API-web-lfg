package com.crud.sql.service;

import java.util.List;

import com.crud.sql.dto.Game;

public interface IGameService {
	//CRUD methods
	public List<Game> listGames();	
	public Game saveGame(Game game);	
	public Game gameXID(int id);
	public Game updateGame(Game game);	
	public void eliminateGame(int id);

}
