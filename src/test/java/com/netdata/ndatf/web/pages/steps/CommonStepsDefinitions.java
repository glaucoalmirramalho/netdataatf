package com.netdata.ndatf.web.pages.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

import static org.junit.Assert.assertTrue;

public class CommonStepsDefinitions {

    @Steps
    CommonSteps commonSteps;

    @Given("^that I navigate to the '(Landing|Help)' page$")
    public void iNavigateToPage(String page) throws Exception{
        commonSteps.navigateTo(page);
    }

    @Then("^I will be redirected to the '(Landing|Help)' page$")
    public void iGetRedirectedTo(String page) throws Exception{
        assertTrue("Expected to be redirected to " + page + " page",
        commonSteps.getRedirectedTo(page));
    }

    @Then("^I will be redirected to the '(.*)' pane$")
    public void iWillBeRedirectedToThePanePanel(String panel) {
        assertTrue("Expected to be redirected to " + panel + " panel",
        commonSteps.getRedirectedToPanel(panel));
    }
}
