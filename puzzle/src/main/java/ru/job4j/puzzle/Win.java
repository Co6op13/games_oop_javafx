package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = false;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 1 && (checkVertical(board, i) || checkHorizontal(board, i))) {
                    rsl = true;
                    break;
            }
        }
        return rsl;
    }

    public static boolean checkVertical(int[][] board, int column) {
        boolean result = true;
        for (int row = 0; row < board.length; row++) {
            if (board [row][column] != 1) {
                result = false;
                break;
            }
        }
        return result;
    }
    public static boolean checkHorizontal(int[][] board, int row) {
        boolean result = true;
        for (int column = 0; column < board[row].length; column++) {
            if (board [row][column] != 1) {
                result = false;
                break;
            }
        }
        return result;
    }

}
