package com.springpractice.playersApplication.rest;

import com.springpractice.playersApplication.model.Player;
import com.springpractice.playersApplication.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/api/players")
public class PlayerController
{

    @Autowired
    PlayerService playerService;

    @GetMapping("/getPlayers")
    public ResponseEntity<List<Player>> getPlayers(){
        List<Player> playerList = playerService.getAllPlayers();
        return new ResponseEntity<>(playerList, HttpStatus.OK);
    }

    @GetMapping("/{playerID}")
    public ResponseEntity<Player> getPlayerById(@PathVariable String playerID){
        return new ResponseEntity<>(playerService.getSinglePlayer(playerID), HttpStatus.OK);
    }

    @GetMapping("/getPlayersByPage")
    public ResponseEntity<Page<Player>> getPlayersByPage(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int size){
        Page<Player> playerList = playerService.getPlayer(page,size);
        return new ResponseEntity<>(playerList, HttpStatus.OK);
    }

    @PostMapping("/savePlayer")
    public ResponseEntity<String> addPlayer(@RequestBody Player player){
        if(playerService.saveSinglePlayer(player)){
            return new ResponseEntity<>("Player saved successfully", HttpStatus.CREATED);
        }else{
            return new ResponseEntity<>("Player already exists",HttpStatus.BAD_REQUEST);
        }
    }


}
