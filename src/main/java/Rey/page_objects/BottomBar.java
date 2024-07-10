package Rey.page_objects;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class BottomBar {

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"tab_bar_button_home\")")
    protected WebElement homeButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"tab_bar_button_live_streaming\")")
    protected WebElement liveStreamingButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"tab_bar_button_video\")")
    protected WebElement videoButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"tab_bar_button_mall\")")
    protected WebElement mallButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"tab_bar_button_notification\")")
    protected WebElement notificationButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"tab_bar_button_me\")")
    protected WebElement meButton;

    public void clickHomeButton() {
        homeButton.click();
    }

    public void clickLiveStreamingButton() {
        liveStreamingButton.click();
    }

    public void clickVideoButton() {
        videoButton.click();
    }

    public void clickMallButton() {
        mallButton.click();
    }

    public void clickNotificationButton() {
        notificationButton.click();
    }

    public void clickMeButton() {
        meButton.click();
    }
}
