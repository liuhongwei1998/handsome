package com.junzhi.leetcode.EveryDayQuestion;

import java.util.HashSet;
import java.util.Set;

public class lc1805 {
  public static void main(String[] args) {
    //
    System.out.println(numDifferentIntegers("167278959591294"));
  }
  // 2022/12/06每日一题
  public static int numDifferentIntegers(String word) {
    char[] arr = word.toCharArray();
    int n = arr.length;
    Set<String> set = new HashSet<>();
    int l = 0, r = 0;
    for (int i = 0; i < n; i++) {
      if (!Character.isDigit(arr[i]) || arr[i] == '0') continue;
      l = i;
      r = i;
      while (r < n && Character.isDigit(arr[r])) {
        r++;
      }
      i = r;
      // parse num;
      set.add(word.substring(l, r));
    }
    return set.size();
  }
}
