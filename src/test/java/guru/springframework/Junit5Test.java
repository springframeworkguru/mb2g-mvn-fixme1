package guru.springframework;

//import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


/**
 * Created by jt on 2018-12-15.
 */
public class Junit5Test {

//    @Disabled
    @Test
    void someFauxTest() {
        JavaHelloWorld javaHelloWorld = new JavaHelloWorld();

        Assertions.assertEquals("Hello World", javaHelloWorld.getHello());
    }
}
