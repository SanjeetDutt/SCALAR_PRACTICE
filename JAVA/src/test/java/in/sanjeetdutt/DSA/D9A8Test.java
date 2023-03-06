package in.sanjeetdutt.DSA;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

class D9A8Test {

    @Test
    public void testing (){

        D9A8 obj = new D9A8();

        Assertions.assertEquals(
                obj.solve(
                        new ArrayList<>(Arrays.asList(-533, -666, -500, 169, 724, 478, 358, -38, -536, 705, -855, 281, -173, 961, -509, -5, 942, -173, 436, -609, -396, 902, -847, -708, -618, 421, -284, 718, 895, 447, 726, -229, 538, 869, 912, 667, -701, 35, 894, -297, 811, 322, -667, 673, -336, 141, 711, -747, -132, 547, 644, -338, -243, -963, -141, -277, 741, 529, -222, -684, 35)),
                        48
                ),
                6253
        );
    }

    @Test
    public void testing1 (){

        D9A8 obj = new D9A8();

        Assertions.assertEquals(
                obj.solve(
                        new ArrayList<>(Arrays.asList(5, -2, 3 , 1, 2)),
                        3
                ),
                8
        );
    }

    @Test
    public void testing2 (){

        D9A8 obj = new D9A8();

        Assertions.assertEquals(
                obj.solve(
                        new ArrayList<>(Arrays.asList( 2, 3, -1, 4, 2, 1)),
                        4
                ),
                9
        );
    }

}