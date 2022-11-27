package com.junzhi.leetcode.lc1127;

public class main01 {
  public static void main(String[] args) {
    //
    System.out.println(pivotInteger(8));
  }

  public static int pivotInteger(int n) {
    int ans = 0;
    for (int i = 1; i <= n; i++) {
      int sum = 0;
      for (int j = 1; j <= i; j++) {
        sum += j;
      }
      int r = 0;
      for (int j = i; j <= n; j++) {
        r += j;
      }
      if (sum == r) {
        return i;
      }
    }
    return -1;
  }
}
