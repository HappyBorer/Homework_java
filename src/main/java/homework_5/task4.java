package homework_5;

//На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга.

public class task4 {

  public static int[][] board = new int[8][8];

  public static void main(String[] args) {
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board.length; j++) {
        board[i][j] = 0;
      }
    }
    tryQueen(0);
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board.length; j++) {
        if(board[i][j] == -1){
          System.out.print("Q\t\t");
        }else {
          System.out.print(",\t\t");
        }
      }
      System.out.println();
    }
  }

  public static boolean tryQueen(int i) {
    boolean result = false;
    for (int j = 0; j < 8; j++) {
      if (board[i][j] == 0) {
        setQueen(i, j);
        if (i == 7) {
          result = true;
        } else if (!(result = tryQueen(i + 1))){
          resetQueen(i, j);
        }

      }
      if (result) {
        break;
      }
    }
    return result;
  }

  private static void resetQueen(int i, int j) {
    for (int k = 0; k < 8; k++) {
      --board[k][j];
      --board[i][k];
      int foo = j - i + k;
      if (foo >= 0 && foo < 8) {
        --board[k][foo];
      }
      foo = j + i - k;
      if (foo >= 0 && foo < 8) {
        --board[k][foo];
      }
    }
    board[i][j] = 0;
  }

  private static void setQueen(int i, int j) {
    for (int k = 0; k < 8; k++) {
      ++board[k][j];
      ++board[i][k];
      int foo = j - i + k;
      if (foo >= 0 && foo < 8) {
        ++board[k][foo];
      }
      foo = j + i - k;
      if (foo >= 0 && foo < 8) {
        ++board[k][foo];
      }
    }
    board[i][j] = -1;
  }

}
