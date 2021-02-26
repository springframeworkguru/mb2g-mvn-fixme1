package guru.springframework;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by jt on 2018-12-15.
 */
public class Junit5Test {

    @Test
    void someFauxTest() {
        assertEquals("foo", "foo");
    }
}
