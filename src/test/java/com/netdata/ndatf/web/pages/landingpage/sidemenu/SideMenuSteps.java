package com.netdata.ndatf.web.pages.landingpage.sidemenu;

import com.netdata.ndatf.web.pages.DefaultPage;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SideMenuSteps implements SideMenuActions{

    DefaultPage defaultPage;

    @Override
    public List<WebElement> getMenus() throws Exception {
        return defaultPage.sideMenu.getMenus();
    }

    @Override
    public void selectMenu(String menu) throws Exception {
        defaultPage.sideMenu.selectMenu(menu);
    }
}
