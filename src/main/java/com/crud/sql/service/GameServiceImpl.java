package com.crud.sql.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.sql.dao.IGameDAO;
import com.crud.sql.dto.Game;




@Service
public class GameServiceImpl implements IGameService{
	
	@Autowired
	IGameDAO iGameDAO;

	@Override
	public List<Game> listGames() {
		// TODO Auto-generated method stub
		return iGameDAO.findAll();
	}

	@Override
	public Game saveGame(Game game) {
		// TODO Auto-generated method stub
		return iGameDAO.save(game);
	}

	@Override
	public Game gameXID(int id) {
		// TODO Auto-generated method stub
		return iGameDAO.findById(id).get();
	}

	@Override
	public Game updateGame(Game game) {
		// TODO Auto-generated method stub
		return iGameDAO.save(game);
	}

	@Override
	public void eliminateGame(int id) {
		// TODO Auto-generated method stub
		iGameDAO.deleteById(id);
	}


	

}
