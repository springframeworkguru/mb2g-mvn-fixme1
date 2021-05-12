package guru.springframework;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by jt on 2018-12-15.
 */
public class Junit5Test {

    @Test
    void someFauxTest() {
        System.out.println("My JUnit-2 Run");
        assertEquals("foo", "foo");
    }
}
