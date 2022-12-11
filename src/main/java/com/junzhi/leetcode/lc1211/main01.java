package com.junzhi.leetcode.lc1211;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main01 {

  // 2022/12/11周赛
  public static void main(String[] args) {
    int[][] nums = {{1, 2, 4}, {3, 3, 1}};
    System.out.println(deleteGreatestValue(nums));
  }

  public static int deleteGreatestValue(int[][] grid) {
    int m = grid.length, n = grid[0].length;
    List<int[]> list = new ArrayList<>();
    for (int[] a : grid) {
      int[] cur = a.clone();
      Arrays.sort(cur);
      list.add(cur);
    }
    int ans = 0, max = -1;
    while (n-- > 0) {
      max = -1;
      for (int i = 0; i < m; i++) {
        max = Math.max(max, list.get(i)[n]);
      }
      ans += max;
    }
    return ans;
  }
}
