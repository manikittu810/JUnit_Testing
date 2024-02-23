import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class MyAssertTest {
    List<String> todos = Arrays.asList("Aws","Azure","Gcp");
    @Test
    void test(){
        boolean test = todos.contains("Azure");
        boolean test1 = todos.contains("gcp");
        assertEquals(true,test);
        assertFalse(test1,"Error in the expected value");
        assertEquals(3,todos.size(),"Test failed");
        assertTrue(test,"test gone wrong");
        assertArrayEquals(new int[]{1,2},new int[]{1,2});
    }

    private void assertFasle() {
    }
}
