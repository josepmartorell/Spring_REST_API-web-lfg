package com.crud.sql.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.sql.dto.Party;

public interface IPartyDAO extends JpaRepository<Party, Integer>{

}
