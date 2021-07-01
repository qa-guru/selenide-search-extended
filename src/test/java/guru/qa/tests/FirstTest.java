package guru.qa.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FirstTest {

    @BeforeAll
    static void beforeAll() {
        System.out.println("this is before all method!");
    }

    @BeforeEach
    void setUp() {
        System.out.println("this is before each method!");
    }

    @AfterEach
    void tearDown() {
        System.out.println("this is after each method!");
    }

    @Test
    void firstTest() {
        System.out.println("this is the first @test!");
        Assertions.assertTrue(true);
    }

    @Test
    void secondTest() {
        System.out.println("this is the second @test!");
        Assertions.assertTrue(true);
    }
}
