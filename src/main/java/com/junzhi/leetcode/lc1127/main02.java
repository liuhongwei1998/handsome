package com.junzhi.leetcode.lc1127;

public class main02 {
  public static void main(String[] args) {
    //
    System.out.println(appendCharacters("coaching", "coding"));
  }

  public static int appendCharacters(String s, String t) {
    int slen = s.length(), tlen = t.length();
    int i = 0, j = 0;
    while (i < slen && j < tlen) {
      char chs = s.charAt(i), cht = t.charAt(j);
      if (chs == cht) {
        i++;
        j++;
      } else {
        i++;
      }
    }
    // tlen = 6 , i = 2
    if (j == tlen) return 0;
    else return tlen - j;
  }
}
