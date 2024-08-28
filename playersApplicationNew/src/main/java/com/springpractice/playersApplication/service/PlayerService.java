package com.springpractice.playersApplication.service;


import com.springpractice.playersApplication.model.Player;
import org.springframework.data.domain.Page;


import java.util.List;
import java.util.Optional;

public interface PlayerService {

    boolean savePlayers(List<Player> players);
    List<Player> getAllPlayers();
    Player getSinglePlayer(String playerId);
    Page<Player> getPlayer(int pageNumber, int pageSize);
    long countPlayer();
    Optional<Player> addPlayer(Player player);
    boolean saveSinglePlayer(Player player);
}
