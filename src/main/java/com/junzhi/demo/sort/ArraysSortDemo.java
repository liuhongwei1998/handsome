package com.junzhi.demo.sort;

import java.util.Arrays;

public class ArraysSortDemo {

  // 排序示例
  public static void main(String[] args) {

    //
    int[][] arr = {{9, 8, 7}, {6, 7, 8}, {6, 8, 8}, {9, 8, 6}, {6, 8, 9}, {1, 2, 3}, {3, 2, 4}};
    for (int[] c : arr) {
      Arrays.sort(c);
    }

    System.out.println(Arrays.deepToString(arr));

    Arrays.sort(
        arr, (a, b) -> (a[0] != b[0] ? a[0] - b[0] : a[1] != b[1] ? a[1] - b[1] : a[2] - b[2]));

    System.out.println(Arrays.deepToString(arr));
  }
}
