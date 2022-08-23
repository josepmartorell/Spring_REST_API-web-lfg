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

import com.crud.sql.dto.Player;
import com.crud.sql.service.PlayerServiceImpl;

@RestController
@RequestMapping("/api")
public class PlayerController {
	
	@Autowired
	PlayerServiceImpl playerServiceImpl;
	
	@GetMapping("/players")
	public List<Player> listPlayers(){
		return playerServiceImpl.listPlayers();		
	}
	
	@PostMapping("/players")
	public Player savePlayer(@RequestBody Player player) {
		return playerServiceImpl.savePlayer(player);
	}
	
	@GetMapping("/players/{id}")
	public Player playerXID(@PathVariable(name="id") int id) {
		Player player_xid = new Player();
		player_xid = playerServiceImpl.playerXID(id);
		return player_xid;
	}
	
	@PutMapping("/players/{id}")
	public Player updatePlayer(@PathVariable(name="id")int id,@RequestBody Player player) {
		Player player_selected = new Player();
		Player player_updated = new Player();
		
		player_selected = playerServiceImpl.playerXID(id);
		player_selected.setAlias(player.getAlias());
		player_selected.setParty(player.getParty());
		
		player_updated = playerServiceImpl.updatePlayer(player_selected);
		return player_updated;
	}
	
	@DeleteMapping("/players/{id}")
	public void eliminateTeam(@PathVariable(name="id") int id) {
		playerServiceImpl.eliminatePlayer(id);
	}

}
