package _10_RobotClass;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.event.KeyEvent;

public class _02_RobotInto extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("http://demo.guru99.com/test/upload/");
        Robot robot;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }

        for (int i = 0; i < 21; i++) {
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
            if (i == 20) {
                robot.keyPress(KeyEvent.VK_ENTER);
                robot.keyRelease(KeyEvent.VK_ENTER);
            }
        }
        Bekle(1);

        for (int i = 0; i < 9; i++) {
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
            Bekle(1);
            if (i == 8) {
                robot.keyPress(KeyEvent.VK_U);
                robot.keyRelease(KeyEvent.VK_U);
                robot.keyPress(KeyEvent.VK_ENTER);
                robot.keyRelease(KeyEvent.VK_ENTER);

            }
        }

        for (int i = 0; i < 4; i++) {
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
            if (i == 3) {
                robot.keyPress(KeyEvent.VK_ENTER);
                robot.keyRelease(KeyEvent.VK_ENTER);
            }
        }

        WebElement submitButton= driver.findElement(By.id("submitbutton"));
        submitButton.click();

//        WebElement assertt= driver.findElement(By.id("res"));
//        System.out.println(assertt.getAttribute("value"));
//        Assert.assertTrue(assertt.getText().contains("has been successfully uploaded."));


        BekleKapat();
    }
}
