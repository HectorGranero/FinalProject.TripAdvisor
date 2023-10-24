package com.qaminds.tests.menuOptions.hotels;

import com.qaminds.pages.Pages;
import com.qaminds.tests.BaseTest;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
public class SearchInputTest extends BaseTest {
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
