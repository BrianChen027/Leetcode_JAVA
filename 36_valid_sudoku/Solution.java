public class Solution {
    public static boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    if (!isValid(board, i, j, board[i][j])) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    public static boolean isValid(char[][] board, int i, int j, char c) {
        for (int k = 0; k < 9; k++) {
            if (board[i][k] == c && k != j) {
                return false;
            }
            if (board[k][j] == c && k != i) {
                return false;
            }
            if (board[3 * (i / 3) + k / 3][3 * (j / 3) + k % 3] == c && 3 * (i / 3) + k / 3 != i && 3 * (j / 3) + k % 3 != j) {
                return false;
            }
        }
        return true;
    }
}
    