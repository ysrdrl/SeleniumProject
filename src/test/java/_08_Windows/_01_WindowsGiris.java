package _08_Windows;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class _01_WindowsGiris extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://www.selenium.dev/");

        List<WebElement> linkler = driver.findElements(By.cssSelector("a[target='_blank']"));

        for (WebElement element : linkler
        ) {
            if (!element.getAttribute("href").contains("mailto")) {
                element.click();
            }
        }

        Set<String> windowsHandle=driver.getWindowHandles();

        for (String e:windowsHandle
             ) {
            System.out.println(e);
        }



BekleKapat();
    }
}
