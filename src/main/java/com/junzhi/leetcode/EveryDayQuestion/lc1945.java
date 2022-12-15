package com.junzhi.leetcode.EveryDayQuestion;

public class lc1945 {
  public static void main(String[] args) {
    //
    lc1945 test = new lc1945();
    int c = test.getLucky("zbax", 2);
    System.out.println(c);
  }

  public int getLucky(String s, int k) {
    StringBuilder sb = new StringBuilder();
    for (char c : s.toCharArray()) {
      sb.append(c - 'a' + 1);
    }
    // 不能直接转换 字符串长度最长100，parseInt最多支持 20_0000_0000,超过长度
    return stringConvertNum(sb.toString(), k);
  }

  private int stringConvertNum(String sb, int k) {
    int cur = 0, ans = 0;
    while (k-- > 0) {
      cur = 0;
      for (int i = 0; i < sb.length(); i++) {
        cur += sb.charAt(i) - '0';
      }
      // 这里必须用ans，不能直接用cur，因为后面ans被更新为0了
      ans = cur;
      StringBuilder newsb = new StringBuilder();
      while (cur > 0) {
        newsb.append(cur % 10);
        // 此时cur被更新了，若不赋值给ans，则一直返回0
        cur /= 10;
      }
      sb = newsb.reverse().toString();
    }
    return ans;
  }

  private int convertNum(int num, int k) {
    while (k-- > 0) {
      int cur = 0;
      while (num != 0) {
        cur += num % 10;
        num /= 10;
      }
      num = cur;
    }
    return num;
  }
}
