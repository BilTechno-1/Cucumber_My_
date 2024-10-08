package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.channels.InterruptedByTimeoutException;

public class GWD { // Genel Web Driver
    private static WebDriver driver;

    public static WebDriver getDriver()
    {
        if (driver == null) //hiç oluşturulmamış ise
            driver= new ChromeDriver();

        // eğer zaten oluşmuşsa önceden oluşmuş driver ı gönder
        return driver;
}

public static void quitDriver(){
        //test sonucu ekranda beklesin diye koyuyoruz
    try {
        Thread.sleep(5000);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }

    if (driver != null)
    {
        driver.quit();
        driver=null;

}
}
