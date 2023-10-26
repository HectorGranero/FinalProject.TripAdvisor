package com.qaminds.tests.Search.hotels;

import com.qaminds.pages.Pages;
import com.qaminds.tests.BaseTest;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
public class SearchInputTest extends BaseTest {

    @DataProvider(name = "Lugar Destino")
    public Object[][] getDestionationPlace(){
        return new Object[][]{
            {RandomStringUtils.randomAlphabetic(10)},
            {RandomStringUtils.randomNumeric(10)},
            {"!#$%&/()=.,"},
            {RandomStringUtils.randomAlphanumeric(10)},
            {RandomStringUtils.randomAscii(10)}
        };
    }

    @Test(dataProvider = "Lugar Destino")
    public void searchIncorrectValues(String destinationPlace){
        log.info("Step 3: Click on the text field Search");
        Pages.returnHomePage(getDriver()).onClickButtonSearchInput();
        log.info("Step 4: Send the destination place");
        Pages.returnHomePage(getDriver()).sendDestinationPlace(destinationPlace);
        log.info("Step 5: Validate the search");
        String titleSearch = Pages.returnHotelsPage(getDriver()).getTitleIncorrectValueSearch(getDriver());
        log.info(titleSearch);
        assertThat(titleSearch).contains(destinationPlace);
    }

    @Test
    public void searchInputHotels(){
        log.info("Step 3: Click on the text field Search");
        Pages.returnHomePage(getDriver()).onClickButtonSearchInput();
        log.info("Step 4: Send the destination place");
        Pages.returnHomePage(getDriver()).sendDestinationPlace("Puerto Vallarta");
        log.info("Step 5: Validate the search");
        String titleSearch = Pages.returnHotelsPage(getDriver()).getTitleQuerySearch(getDriver());
        log.info(titleSearch);
        assertThat(titleSearch).contains("Puerto Vallarta");
    }
}
