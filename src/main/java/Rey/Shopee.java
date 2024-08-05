package Rey;

import Rey.page_objects.BottomBar;
import Rey.page_objects.LoginPage;
import Rey.page_objects.Homepage;
import Rey.page_objects.MePage;

public class Shopee extends TestInstrument {
    private LoginPage loginPage;
    private Homepage homePage;
    private BottomBar bottomBar;
    private MePage mePage;

    public Shopee() {
        loginPage = new LoginPage();
        homePage = new Homepage();
        bottomBar = new BottomBar();
        mePage = new MePage();
    }

    public void login(String username, String password) {
        bottomBar.clickMeButton();
        mePage.clickSignInButton();
        loginPage.login(username, password);
    }

    public void startApps(){
        homePage.startedApps();
    }


}
