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
    @GetMapping("/players/{playerId}")
    public Player getPlayer(@PathVariable("playerId") int playerId) {
        return playerService.getPlayerData(playerId);
    }
    @PutMapping("/players/{playerId}")
    public Player updatePlayer(@PathVariable("playerId") int playerId, @RequestBody Player player) {
        return playerService.updatePlayerData(playerId, player);
    }

}



