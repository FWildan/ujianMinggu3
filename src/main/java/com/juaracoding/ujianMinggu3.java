package com.juaracoding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

import java.util.concurrent.TimeUnit;

public class ujianMinggu3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\juaracoding\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        System.out.println("Open Browser");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://juice-shop.herokuapp.com/#/login");
        System.out.println("Open URL");


        // Dismiss
        driver.findElement(By.xpath("//*[@id=\"mat-dialog-0\"]/app-welcome-banner/div/div[2]/button[2]/span[1]/span")).click();

        // Username
        driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/app-login[1]/div[1]/mat-card[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[3]/input[1]")).sendKeys("fatullah18@gmail.com");

        // Password
        driver.findElement(By.name("password")).sendKeys("Wildan18@");

        delay(3);

        // btnLogin
        driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/app-login[1]/div[1]/mat-card[1]/div[1]/button[1]/span[1]")).click();

        String txtLogin = driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-search-result/div/div/div[1]/div[1]")).getText();
        System.out.println(txtLogin);
        if (txtLogin.equals("All Products")) {
            System.out.println("Passes");
        } else {
            System.out.println("Failed");
        }

        delay(3);



        // Add to Chart
        driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-search-result/div/div/div[2]/mat-grid-list/div/mat-grid-tile[1]/div/mat-card/div[2]/button/span[1]/span")).click();

        // Klik Keranjang
        driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-navbar/mat-toolbar/mat-toolbar-row/button[4]/span[1]/span[1]")).click();

        delay(5);
        driver.findElement(By.id("checkoutButton")).click();

        driver.findElement(By.xpath("//*[@id=\"card\"]/app-address/mat-card/div/button")).click();

        //Form Adress
        driver.findElement(By.xpath("//*[@id=\"mat-input-3\"]")).sendKeys("Indonesia");
        driver.findElement(By.xpath("//*[@id=\"mat-input-4\"]")).sendKeys("Wildan");
        driver.findElement(By.xpath("//*[@id=\"mat-input-5\"]")).sendKeys("5363445635");
        driver.findElement(By.xpath("//*[@id=\"mat-input-6\"]")).sendKeys("0156415656564");
        driver.findElement(By.xpath("//*[@id=\"address\"]")).sendKeys("Bekasi");
        driver.findElement(By.xpath("//*[@id=\"mat-input-8\"]")).sendKeys("Kali Malang Jakarta");
        driver.findElement(By.xpath("//*[@id=\"mat-input-9\"]")).sendKeys("Indonesia");
        driver.findElement(By.xpath("//*[@id=\"submitButton\"]")).click();


        driver.quit();

    }

    static void delay(long detik){
        try {
            Thread.sleep(detik*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}


