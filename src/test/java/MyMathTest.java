import org.example.MyMath;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class MyMathTest {
    @Test
    void test(){
        int []a={1,100};
        MyMath math = new MyMath();
        int result = math.addition(a);
        System.out.println(result);
        int expectedRes = 101;
        assertEquals(expectedRes,result);

        //absence of failure is a success
        //Test condition or assert

    }
}
