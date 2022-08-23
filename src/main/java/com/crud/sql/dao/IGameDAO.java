package com.crud.sql.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.sql.dto.Game;

public interface IGameDAO extends JpaRepository<Game, Integer>{

}
