package relearn;

import java.util.ArrayList;
import java.util.List;

public class MGame {
    private int roundCnt;
    private Die[] dice;
    private ArrayList<Player> players;
    private Board board;

    public void playGame(int N, Player[] players) {
        while (this.roundCnt < N) {
            this.playRound();
            for (int i = 0; i < players.length; i++) {
                players[i].takeTurn(this.dice);
            }
            this.roundCnt--;
        }
    }

    private void playRound() {

    }
}
