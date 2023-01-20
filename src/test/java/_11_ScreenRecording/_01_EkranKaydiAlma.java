package _11_ScreenRecording;

import Utils.BaseStaticDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class _01_EkranKaydiAlma extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://opensource-demo.orangehrmlive.com/");

        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("Yaşar");
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("DdDdDd");
        WebElement btnLogin = driver.findElement(By.cssSelector("button[type='submit']"));
        btnLogin.click();

        List<WebElement> spanMessage = driver.findElements(By.cssSelector("p[class$='oxd-alert-content-text']"));


        if (spanMessage.size() > 0) {

            LocalDateTime date = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yy-hh.mm.ss a");

                            //Ekran görünütüsü alalım
            TakesScreenshot ts = (TakesScreenshot) driver;              // 1.Aşama ekran görünütüsü alma değişkenini tanımladım
            File hafizadakiHali = ts.getScreenshotAs(OutputType.FILE);  // 2.Aşama Saklama tipi seçildi (Dosya), data(Veritabanı) (Byte)

            // hafizadakiHali -> dosya olarak(jpg,png,bmp) kaydedeceğiz.

            try {
                FileUtils.copyFile(hafizadakiHali, new File("target/FailedScreenShots/" + date.format(formatter) + ".png"));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }


            // hafızadaki ekranDosyasi nı al bunu verdiğim yola ve isme kaydet.
            // jpg,bmp,gif ..
            // sistemden tarihi okuyabiliyormuyduk
            // yılaygunsaatdaksan
            // TODO : Ödev: buradaki dosya adını zamana bağlı hale getiriniz ki hep üstüne kaydetmesin
            // mesala 20210526111201.jpg  gib...
        }

        BekleKapat();

    }
}
