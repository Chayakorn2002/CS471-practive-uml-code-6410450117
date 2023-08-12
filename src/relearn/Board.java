package relearn;

import java.util.ArrayList;

public class Board {
    private ArrayList<Square> squares;

    public Board(ArrayList<Square> squares) {
        this.squares = squares;
    }

    public Square getSquare(Square oldLoc, int fvTot) {
        /* logic of increasing the ahead square
           using the old location and total face value */
        return squares.get(fvTot);
    }
}
