package _04_DOMElementClick;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

public class _03_DOMSendKeys extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("http://watir.com/examples/shadow_dom.html");

        WebElement shadowHost = driver.findElement(By.cssSelector("#shadow_host")); //#shadow-root (open)'in üzerindeki PARENT tag
        SearchContext shadowRoot = shadowHost.getShadowRoot();//Shadow elementleri SearchContext tipinde değişkene attık.


        WebElement shadowContent = shadowRoot.findElement(By.cssSelector("input[type='text']"));//Elementleri depoladığımız değişkenden istediğimiz elementi aldık.

        shadowContent.sendKeys("Yaşar");


        BekleKapat();
    }
}
