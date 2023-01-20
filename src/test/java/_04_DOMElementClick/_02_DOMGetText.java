package _04_DOMElementClick;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

public class _02_DOMGetText extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("http://watir.com/examples/shadow_dom.html");

        WebElement shadowHost = driver.findElement(By.cssSelector("#shadow_host"));
        SearchContext shadowRoot = shadowHost.getShadowRoot();

        WebElement shadowhost1 = shadowRoot.findElement(By.id("nested_shadow_host"));
        SearchContext shadowRoot1 = shadowhost1.getShadowRoot();

        WebElement shadowContent = shadowRoot1.findElement(By.cssSelector("#nested_shadow_content"));

        System.out.println(shadowContent.getText());

      Assert.assertEquals("nested text", shadowContent.getText());


        BekleKapat();
    }
}
