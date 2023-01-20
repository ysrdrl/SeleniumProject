package _01_HomeWork._04_Test;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.text.DecimalFormat;

public class Test extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://testsheepnz.github.io/BasicCalculator.html");
        int[] intArray = new int[2];
        for (int i = 0; i < intArray.length; i++) {

            intArray[i] = (int) (Math.random() * ( 100 - 1 )) + 1;

        }
        WebElement firstNumber = driver.findElement(By.id("number1Field"));
        WebElement secondNumber = driver.findElement(By.id("number2Field"));
        WebElement operation = driver.findElement(By.id("selectOperationDropdown"));
        WebElement calculate= driver.findElement(By.id("calculateButton"));
        WebElement answer= driver.findElement(By.id("numberAnswerField"));
        Select ddMenu = new Select(operation);

        for (int p = 0; p < 5; p++) {

            for (int i = 1; i < 5; i++) {
                firstNumber.clear();
                firstNumber.sendKeys(Integer.toString(intArray[0]));
                secondNumber.clear();
                secondNumber.sendKeys(Integer.toString(intArray[1]));
                ddMenu.selectByIndex(i);
                calculate.click();
                getWait().until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("img[src='img/waiting.gif']")));

                switch (i) {
                    case 1:
                        int fark = intArray[0] - intArray[1];
                        driver.findElement(By.id("numberAnswerField"));
                        Assert.assertEquals(answer.getAttribute("value"), Integer.toString(fark));
                        break;
                    case 2:
                        int carpim = intArray[0] * intArray[1];
                        driver.findElement(By.id("numberAnswerField"));
                        Assert.assertEquals(answer.getAttribute("value"), Integer.toString(carpim));
                        break;
                    case 3:

                        double bolum = intArray[0] / intArray[1];
                        driver.findElement(By.id("numberAnswerField"));

                        break;
                    case 4:
                        String toplam = Integer.toString(intArray[0]) + Integer.toString(intArray[1]);
                        driver.findElement(By.id("numberAnswerField"));
                        Assert.assertEquals(answer.getAttribute("value"), toplam);
                        break;
                }
            }
        }

        BekleKapat();
    }
}
