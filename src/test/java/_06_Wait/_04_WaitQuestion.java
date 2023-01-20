package _06_Wait;

import Utils.BaseStaticDriver;
import org.junit.rules.ExpectedException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class _04_WaitQuestion extends BaseStaticDriver {
    public static void main(String[] args) {

        /*
Senaryo
1-  https://www.demoblaze.com/index.html  siteyi açınız.
2- Samsung galaxy s6  linkine tıklayınız.
3- Sepete ekleyiniz.
4- Daha Sonra PRODUCT STORE yazısına tıklatarak ana ekrana geri dönününz
 */

        driver.get("https://www.demoblaze.com/index.html");

        WebElement samsungS6 = driver.findElement(By.linkText("Samsung galaxy s6"));
        samsungS6.click();

        WebElement addToCard = driver.findElement(By.linkText("Add to cart"));
        addToCard.click();

        getWait().until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();

        WebElement productStore = driver.findElement(By.id("nava"));
        productStore.click();

        BekleKapat();
    }
}
