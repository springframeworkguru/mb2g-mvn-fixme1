package guru.springframework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JavaHelloWorldTest {

    @Test
    public void getHello() {
        JavaHelloWorld javaHelloWorld = new JavaHelloWorld();
        System.out.println("My Test Run ...");
        assertEquals("Hello World", javaHelloWorld.getHello());
    }
}