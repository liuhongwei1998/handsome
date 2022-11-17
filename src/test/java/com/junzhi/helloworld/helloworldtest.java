package com.junzhi.helloworld;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class helloworldtest {

  @Test
  public void testSayHello() {
    helloworld helloworld = new helloworld();
    String res = helloworld.sayHello();
    assertEquals("Hello , World", res);
    System.out.println("测试通过");
  }
}
