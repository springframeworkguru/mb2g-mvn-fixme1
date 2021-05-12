package guru.springframework;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JavaHelloWorldTest {

    @Test
    public void getHello() {
        System.out.println("My JUnit-1 Run");
        JavaHelloWorld javaHelloWorld = new JavaHelloWorld();

        assertEquals("Hello World", javaHelloWorld.getHello());
    }
}