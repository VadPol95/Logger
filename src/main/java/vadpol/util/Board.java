package vadpol.util;

public class Board {
    public static int[][] giveBoard(){
        int [][] board = new int[3][3];
        board[0][0] = 0;//"ничья";
        board[0][1] = 1;//"игрок";
        board[0][2] = 2;//"компе";
        board[1][0] = 2;//"компе";
        board[1][1] = 0;//"ничья";
        board[1][2] = 1;//"игрок";
        board[2][0] = 1;//"игрок";
        board[2][1] = 2;//"компе";
        board[2][2] = 0;//"ничья";
        return board;
    }
}
