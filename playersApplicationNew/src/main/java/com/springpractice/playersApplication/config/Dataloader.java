package com.springpractice.playersApplication.config;

import com.springpractice.playersApplication.model.Player;
import com.springpractice.playersApplication.repository.PlayerRepository;
import jakarta.annotation.PostConstruct;
import org.apache.tomcat.jni.Buffer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Configuration
public class Dataloader {

    @Autowired
    PlayerRepository playerRepository;


    @PostConstruct
    void initialize() throws IOException {
        loadCsvData();
    }

    void loadCsvData() throws IOException {
        String line;
        List<Player> players = new ArrayList<>();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try(BufferedReader br = new BufferedReader(new FileReader("src/main/resources/data/Player.csv"))){
            boolean firstLine = true;
            while((line = br.readLine())!=null){
                if (firstLine) {
                    firstLine = false;  // Skip the header line
                    continue;
                }


                String[] data = line.split(",");

                if (data.length < 23) {  // Adjust this number to match the exact number of columns expected
                    System.err.println("Skipping malformed line: " + line);
                    continue;  // Skip this line if it doesn't have enough columns
                }
                String playerId = data[0];
                String birthYear = data[1];
                String brithMonth = data[2];
                String birthDay = data[3];
                String birthCountry = data[4];
                String birthState = data[5];
                String birthCity = data[6];
                String deathYear = data[7];
                String deathMonth = data[8];
                String deathDay = data[9];
                String deathCountry = data[10];
                String deathState = data[11];
                String deathCity = data[12];
                String nameFirst = data[13];
                String nameLast = data[14];
                String nameGiven = data[15];
                String weight = data[16];
                String height = data[17];
                String bats = data[18];
                String throwCount = data[19];
                String debut = data[20];
                String finalGame = data[21];
                String retroId = data[22];
                String bbrefId = data[23];

                Player player = new Player(playerId, birthYear,brithMonth, birthDay, birthCountry, birthState,
                        birthCity, deathYear, deathMonth, deathDay, deathCountry,
                        deathState, deathCity, nameFirst, nameLast, nameGiven, weight,
                        height, bats, throwCount, debut, finalGame, retroId, bbrefId);
                players.add(player);

            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        playerRepository.saveAll(players);

    }

}
