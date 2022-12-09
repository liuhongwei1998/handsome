package com.junzhi.leetcode.lc1204;

// 322场周赛
public class main01 {
  public static boolean isCircularSentence(String sentence) {
    String[] s = sentence.split(" ");
    int n = s.length;
    for (int i = 1; i < n; i++) {
      char prech = s[i - 1].charAt(s[i - 1].length() - 1);
      char curch = s[i].charAt(s[i].length() - 1);
      if (prech != curch) return false;
    }
    return s[s.length - 1].charAt(s[s.length - 1].length() - 1) == s[0].charAt(s[0].length() - 1);
  }
}
