package Day17;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        String[] chess = new String[8];
        ChessPiece bishop_white = ChessPiece.BISHOP_WHITE;
        ChessPiece rook_black = ChessPiece.ROOK_BLACK;

        for (int i = 0; i < chess.length; i++) {
            chess[i] = bishop_white.getSymbol();
            if (i >= 4) {
                chess[i] = rook_black.getSymbol();
            }
        }
        System.out.print(Arrays.toString(chess));
    }
}
