package in.sanjeetdutt.E002;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    public void test () {
        Assertions.assertEquals(Main.calculate(new int[]{2,7,5,10,8,4,6,11}, 5),5);
    }

    @Test
    void test2 (){
        Assertions.assertEquals(Main.calculate(new int[]{2,7,5,10,8,4,6,11,2,34,865,5,67,8,9,0,12,56,1,8,48,219,4,5,6,27,44}, 5),69);
    }

    @Test
    void test3 (){
        Assertions.assertEquals(Main.calculate(new int[]{2,7,5,10,8,4,6,11,9,3,9,15}, 6),22);
    }

    @Test
    void test4 (){
        Assertions.assertEquals(Main.calculate(new int[]{2,7,5,10,8,4,6,11,2,34,865,5,67,8,9,0,12,56,1,8,48,219,4,5,6,27,44}, 8),54);
    }


}
