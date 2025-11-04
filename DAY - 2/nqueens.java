import java.util.*;

class Solution {

    boolean isSafe(char[][] board, int n, int row, int col) {

        // Check row
        for (int i = 0; i < n; i++) {
            if (board[row][i] == 'Q')
                return false;
        }

        // Check column
        for (int i = 0; i < n; i++) {
            if (board[i][col] == 'Q')
                return false;
        }

        // Upper-left diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q')
                return false;
        }

        // Lower-right diagonal
        for (int i = row, j = col; i < n && j < n; i++, j++) {
            if (board[i][j] == 'Q')
                return false;
        }

        // Upper-right diagonal
        for (int i = row, j = col; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q')
                return false;
        }

        // Lower-left diagonal
        for (int i = row, j = col; i < n && j >= 0; i++, j--) {
            if (board[i][j] == 'Q')
                return false;
        }

        return true;
    }

    void backtrack(List<List<String>> ans, char[][] board, int n, int row) {
        if (row == n) {
            List<String> temp = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                temp.add(new String(board[i]));
            }
            ans.add(temp);
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isSafe(board, n, row, col)) {
                board[row][col] = 'Q';
                backtrack(ans, board, n, row + 1);
                board[row][col] = '.'; // backtrack
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];

        // initialize board with '.'
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        backtrack(ans, board, n, 0);
        return ans;

    }

    public static void main(String[] args) {
        Solution s = new Solution(); // Create an instance of the Solution class
        List<List<String>> final_res = new ArrayList<>();
        final_res = s.solveNQueens(4); // Call the method on the instance
        for(List<String> a : final_res)
        {
            for(String str : a)
            {
                System.out.println(str);
            }
            System.out.println();
        }
    }
}