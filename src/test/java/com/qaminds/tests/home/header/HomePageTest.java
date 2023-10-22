package com.qaminds.tests.home.header;

import com.qaminds.tests.BaseTest;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
public class HomePageTest extends BaseTest {

    @Test
    public void validateHomePage(){
        log.info("Step 1: Navigate to Tripadvisor.com.mx");
        navigateTo("tripadvisor.com.mx");
        log.info("Step 2: Get the title of Home Page");
        String title = getDriver().getTitle();
        System.out.println("The title of the Home page is: " + title);
        log.info("Step 3: Validate the title is correct");
        assertThat(title).isEqualTo("Tripadvisor: más de mil millones de opiniones y aportes sobre hoteles, atracciones, restaurantes y más");
    }
}
