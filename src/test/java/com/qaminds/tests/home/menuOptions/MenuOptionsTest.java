package com.qaminds.tests.home.menuOptions;

import com.qaminds.pages.Pages;
import com.qaminds.tests.BaseTest;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
public class MenuOptionsTest extends BaseTest {
    @Test
    public void validateMenuOptionSearchAll(){
        log.info("Step 1: Validate the menu option: Search All");
        assertThat(Pages.returnHomePage(getDriver()).getTextOptionSearchAll()).isEqualTo("Buscar todo");
        log.info("Step 2: Click on the option Search All");
        Pages.returnHomePage(getDriver()).onClickOptionSearchAll();
        log.info("Step 3: Validate the text in the text field of search in Search All");
        String textSearchAll = Pages.returnHomePage(getDriver()).getTitleSearch(getDriver());
        assertThat(textSearchAll).isEqualTo("Lugares para visitar, cosas que hacer, hoteles...");
    }

    @Test
    public void validateMenuOptionHotels() {
        log.info("Step 1: Validate the menu option: Hotels");
        assertThat(Pages.returnHomePage(getDriver()).getTextOptionHotels()).isEqualTo("Hoteles");
        log.info("Step 2: Click on the option Hotels");
        Pages.returnHomePage(getDriver()).onClickOptionHotels();
        log.info("Step 3: Validate the text in the text field of search in hotels");
        String textHotels = Pages.returnHomePage(getDriver()).getTitleSearch(getDriver());
        assertThat(textHotels).isEqualTo("Nombre del hotel o del destino");
    }
    @Test
    public void validateMenuOptionThinksForDo(){
        log.info("Step 1: Validate the menu option: Thinks for do");
        assertThat(Pages.returnHomePage(getDriver()).getTextOptionThinksForDo()).isEqualTo("Cosas que hacer");
        log.info("Step 2: Click on the option Thinks for do");
        Pages.returnHomePage(getDriver()).onClickOptionThinksForDo();
        log.info("Step 3: Validate the text in the text field of search in thinks for do");
        String textThinksForDo = Pages.returnHomePage(getDriver()).getTitleSearch(getDriver());
        assertThat(textThinksForDo).isEqualTo("Atracción, actividad o destino");
    }
    @Test
    public void validateMenuOptionRestaurant(){
        log.info("Step 1: Validate the menu option is: Restaurants");
        assertThat(Pages.returnHomePage(getDriver()).getTextOptionRestaurants()).isEqualTo("Restaurantes");
        log.info("Step 2: Click on the option Restaurants");
        Pages.returnHomePage(getDriver()).onClickOptionRestaurants();
        log.info("Step 3: Validate the text in the text field of search Restaurants");
        String textRestaurants = Pages.returnHomePage(getDriver()).getTitleSearch(getDriver());
        assertThat(textRestaurants).isEqualTo("Restaurante o destino");
    }
    @Test
    public void validateMenuOptionVacationRentals(){
        log.info("Step 1: Validate the menu option is: Vacation Rentals");
        assertThat(Pages.returnHomePage(getDriver()).getTextOptionVacationRentals()).isEqualTo("Alquileres de vacaciones");
        log.info("Step 2: Click on the option Vacation Rentals");
        Pages.returnHomePage(getDriver()).onClickOptionVacationRentals();
        log.info("Step 3: Validate the text in the text field of search Vacation Rentals");
        String textVacationRentals = Pages.returnHomePage(getDriver()).getTitleSearch(getDriver());
        assertThat(textVacationRentals).isEqualTo("Destino");
    }
}
