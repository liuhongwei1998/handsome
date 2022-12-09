package com.junzhi.leetcode.EveryDayQuestion;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class lc1780 {
  public static void main(String[] args) {
    //
    System.out.println(checkPowersOfThree(21));
  }

  public static boolean checkPowersOfThree(int n) {
    TreeSet<Integer> set = new TreeSet<>();
    Set<Integer> douset = new HashSet<>();
    int base = 3;
    set.add(1);
    while (base < (int) 1e7 + 8) {
      set.add(base);
      base *= 3;
    }
    while (n > 0) {
      Integer num = set.floor(n);
      if (douset.contains(num)) return false;
      douset.add(num);
      if (num > n) return false;
      n -= num;
      if (n == 0) return true;
    }
    return false;
  }
}
