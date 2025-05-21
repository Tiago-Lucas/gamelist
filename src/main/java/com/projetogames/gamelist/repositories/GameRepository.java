package com.projetogames.gamelist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetogames.gamelist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>  {

}
