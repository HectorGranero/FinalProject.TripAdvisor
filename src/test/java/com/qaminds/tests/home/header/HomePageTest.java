package com.qaminds.tests.home.header;

import com.qaminds.pages.HomePage;
import com.qaminds.pages.Pages;
import com.qaminds.tests.BaseTest;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
public class HomePageTest extends BaseTest {

    HomePage hp = new HomePage(getDriver());
    @Test
    public void validateHomePage(){
        log.info("Step 1: Get the title of Home Page");
        String title = getDriver().getTitle();
        System.out.println("The title of the Home page is: " + title);
        log.info("Step 3: Validate the title is correct");
        assertThat(title).isEqualTo("Tripadvisor: más de mil millones de opiniones y aportes sobre hoteles, atracciones, restaurantes y más");
    }
    @Test
    public void validateVisibleLogo(){
        log.info("Step 1: Logo is visible in the home page");
        Boolean isLogoVisible = Pages.returnHomePage(getDriver()).isVisibleLogo();
        assertThat(isLogoVisible).isTrue();
    }
    @Test
    public void validateMenuOptionHotels(){
        log.info("Step 1: Validate the menu option: Hotels");
        assertThat(Pages.returnHomePage(getDriver()).getTextOptionHotels()).isEqualTo("Hoteles");
        log.info("Step 2: Click on the option Hotels");
    }
}
