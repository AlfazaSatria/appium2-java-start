package Rey.page_objects;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class LoginPage {

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"No. Handphone/Email/Username\")")
    protected WebElement usernameField;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Password\")")
    protected WebElement passwordField;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.shopee.id.int:id/btnLogin\")")
    protected WebElement loginButton;

    public void login(String username, String password) {
        usernameField.click();
        usernameField.sendKeys(username);
        passwordField.click();
        passwordField.sendKeys(password);
        loginButton.click();
    }
}
