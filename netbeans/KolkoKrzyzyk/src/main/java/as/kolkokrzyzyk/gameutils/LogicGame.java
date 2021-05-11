package as.kolkokrzyzyk.gameutils;

import as.kolkokrzyzyk.Player;

public class LogicGame {
    private boolean player = false;
    private Player p1, p2;
    //True means circle
    private int [][] board = new int[3][3];
    /**
     * 
     * @param x 0 - bottom row
     * @param y 0 - first column
     * @param sign 1 means CIRCLE   2 means CROSS   0 start value
     * @return win or not TRUE means win
     */
    public boolean addPlayerMoveBoard(int x, int y, int sign){
        board[x][y] = sign;
        return isWinner();
    }
    
    private boolean isWinner(){
        boolean winner = false;
        //Sprawdzamy czy w wierszach są jednakowe znaki!
       for(int i=0;i<3;i++){
           if(board[0][i] == board[1][i] && board[0][i] == board[2][i] && board[0][i] >0){
                winner = true;
                break;
            }
       }
       //Sprawdzenie kolumn
       for(int i=0;i<3;i++){
           if(board[i][0] == board[i][1] && board[i][0] == board[i][2] && board[i][0] >0){
                winner = true;
                break;
            }
       }
       //Sprawdzenie na skos
        if(board[0][0] == board[1][1] && board[0][0] == board[2][2] && board[0][0] >0){
            winner = true;
        }
        if(board[0][2] == board[1][1] && board[0][2] == board[2][0] && board[0][2] >0){
            winner = true;
        }
        return winner;
    }
    
    @Override
    public String toString(){
        return "|"+board[0][2]+"|"+board[1][2]+"|"+board[2][2]+"|"+"\n"+
                "|"+board[0][1]+"|"+board[1][1]+"|"+board[2][1]+"|"+"\n"+
                "|"+board[0][0]+"|"+board[1][0]+"|"+board[2][0]+"|";
    }
    
}
