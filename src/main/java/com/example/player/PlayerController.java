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

    PlayerService playerService = new PlayerService(); // Create an instance

    @GetMapping("/players")
    public List<Player> getPlayers() {
        return playerService.getPlayersData(); // Call instance method
    }
}


