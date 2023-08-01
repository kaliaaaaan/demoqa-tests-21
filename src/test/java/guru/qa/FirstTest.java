package guru.qa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Selenide.open;

public class FirstTest {

    @BeforeAll
    static void beforeAll() {
        System.out.println("BeforeAll");
//        Configuration.browser = "chrome";
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("    BeforeEach");
//        open("https://google.com");
    }

    @AfterEach
    void afterEach() {
        System.out.println("        AfterEach");
//        open("https://google.com");
    }

    @Test
    void firstTest() {
        System.out.println("            firstTest ()");
        Assertions.assertTrue(3 > 2);
    }

    @Test
    void secondTest() {
        System.out.println("            secondTest ()");
        Assertions.assertTrue(3 > 2);
    }

    @Test
    void thirdTest() {
        System.out.println("            thirdTest ()");
        Assertions.assertTrue(3 > 2);
    }
}
