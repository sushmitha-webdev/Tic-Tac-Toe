import java.util.Random;
import java.util.Scanner;

class TicTacToe {
    char[][] board;

    public TicTacToe() {
        board = new char[3][3];
        initBoard();
    }

    void initBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = ' ';
            }
        }
    }

    void dispBoard() {
        System.out.println("-------------");
        for (int i = 0; i < board.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    void placeMark(int row, int col, char mark) {
        if (row >= 0 && row <= 2 && col >= 0 && col <= 2) {
            board[row][col] = mark;
        } else {
            System.out.println("Invalid Position");
        }
    }

    boolean checkColWin() {
        for (int j = 0; j <= 2; j++) {
            if (board[0][j] != ' ' && board[0][j] == board[1][j] && board[1][j] == board[2][j]) {
                return true;
            }
        }
        return false;
    }

    boolean checkRowWin() {
        for (int i = 0; i <= 2; i++) {
            if (board[i][0] != ' ' && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                return true;
            }
        }
        return false;
    }

    boolean checkDiagWin() {
        if (board[0][0] != ' ' && board[0][0] == board[1][1] && board[1][1] == board[2][2]
                || board[0][2] != ' ' && board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
            return true;
        }
        return false;
    }

    boolean checkDraw() {
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}

abstract class Player {
    String name;
    char mark;
    TicTacToe game;

    Player(String name, char mark, TicTacToe game) {
        this.name = name;
        this.mark = mark;
        this.game = game;
    }

    abstract void makeMove();

    boolean isValidMove(int row, int col) {
        if (row >= 0 && row <= 2 && col >= 0 && col <= 2) {
            if (game.board[row][col] == ' ') {
                return true;
            }
        }
        return false;
    }
}

class HumanPlayer extends Player {

    HumanPlayer(String name, char mark, TicTacToe game) {
        super(name, mark, game);
    }

    void makeMove() {
        Scanner scan = new Scanner(System.in);
        int row;
        int col;

        do {
            System.out.println("Enter the row and col (0, 1 or 2):");
            row = scan.nextInt();
            col = scan.nextInt();
        } while (!isValidMove(row, col));

        game.placeMark(row, col, mark);
        scan.close();
    }
}

class AIPlayer extends Player {

    AIPlayer(String name, char mark, TicTacToe game) {
        super(name, mark, game);
    }

    void makeMove() {
        Random r = new Random();
        int row;
        int col;

        do {
            row = r.nextInt(3);
            col = r.nextInt(3);
        } while (!isValidMove(row, col));

        game.placeMark(row, col, mark);
        System.out.println("AI placed at: " + row + " " + col);
    }
}

public class LaunchGame {
    public static void main(String args[]) {
        TicTacToe t = new TicTacToe();
        HumanPlayer p1 = new HumanPlayer(""
        		+ "it's your", 'X', t);
        AIPlayer p2 = new AIPlayer("AI", 'O', t);

        Player cp = p1;

        while (true) {
            System.out.println(cp.name + "'s turn");
            cp.makeMove();
            t.dispBoard();

            if (t.checkColWin() || t.checkRowWin() || t.checkDiagWin()) {
                System.out.println(cp.name + " has won");
                break;
            } else if (t.checkDraw()) {
                System.out.println("Game is a draw");
                break;
            } else {
                if (cp == p1) {
                    cp = p2;
                } else {
                    cp = p1;
                }
            }
        }
    }
}
