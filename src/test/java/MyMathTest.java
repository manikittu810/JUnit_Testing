import org.example.MyMath;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class MyMathTest {
    private MyMath myMath = new MyMath();
    @Test
    void ThreeLengthArray(){
        System.out.println(new MyMath().addition(new int[]{1,100}));
        assertEquals(101, new MyMath().addition(new int[]{1,100}));
        //absence of failure is a success
        //Test condition or assert

    }
    @Test
    void ZeroLengthArray(){
        System.out.println(new MyMath().addition(new int[]{0,0}));
        assertEquals(0, new MyMath().addition(new int[]{0,0}));
    }
}
