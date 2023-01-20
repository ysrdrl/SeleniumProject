package _04_DOMElementClick;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;


public class _01_DOMClickElement extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://www.htmlelements.com/demos/dropdownbutton/shadow-dom/");

        driver.switchTo().frame(0);

        WebElement shadowHost = driver.findElement(By.cssSelector("smart-ui-drop-down-button[class='smart-ui-component']"));
        SearchContext shadowRoot = shadowHost.getShadowRoot();
        WebElement shadowContent = shadowRoot.findElement(By.cssSelector("span[role='presentation']"));
        System.out.println(shadowContent.getText());
        shadowContent.click();


        BekleKapat();
    }
}
