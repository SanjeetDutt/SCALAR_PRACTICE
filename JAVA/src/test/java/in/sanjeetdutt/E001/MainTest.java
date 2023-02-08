package in.sanjeetdutt.E001;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    public void testing (){
        Assertions.assertEquals(Main.calculate(3,20,11), 1);
        Assertions.assertEquals(Main.calculate(87,20000,97), 61);
    }



}
