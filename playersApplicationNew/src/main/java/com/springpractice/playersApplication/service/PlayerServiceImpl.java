package com.springpractice.playersApplication.service;

import com.springpractice.playersApplication.model.Player;
import com.springpractice.playersApplication.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class PlayerServiceImpl implements  PlayerService
{

    @Autowired
    PlayerRepository playerRepository;

    @Override
    public boolean savePlayers(List<Player> players) {
        List<Player> playersList = playerRepository.saveAll(players);
        if(!playersList.isEmpty()){
            return true;
        }
        return false;
    }



    @Override
    public List<Player> getAllPlayers() {
        return playerRepository.findAll();
    }

    @Override
    public Player getSinglePlayer(String playerId) {
        return playerRepository.findById(playerId).get();
    }

    @Override
    public Page<Player> getPlayer(int pageNumber, int pageSize) {

        long totalPlayers = playerRepository.count();
        int totalPages = (int) Math.ceil((double) totalPlayers/pageSize);

        if(pageNumber>=totalPages){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"Requested page exceeds total number of pages");
        }
        Pageable pageable = PageRequest.of(pageNumber, pageSize, Sort.by("nameLast"));
        return playerRepository.findAll(pageable);
    }

    @Override
    public long countPlayer() {
        return playerRepository.count();
    }

    @Override
    public Optional<Player> addPlayer(Player player) {

        return Optional.of(playerRepository.save(player));
    }

    @Override
    public boolean saveSinglePlayer(Player player) {
        if (playerRepository.findById(player.getPlayerId()).isPresent()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Player with the same playerId already exists.");
        }
        if (playerRepository.findByNameFirstAndNameLast(player.getNameFirst(), player.getNameLast()).isPresent()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Player with the same name already exists.");
        }
        playerRepository.save(player);
        return true;
    }
}
