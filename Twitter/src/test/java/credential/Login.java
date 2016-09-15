package credential;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Created by a on 8/7/2016.
 */
public class Login extends CommonAPI {

    @Test
    public void submitLogin() throws InterruptedException{
        clickByCss(".Button.StreamsLogin.js-login");
        Thread.sleep(2000);
        typeByCss(".text-input.email-input.js-signin-email","iqbalchoudhury2@gmail.com");
      typeByXpath(".//*[@id='login-dialog-dialog']/div[2]/div[2]/div[2]/form/div[2]/input","Mangopeople1");
        Thread.sleep(2000);
        clickByXpath(".//*[@id='login-dialog-dialog']/div[2]/div[2]/div[2]/form/input[1]");
        Thread.sleep(3000);
        //clicking moments
       // clickByXpath(".//*[@id='global-actions']/li[2]/a/span[2]");

        Thread.sleep(3000);

    }
}
