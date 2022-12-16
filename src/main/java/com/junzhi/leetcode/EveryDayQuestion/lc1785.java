package com.junzhi.leetcode.EveryDayQuestion;

public class lc1785 {
  public static void main(String[] args) {
    //
    lc1785 t = new lc1785();
    int[] a = {0};
    int limit = 1, goal = -1000000000;
    System.out.println(t.minElements(a, limit, goal));
  }
  // v1 int溢出
  // v2 改为long
  //
  public int minElements(int[] nums, int limit, int goal) {
    // todo 不能这样改，因为这是将已经溢出的int值强转了long，还是错误的总数
    // long sum = (long) Arrays.stream(nums).sum();
    long sum = 0;
    for (int num : nums) {
      sum += num;
    }
    long tar = Math.abs(sum - goal);
    int ans = 0;
    while (tar != 0) {
      if (tar >= limit) {
        // 使用整除，不能每次这样减，goal最大值是1e9，如果diff为1e9，会超时
        ans += tar / limit;
        tar = tar % limit;
      } else {
        tar = 0;
        ans++;
      }
    }
    return ans;
  }
}
