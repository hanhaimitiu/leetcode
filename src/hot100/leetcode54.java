package hot100;

import java.util.ArrayList;
import java.util.List;

public class leetcode54 {

    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> list = new ArrayList<>();
        if (matrix == null || matrix.length == 0) return list;
        int row = matrix.length, col = matrix[0].length;
        boolean[][] flag = new boolean[row][col];
        int current = 0;
        int target = row * col;
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}}; // 右下左上
        int current_index = 0;
        int i = 0, j = 0;
        while (current < target) {
            list.add(matrix[i][j]);
            flag[i][j] = true;
            current++;
            int nextrow = i + directions[current_index][0];
            int nextcol = j + directions[current_index][1];
            //预测值需要修正
            if (nextrow < 0 || nextrow >= row || nextcol < 0 || nextcol >= col || flag[nextrow][nextcol]) {
                directions = (directions + 1) % 4;
            }
            i = i + directions[current_index][0];
            j = j + directions[current_index][1];
        }
        //0向右 i  j  -> i  j+1
        //1向下 i  j  -> i+1  j
        //2向左 i  j  -> i  j-1
        //3向上 i  j  -> i-  j
        return list;
    }
}
