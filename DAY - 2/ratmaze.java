import java.util.*;

public class ratmaze {

    public static void helper(int[][] mat, int r, int c, String path, List<String> ans) {
        int n = mat.length;

        if (r < 0 || c < 0 || r >= n || c >= n || mat[r][c] <= 0) return;

        if (r == n - 1 && c == n - 1) {
            ans.add(path);
            return;
        }

        mat[r][c] = -1; // mark visited

        helper(mat, r + 1, c, path + "D", ans);
        helper(mat, r - 1, c, path + "U", ans);
        helper(mat, r, c - 1, path + "L", ans);
        helper(mat, r, c + 1, path + "R", ans);

        mat[r][c] = 1; // backtrack
    }

    public static void main(String[] args) {
        int[][] mat = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {0, 1, 1, 0},
            {1, 1, 1, 1}
        };

        List<String> ans = new ArrayList<>();

        if (mat[0][0] == 1)
            helper(mat, 0, 0, "", ans);

        for (String s : ans) {
            System.out.println(s);
        }
    }
}