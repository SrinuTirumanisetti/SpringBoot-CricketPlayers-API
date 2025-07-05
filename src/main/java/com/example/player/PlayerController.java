/*
 * You can use the following import statements
 * 
 * import org.springframework.web.bind.annotation.*;
 * import java.util.ArrayList;
 * 
 */

// Write your code here.
package com.example.player;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class PlayerController {

    PlayerService playerService = new PlayerService(); 

    @GetMapping("/players")
    public List<Player> getPlayers() {
        return playerService.getPlayersData(); 
    }
    @PostMapping("/players")
    public Player addPlayer(@RequestBody Player player){
        return playerService.addPlayer(player);
    }
}


