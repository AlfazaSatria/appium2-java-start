package Rey.page_objects;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class Homepage {
    @AndroidFindBy(id = "com.shopee.id.int:id/btn")
    protected WebElement shopeeAppButton;
    @AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_button")
    protected WebElement permissionAllowButton;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"WK_WELCOME_PAGE\")")
    protected WebElement welcomePackage;

    public void startedApps(){
        shopeeAppButton.click();
        welcomePackage.click();
    }
}
