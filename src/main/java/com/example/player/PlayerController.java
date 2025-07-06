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

    @GetMapping("/players/{playerId}")
    public Player getPlayer(@PathVariable("playerId") int playerId) {
        return playerService.getPlayerData(playerId);
    }

    @PostMapping("/players")
    public Player addPlayer(@RequestBody Player player) {
        return playerService.addPlayer(player);
    }

    @PutMapping("/players/{playerId}")
    public Player updatePlayer(@PathVariable("playerId") int playerId, @RequestBody Player player) {
        return playerService.updatePlayerData(playerId, player);
    }

    @DeleteMapping("/players/{playerId}")
    public void deletePlayer(@PathVariable("playerId") int playerId) {
        playerService.deletePlayerData(playerId);
    }
}
