package _10_RobotClass;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_RobotIntoSendKeys extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("http://demo.guru99.com/test/upload/");

        WebElement chooseFile = driver.findElement(By.xpath("//input[@type='file']"));
        chooseFile.sendKeys("C:\\Users\\yasar\\UploadFileTest.xlsx");


        BekleKapat();
    }
}
