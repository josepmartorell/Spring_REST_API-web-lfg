package com.crud.sql.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.sql.dto.Player;

public interface IPlayerDAO extends JpaRepository<Player, Integer>{

}
