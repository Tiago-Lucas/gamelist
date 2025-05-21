package com.projetogames.gamelist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetogames.gamelist.dto.GameMinDTO;
import com.projetogames.gamelist.entities.Game;
import com.projetogames.gamelist.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		return  result.stream().map(x -> new GameMinDTO(x)).toList();
	}
}
