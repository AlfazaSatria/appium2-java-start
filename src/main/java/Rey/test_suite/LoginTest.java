package Rey.test_suite;

import Rey.Shopee;
import Rey.TestInstrument;
import org.junit.jupiter.api.*;

public class LoginTest extends TestInstrument {

    @Test
    public void loginTest() {
        Shopee shopee = new Shopee();
        shopee.login("yyt.5", "Aaaaaaaa");

    }
}
