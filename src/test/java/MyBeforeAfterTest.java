import org.junit.jupiter.api.*;

public class MyBeforeAfterTest {

    @BeforeAll
    static  void BeforeAll(){
        System.out.println("BeforeAll");
    }

    @BeforeEach
    void BeforeEach(){
        System.out.println("BeforeEach");

    }
    @Test
    void test1(){
    System.out.println("test1");
    }
    @Test
    void test2(){
        System.out.println("test2");
    }
    @Test
    void test3(){
        System.out.println("test3");
    }
    @AfterEach
    void AfterEach(){
        System.out.println("AfterEach");
    }
    @AfterAll
    static void AfterAll(){
        System.out.println("AfterAll");
    }
}
