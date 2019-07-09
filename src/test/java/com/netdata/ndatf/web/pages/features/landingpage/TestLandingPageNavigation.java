package com.netdata.ndatf.web.pages.features.landingpage;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.thucydides.core.annotations.Managed;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/landingpage/Navigation.feature",
glue = {"com.netdata.ndatf.web.pages.steps",
        "com.netdata.ndatf.web.pages.landingpage.systemoverviewpane",
        "com.netdata.ndatf.web.pages.landingpage.sidemenu"})
public class TestLandingPageNavigation {

}
