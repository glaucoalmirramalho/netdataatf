package com.netdata.ndatf.web.pages.steps;

import com.netdata.ndatf.web.pages.DefaultPage;
import com.netdata.ndatf.web.pages.landingpage.LandingPage;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

import static org.junit.Assert.assertTrue;

public class CommonSteps {

    DefaultPage defaultPage;
    LandingPage landingPage;

    @Step("^User navigates to {0} page$")
    public void navigateTo(String page) throws Exception{
        if(page.equals("Landing")) landingPage.open();
    }

    @Step("^The user gets redirected to {0} page$")
    public boolean getRedirectedTo(String page) {
        return defaultPage.getCurrentPage().equals(page);
    }

    @Step("^The user gets redirected to {0} panel$")
    public boolean getRedirectedToPanel(String panel) {
        switch (panel){
            case("cpu"):
                return defaultPage.find(By.id("menu_system_submenu_cpu")).isVisible();
            case("ram"):
                return defaultPage.find(By.id("menu_system_submenu_ram")).isVisible();
            case("disk"):
                return defaultPage.find(By.id("menu_system_submenu_disk")).isVisible();
            default:
                throw new IllegalStateException("Unexpected value: " + panel);
        }

    }
}
