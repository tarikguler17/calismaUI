import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.security.Key;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;

public class selenideTest {
    @Test
    public void tradingviewTest() throws InterruptedException {
        Configuration.browser = "Chrome";
        Configuration.startMaximized = true;

        open("https://www.tradingview.com");

        /* Ayni calisma xpath kodlari ile
        //$(By.xpath("//*[@class='tv-header__link tv-header__link--signin js-header__signin' ]")).click();
        //$(" .tv-header__link tv-header__link--signin js-header__signin").click();
        //$(By.xpath("//*[@class='tv-signin-dialog__social tv-signin-dialog__toggle-email js-show-email']")).click();
        //$(By.xpath("//*[@class='tv-control-material-input tv-signin-dialog__input tv-control-material-input__control' and @name='username']")).setValue("denemebootcamp");
        //$(By.xpath("//*[@class='tv-control-material-input tv-signin-dialog__input tv-control-material-input__control' and @name='username']")).setValue("denemebootcamp");
        //SelenideElement a = $(By.xpath("//*[@class = 'tv-control-material-input tv-signin-dialog__input tv-control-material-input__control' and @name='password']")).setValue("tarikbattalemrecan88");
        //a.sendKeys(Keys.ENTER);$("a.tv-header__link.tv-header__link--signin").click();
        //$(By.xpath("//*[@class='tv-header-search__input js-header-search__input']")).setValue("DOGEUSDT").sendKeys(Keys.ENTER);
        //$(By.xpath("//*[@class='button-1iktpaT1 size-m-2G7L7Qat intent-primary-1-IOYcbg appearance-stroke-12lxiUSM noOutline-d9Yp4qvi with-icon-yumghDr-']")).click();*/

        $("a.tv-header__link.tv-header__link--signin").click();
        $(".tv-signin-dialog__social.tv-signin-dialog__toggle-email").click();
        $("input[id*=email-signin__user-name-input]").setValue("denemebootcamp");
        Thread.sleep(1000);
        $("input[id*=email-signin__password-input]").setValue("tarikbattalemrecan88");
        Thread.sleep(1000);
        $("span.tv-button__loader").click();
        $(By.name("query")).setValue("DOGEUSDT").pressEnter();
        Thread.sleep(1000);
        $("a[class*=button-1iktpaT1]").click();
        Thread.sleep(5000);

    }
}
