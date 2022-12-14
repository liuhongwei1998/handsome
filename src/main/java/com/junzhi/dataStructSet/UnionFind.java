package com.junzhi.dataStructSet;

public class UnionFind {
  private int[] rank; // rank[i]表示以i为根的集合所表示的树的层数
  private int[] parent; // parent[i]表示第i个元素所指向的父节点
  private int count; // 数据个数

  // 初始化
  public UnionFind(int count) {
    rank = new int[count];
    parent = new int[count];
    this.count = count;
    for (int i = 0; i < count; i++) {
      // 每一个parent[i]指向自己，表示每一个元素自己组成一个集合
      parent[i] = i;
      rank[i] = 1;
    }
  }

  // 查找过程，查询元素p所对应的集合编号
  // O（h）复杂度，h为树的高度
  private int find(int p) {
    assert (p >= 0 && p < count);
    while (p != parent[p]) p = parent[p];
    return p;
  }

  // 判断p和q是否属于同一个集合
  // O（h）复杂度，h为树的高度
  public boolean isConnected(int p, int q) {
    return find(p) == find(q);
  }

  // 合并p和q所属的集合
  // O（h）复杂度，h为树的高度
  public void unionElements(int p, int q) {
    int pRoot = find(p);
    int qRoot = find(q);
    if (pRoot == qRoot) return;
    if (rank[pRoot] < rank[qRoot]) parent[pRoot] = qRoot;
    else if (rank[pRoot] > rank[qRoot]) parent[qRoot] = pRoot;
    else {
      parent[pRoot] = qRoot;
      rank[qRoot] += 1;
    }
  }
}
