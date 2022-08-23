package com.crud.sql.service;

import java.util.List;

import com.crud.sql.dto.Party;


public interface IPartyService {
	//CRUD methods
	public List<Party> listParties();	
	public Party saveParty(Party party);	
	public Party partyXID(int id);
	public Party updateParty(Party party);	
	public void eliminateParty(int id);

}
