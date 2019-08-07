package com.javademo.resources;



import org.junit.*;
import static org.assertj.core.api.Assertions.assertThat;


public class FiboTest {
    public void setup() {
    }

    @Test
    public void testFibonacci(){
        com.javademo.resources.Fibo test = new com.javademo.resources.Fibo();
        assertThat(test.getFibonacci(0)).isEqualTo(0);
        assertThat(test.getFibonacci(1)).isEqualTo(1);
        assertThat(test.getFibonacci(46)).isEqualTo(1836311903);

    }
}