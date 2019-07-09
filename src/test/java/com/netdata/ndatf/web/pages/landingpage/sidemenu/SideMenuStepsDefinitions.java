package com.netdata.ndatf.web.pages.landingpage.sidemenu;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class SideMenuStepsDefinitions {

    @Steps
    SideMenuSteps sideMenuSteps;

    @Then("The side menu must contain the item '(.*)'")
    public void getMenus(String menuName) throws Exception {
        assertTrue("Menu " + menuName + " not found!!",
                sideMenuSteps.getMenus().stream().filter(menu -> menu.getText().equals(menuName))
                        .findFirst().isPresent());
    }

    @When("I select the menu '(.*)'")
    public void selectMenu(String menuName) throws Exception {
        sideMenuSteps.selectMenu(menuName);
    }
}
