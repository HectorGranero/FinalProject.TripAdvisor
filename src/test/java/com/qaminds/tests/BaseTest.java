package com.qaminds.tests;

import com.qaminds.utils.WebDriverConfiguration;
import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

@Slf4j
@Getter
@Setter
public class BaseTest {

    WebDriver driver;

    @BeforeTest
    public void beforeTest(){

        WebDriverManager.chromedriver().setup();

        setDriver(WebDriverConfiguration.getInstance(new ChromeDriver()).getDriver());

        getDriver().manage().deleteAllCookies();

        getDriver().manage().window().maximize();
    }

    public void navigateTo(String _url){
        String url = String.format("http://%s", _url);
        getDriver().get(url);

        if (!getDriver().getCurrentUrl().contains(_url)){
            log.error(String.format("El navegador no pudo navegar a la pagina solicitada."));
            throw new RuntimeException("No se encontro: " + url);
        }
    }
    @AfterTest
    public void afterTest(){
        log.info("Close browser");
        getDriver().quit();
    }
}
