/*
 
* You can use the following import statements
 
 * import org.springframework.web.server.ResponseStatusException;
 * import org.springframework.http.HttpStatus;
 
 */

package com.example.player;
import com.example.player.PlayerRepository;
import java.util.*; 
import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;

public class PlayerService implements PlayerRepository {

    private static HashMap<Integer, Player> team = new HashMap<>();

    public PlayerService() {
        team.put(1, new Player(1, "Alexander", 5, "All-rounder"));
        team.put(2, new Player(2, "Benjamin", 3, "All-rounder"));
        team.put(3, new Player(3, "Michael", 18, "Batsman"));
        team.put(4, new Player(4, "William", 45, "Batsman"));
        team.put(5, new Player(5, "Joshua", 19, "Batsman"));
        team.put(6, new Player(6, "Daniel", 10, "Bowler"));
        team.put(7, new Player(7, "Matthew", 34, "Bowler"));
        team.put(8, new Player(8, "Samuel", 17, "Batsman"));
        team.put(9, new Player(9, "John", 1, "Bowler"));
        team.put(10, new Player(10, "Earnest", 2, "All-rounder"));
        team.put(11, new Player(11, "Bob", 25, "Batsman"));
    }
    int uniqueId = 12;

    @Override
    public List<Player> getPlayersData() {
        return new ArrayList<>(team.values());
    }
    @Override
    public Player addPlayer(Player player) {
        player.setPlayerId(uniqueId);
        team.put(uniqueId, player);
        uniqueId++;
        return player;
    }
    @Override
    public Player getPlayerData(int playerId){
        Player player = team.get(playerId);
        if(player==null){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        return player;
    }
    @Override
    public Player updatePlayerData(int playerId,Player player){
        Player existingPlayer = team.get(playerId);
        if(existingPlayer==null){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        else{
            existingPlayer.setPlayerName(player.getPlayerName());
            existingPlayer.setJerseyNumber(player.getJerseyNumber());
            existingPlayer.setRole(player.getRole());
        }
        return existingPlayer;
    }
}