package com.crud.sql.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.sql.dao.IPlayerDAO;
import com.crud.sql.dto.Player;

@Service
public class PlayerServiceImpl implements IPlayerService{

	@Autowired
	IPlayerDAO iPlayerDAO;

	@Override
	public List<Player> listPlayers() {
		// TODO Auto-generated method stub
		return iPlayerDAO.findAll();
	}

	@Override
	public Player savePlayer(Player player) {
		// TODO Auto-generated method stub
		return iPlayerDAO.save(player);
	}

	@Override
	public Player playerXID(int id) {
		// TODO Auto-generated method stub
		return iPlayerDAO.findById(id).get();
	}

	@Override
	public Player updatePlayer(Player player) {
		// TODO Auto-generated method stub
		return iPlayerDAO.save(player);
	}

	@Override
	public void eliminatePlayer(int id) {
		// TODO Auto-generated method stub
		iPlayerDAO.deleteById(id);
	}
	
	
}
