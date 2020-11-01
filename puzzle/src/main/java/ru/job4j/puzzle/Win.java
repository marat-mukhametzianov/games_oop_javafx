package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean result = false;

        //Moving through the diagonal and checking the existence of 1. If exists - checking column and row existence.
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 1) {
                result = columnExists(i, board) || rowExists(i, board);
                break;
            }
        }
        return result;
    }

    //The indexOfOne is the marker of the cell in the diagonal containing 1
    private static boolean columnExists(int indexOfOne, int[][] board) {
        boolean result = true;

        //Moving through the array. If at least one cell value is not 1 then to return false and stop checking.
        // Otherwise, the true will be returned.
        for (int i = 0; i < board.length; i++) {
            if (board[i][indexOfOne] != 1) {
                result = false;
                break;
            }
        }
        return result;
    }

    //The indexOfOne is the marker of the cell in the diagonal containing 1
    private static boolean rowExists(int indexOfOne, int[][] board) {
        boolean result = true;

        //Moving through the array. If at least one cell value is not 1 then to return false and stop checking.
        // Otherwise, the true will be returned.
        for (int i = 0; i < board.length; i++) {
            if (board[indexOfOne][i] != 1) {
                result = false;
                break;
            }
        }
        return result;
    }
}
