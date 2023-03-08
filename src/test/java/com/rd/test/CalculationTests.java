package com.rd.test;


import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
public class CalculationTests {


    @Autowired
    private Calculation calculation;

    @Test
    @Disabled
    public void testSum(){

        int actualResult = calculation.findSum(2,4);

//        int expectedResult = 6;

        int expectedResult = 7;


        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    public void testProduct(){

        int actualR = calculation.findProduct(2,3,6);

//        int expectedR = 316;

        int expectedR = 36;

        assertThat(actualR).isEqualTo(expectedR);
    }

    @Test
    public void findComparison(){

        Boolean acutalR = calculation.compareNums(5,5);

//        Boolean acutalR = calculation.compareNums(5,2);


        assertThat(acutalR).isTrue();

    }
}
