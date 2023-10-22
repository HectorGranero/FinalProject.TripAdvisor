package com.qaminds.pages;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Slf4j
public class HomePage {
    private WebDriver driver;
    public Boolean isVisibleLogo(){
      log.debug("Validate is visible the logo in the home page");
      return logo.isEnabled();
    }
    public String getTextOptionHotels(){
        log.debug("Validate the option is: Hotels");
        return optionHotels.getText();
    }

    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    @FindBy(css = "div.pCeGb.u")
    public WebElement logo;
    @FindBy(css = "button:nth-child(2) > span > a")
    public WebElement optionHotels;

}
