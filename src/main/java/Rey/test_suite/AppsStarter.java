package Rey.test_suite;

import Rey.Shopee;
import Rey.TestInstrument;
import org.junit.jupiter.api.Test;

public class AppsStarter extends TestInstrument {

    @Test
    public void clickApps(){
        Shopee shopee = new Shopee();
        shopee.startApps();
    }
}
