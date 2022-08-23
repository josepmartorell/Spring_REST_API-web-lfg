package com.crud.sql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.sql.dto.Game;
import com.crud.sql.service.GameServiceImpl;



@RestController
@RequestMapping("/api")
public class GameController {
	
	@Autowired
	GameServiceImpl gameServiceImpl;
	
	@GetMapping("/games")
	public List<Game> listGames(){
		return gameServiceImpl.listGames();		
	}
	
	@PostMapping("/games")
	public Game saveGame(@RequestBody Game game) {
		return gameServiceImpl.saveGame(game);
	}
	
	@GetMapping("/games/{id}")
	public Game gameXID(@PathVariable(name="id") int id) {
		Game game_xid = new Game();
		game_xid = gameServiceImpl.gameXID(id);
		return game_xid;
	}
	
	@PutMapping("/games/{id}")
	public Game updateTeam(@PathVariable(name="id")int id,@RequestBody Game team) {
		Game game_selected = new Game();
		Game game_updated = new Game();
		
		game_selected = gameServiceImpl.gameXID(id);
		game_selected.setName(team.getName());
		game_selected.setParty(team.getParty());
		
		game_updated = gameServiceImpl.updateGame(game_selected);
		return game_updated;
	}
	
	@DeleteMapping("/games/{id}")
	public void eliminateGame(@PathVariable(name="id") int id) {
		gameServiceImpl.eliminateGame(id);
	}

}
