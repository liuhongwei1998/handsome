package com.junzhi.leetcode.lc1204;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main02 {
  public static void main(String[] args) {
    //
    int[] a = {1, 1, 2, 3};
    System.out.println(dividePlayers(a));
  }

  public static long dividePlayers(int[] skill) {
    int sum = Arrays.stream(skill).sum();
    int n = skill.length;
    int average = sum / (n / 2); // 每个团队的值
    if (average * n / 2 != sum) return -1L;

    // 可以分
    Arrays.sort(skill);
    List<long[]> list = new ArrayList<>();
    int l = 0, r = n - 1;
    while (l <= r) {
      if (skill[l] + skill[r] != average) return -1;
      else {
        long[] a = new long[2];
        a[0] = skill[l];
        a[1] = skill[r];
        list.add(a);
        l++;
        r--;
      }
    }

    long ans = 0;
    int len = list.size();
    for (int i = 0; i < len; i++) {
      ans += list.get(i)[0] * list.get(i)[1];
    }

    return ans;
  }
}
