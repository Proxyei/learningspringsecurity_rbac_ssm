package com.xywei.test;

import org.junit.Test;

import java.nio.charset.StandardCharsets;

public class UtOnly {
    @Test
    public void test() {
        byte[] bytes = "10086".getBytes(StandardCharsets.UTF_8);
        System.out.println(bytes);
        String s = new String(bytes);
        System.out.println(s);
    }

}
