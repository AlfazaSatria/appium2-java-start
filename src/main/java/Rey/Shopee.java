package Rey;

import Rey.page_objects.BottomBar;
import Rey.page_objects.LoginPage;
import Rey.page_objects.Homepage;
import Rey.page_objects.MePage;

public class Shopee extends TestInstrument {
    private LoginPage loginPage;
    private Homepage homePage;
    private BottomBar bottomBar;

    public Shopee() {
        loginPage = new LoginPage();
        homePage = new Homepage();
        bottomBar = new BottomBar();
    }

    public void login(String username, String password) {
        bottomBar.clickMeButton();
        loginPage.login(username, password);
    }

    public void startApps(){
        homePage.startedApps();
    }


}
