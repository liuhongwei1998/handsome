package com.junzhi.leetcode.EveryDayQuestion;


public class lc1754 {
    public static void main(String[] args) {
        lc1754 t = new lc1754();
        System.out.println(t.largestMerge("cabaa", "bcaaa"));
    }

    public java.lang.String largestMerge(String word1, String word2) {
     StringBuilder ans = new StringBuilder();
     int i = 0 , j = 0 ;
     while( i < word1.length() || j < word2.length()) {
         if(i < word1.length() && word1.substring(i).compareTo(word2.substring(j)) > 0){
             ans.append(word1.charAt(i));
             i++;
         }else{
             ans.append(word2.charAt(j));
             j++;
         }
     }
     return ans.toString();
    }
}
