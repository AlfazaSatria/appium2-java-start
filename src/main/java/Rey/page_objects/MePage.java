package Rey.page_objects;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class MePage {
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"buttonSignup\")")
    protected WebElement signUpButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.ViewGroup\").instance(101)")
    protected WebElement signInButton;

    public void clickSignUpButton() {
        signUpButton.click();
    }

    public void clickSignInButton() {
        signInButton.click();
    }
}
