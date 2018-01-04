package com.java8.training.basic.com.java8.training.model;

interface I1{
    default void sum(int x){

    }
}

interface I2{
    default void sum(int x){

    }

}
public class Exercise2 implements I1,I2{

    @Override
    public void sum(int x) {
        I1.super.sum(x);
    }
}


