package _11_ScreenRecording;

import Utils.BaseStaticDriver;
import org.openqa.selenium.Dimension;


public class _02_WindowSize extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.youtube.com/");

        driver.manage().window().maximize();// Ekranı tam hale getiriyor..
        Bekle(4);

        // Ekranı yeni ölçülere göre set etme
        Dimension dim=new Dimension(516,600);
        driver.manage().window().setSize(dim);

        BekleKapat();

    }
}
