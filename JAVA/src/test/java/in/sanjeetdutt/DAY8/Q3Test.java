package in.sanjeetdutt.DAY8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Q3Test {

    @Test
    public void test1(){

        Q3 q3 = new Q3();

        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        ArrayList<ArrayList<Integer>> B = new ArrayList<>();
        B.add(new ArrayList<>(Arrays.asList(0,3)));
        B.add(new ArrayList<>(Arrays.asList(1,2)));

        ArrayList<Long> answer = new ArrayList<>(Arrays.asList(10L,5L));

        Assertions.assertEquals(q3.rangeSum(A,B), answer);


    }



}
