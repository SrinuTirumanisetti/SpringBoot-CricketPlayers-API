// Write your code here
package com.example.player;
import java.util.*;

public interface PlayerRepository{
    List<Player> getPlayersData();
    Player addPlayer(Player player);
    Player getPlayerData(int playerId);
    Player updatePlayerData(int playerId,Player player);
    void deletePlayerData(int playerId);
}