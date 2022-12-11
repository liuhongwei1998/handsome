package com.junzhi.leetcode.lc1211;

import java.util.HashSet;
import java.util.Set;

public class main02 {
  public static void main(String[] args) {
    //
    int[] ar = {2, 3, 5, 6, 7};
    System.out.println(longestSquareStreak(ar));
  }

  public static int longestSquareStreak(int[] nums) {
    Set<Integer> set = new HashSet<>();
    for (int a : nums) {
      set.add(a);
    }
    int ret = -1;
    for (int a : nums) {
      int ans = 1;
      int cur = a * a;
      while (set.contains(cur)) {
        cur = cur * cur;
        ans++;
      }
      ret = Math.max(ret, ans);
    }
    if (ret == 1 || ret == -1) return -1;
    else return ret;
  }
}
