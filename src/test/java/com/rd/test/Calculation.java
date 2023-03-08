package com.rd.test;


import org.springframework.stereotype.Component;

@Component
public class Calculation {

    public int findProduct(int x, int y , int z){

        return x*y*z;
    }

    public int findSum(int x, int y){

        return x+y;
    }

    public Boolean compareNums(int x, int y){

        return x==y;
    }
}
