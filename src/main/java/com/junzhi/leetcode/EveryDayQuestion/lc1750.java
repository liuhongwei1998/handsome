package com.junzhi.leetcode.EveryDayQuestion;

public class lc1750 {
    public static void main(String[] args) {
        lc1750 t = new lc1750();
        System.out.println(t.minimumLength("cabaabac"));
    }
    public int minimumLength(String s) {
        int n = s.length();
        int l = 0 , r = n - 1 ;
        while(l < r) {
            char cl = s.charAt(l) , cr = s.charAt(r);
            if(cl != cr){
                break;
            }
            while(l < n && s.charAt(l) == cl){
                l++;
            }
            while(r >= 0 && s.charAt(r) == cr){
                r--;
            }
        }
        // 这里必须是 l > r 不可以是 l >= r,考虑到最后就剩一个字母，答案为1
        if(l > r) return 0;
        else return r -l+1;
    }
}
