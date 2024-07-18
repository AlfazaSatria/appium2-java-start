package Rey;

import Rey.TestInstrument;
import Rey.page_objects.LoginPage;

public class Shopee extends TestInstrument {
    private LoginPage loginPage;

    public Shopee() {
        loginPage = new LoginPage();
    }

    public void login(String username, String password) {
        loginPage.login(username, password);
    }


}
