package Day17;

public class Task2 {
    public static void main(String[] args) {
        ChessPiece kingWhite = ChessPiece.KING_WHITE;
        ChessPiece kingBlack = ChessPiece.KING_BLACK;
        ChessPiece queenWhite = ChessPiece.QUEEN_WHITE;
        ChessPiece queenBlack = ChessPiece.QUEEN_BLACK;
        ChessPiece rookWhite = ChessPiece.ROOK_WHITE;
        ChessPiece rookBlack = ChessPiece.ROOK_BLACK;
        ChessPiece bishopWhite = ChessPiece.BISHOP_WHITE;
        ChessPiece bishopBlack = ChessPiece.BISHOP_BLACK;
        ChessPiece knightWhite = ChessPiece.KNIGHT_WHITE;
        ChessPiece knightBlack = ChessPiece.KNIGHT_BLACK;
        ChessPiece pawnWhite = ChessPiece.PAWN_WHITE;
        ChessPiece pawnBlack = ChessPiece.PAWN_BLACK;
        ChessPiece empty = ChessPiece.EMPTY;

        String[][] board = new String[8][8];

        board[0][0] = rookBlack.getSymbol();
        board[0][5] = rookBlack.getSymbol();
        board[0][6] = kingBlack.getSymbol();

        board[1][1] = rookWhite.getSymbol();
        board[1][4] = pawnBlack.getSymbol();
        board[1][5] = pawnBlack.getSymbol();

        board[2][0] = pawnBlack.getSymbol();
        board[2][2] = knightBlack.getSymbol();
        board[2][6] = pawnBlack.getSymbol();

        board[3][0] = queenBlack.getSymbol();
        board[3][3] = bishopWhite.getSymbol();

        board[4][3] = bishopBlack.getSymbol();
        board[4][4] = pawnWhite.getSymbol();

        board[5][4] = bishopWhite.getSymbol();
        board[5][5] = pawnWhite.getSymbol();

        board[6][0] = pawnWhite.getSymbol();
        board[6][3] = queenWhite.getSymbol();
        board[6][5] = pawnWhite.getSymbol();
        board[6][7] = pawnWhite.getSymbol();

        board[7][5] = rookWhite.getSymbol();
        board[7][6] = kingWhite.getSymbol();





        for (int i = 0; i<board.length;i++){
            for(int j = 0; j< board.length; j++){
                if(board[i][j]==null){
                    board[i][j] = empty.getSymbol();
                }
            }
        }
        ChessBoard chessBoard = new ChessBoard(board);
        chessBoard.print();
    }
}
