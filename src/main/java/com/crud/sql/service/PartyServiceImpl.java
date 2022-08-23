package com.crud.sql.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.sql.dao.IPartyDAO;
import com.crud.sql.dto.Party;

@Service
public class PartyServiceImpl implements IPartyService{
	
	@Autowired
	IPartyDAO iPartyDAO;

	@Override
	public List<Party> listParties() {
		// TODO Auto-generated method stub
		return iPartyDAO.findAll();
	}

	@Override
	public Party saveParty(Party party) {
		// TODO Auto-generated method stub
		return iPartyDAO.save(party);
	}

	@Override
	public Party partyXID(int id) {
		// TODO Auto-generated method stub
		return iPartyDAO.findById(id).get();
	}

	@Override
	public Party updateParty(Party party) {
		// TODO Auto-generated method stub
		return iPartyDAO.save(party);
	}

	@Override
	public void eliminateParty(int id) {
		// TODO Auto-generated method stub
		iPartyDAO.deleteById(id);
	}
	

}
