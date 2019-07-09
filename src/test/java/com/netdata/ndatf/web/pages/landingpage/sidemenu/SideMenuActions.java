package com.netdata.ndatf.web.pages.landingpage.sidemenu;

import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * This interface contains valid actions for the Side Menu at the Landing page.
 */
public interface SideMenuActions {

    public List<WebElement> getMenus() throws Exception;
    public void selectMenu(String menu) throws Exception;

}
