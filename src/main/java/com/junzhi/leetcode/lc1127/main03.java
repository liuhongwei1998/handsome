package com.junzhi.leetcode.lc1127;

import java.util.ArrayList;
import java.util.List;

public class main03 {
  static class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
      this.val = val;
    }

    ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
    }
  }

  public static void main(String[] args) {
    //
    ListNode node1 = new ListNode(5);
    ListNode node2 = new ListNode(2);
    ListNode node3 = new ListNode(13);
    ListNode node4 = new ListNode(2);
    ListNode node5 = new ListNode(8);
    node1.next = node2;
    node2.next = node3;
    node3.next = node4;
    node4.next = node5;
    removeNodes(node1);
  }

  public static ListNode removeNodes(ListNode head) {

    List<Integer> list = new ArrayList<>();
    ListNode cur = head;
    while (cur != null) {
      list.add(cur.val);
      cur = cur.next;
    }

    int n = list.size();
    List<Integer> ans = new ArrayList<>();
    ans.add(list.get(n - 1));
    int anssize = ans.size();
    for (int i = n - 2; i >= 0; i--) {
      if (list.get(i) >= ans.get(ans.size() - 1)) {
        ans.add(list.get(i));
      } else {
        continue;
      }
    }

    System.out.println(ans.toString());
    ListNode dumy = new ListNode(-1);
    ListNode pre = dumy;
    for (int i = ans.size() - 1; i >= 0; i--) {
      ListNode newNode = new ListNode(ans.get(i));
      System.out.println(newNode.val);
      pre.next = newNode;
      pre = newNode;
    }

    return dumy.next;
  }
}
