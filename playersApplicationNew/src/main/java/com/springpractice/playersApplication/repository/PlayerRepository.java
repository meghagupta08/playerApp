package com.springpractice.playersApplication.repository;

import com.springpractice.playersApplication.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PlayerRepository extends JpaRepository<Player, String> {
    //@Query(value="SELECT p FROM player p WHERE p.nameFirst=:nameFirst AND p.nameLast:=nameLast")
    Optional<Player> findByNameFirstAndNameLast(String nameFirst, String nameLast);
}
