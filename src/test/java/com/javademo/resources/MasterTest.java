package com.javademo.resources;


import com.google.common.base.Optional;



import org.junit.*;
import static org.assertj.core.api.Assertions.assertThat;


public class MasterTest {
    public void setup() {
    }

    public void testFibonacci(){
        com.javademo.resources.Test test = new com.javademo.resources.Test();
        assertThat(test.getFibonacci(0)).isEqualTo(1);
        assertThat(test.getFibonacci(1)).isEqualTo(1);
        assertThat(test.getFibonacci(46)).isEqualTo(1836311903);

    }
}