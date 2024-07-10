package Rey;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;

public class TestInstrument {
    public static void main(String[] args) {
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("automationName", "UiAutomator2");
            capabilities.setCapability("deviceName", "emulator-5554");
            capabilities.setCapability("appPackage", "com.shopee.id.int");
            capabilities.setCapability("appActivity", "com.shopee.app.ui.home.HomeActivity_");
            URL appiumServerURL = new URL("http://127.0.0.1:4723/");
            AndroidDriver driver = new AndroidDriver(appiumServerURL, capabilities);





        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
