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

import com.crud.sql.dto.Party;
import com.crud.sql.service.PartyServiceImpl;

@RestController
@RequestMapping("/api")
public class PartyController {
	
	@Autowired
	PartyServiceImpl partyServiceImpl;
	
	@GetMapping("/parties")
	public List<Party> listParties(){
		return partyServiceImpl.listParties();		
	}
	
	@PostMapping("/parties")
	public Party saveTeam(@RequestBody Party team) {
		return partyServiceImpl.saveParty(team);
	}
	
	@GetMapping("/parties/{id}")
	public Party partyXID(@PathVariable(name="id") int id) {
		Party party_xid = new Party();
		party_xid = partyServiceImpl.partyXID(id);
		return party_xid;
	}
	
	@PutMapping("/parties/{id}")
	public Party updateTeam(@PathVariable(name="id")int id,@RequestBody Party party) {
		Party party_selected = new Party();
		Party party_updated = new Party();
		
		party_selected = partyServiceImpl.partyXID(id);
		party_selected.setStartAt(party.getStartAt());
		party_selected.setFinalAt(party.getFinalAt());
		
		party_updated = partyServiceImpl.updateParty(party_selected);
		return party_updated;
	}
	
	@DeleteMapping("/parties/{id}")
	public void eliminateParty(@PathVariable(name="id") int id) {
		partyServiceImpl.eliminateParty(id);
	}

}
