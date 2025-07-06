// Write your code here
package com.example.player;
import java.util.*;

public interface PlayerRepository{
    List<Player> getPlayersData();
    Player addPlayer(Player player);
    Player getPlayerData(int playerId);
}