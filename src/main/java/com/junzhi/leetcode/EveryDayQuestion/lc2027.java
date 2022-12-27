package com.junzhi.leetcode.EveryDayQuestion;

public class lc2027 {
    public static void main(String[] args) {
        lc2027 lc = new lc2027();
        System.out.println(lc.minimumMoves("XXX"));
    }

    public int minimumMoves(String s) {
        int ans = 0 , n  = s.length() ,i  = 0;
        while(i < n) {
            if(s.charAt(i) == 'X'){
                ans++;
                i+=3;
            }else {
                i++;
            }
        }
        return ans;

    }
}
