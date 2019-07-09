package com.netdata.ndatf.web.pages.landingpage.sidemenu;

import com.netdata.ndatf.web.pages.panes.DefaultPanel;
import net.serenitybdd.core.annotations.ImplementedBy;

@ImplementedBy(SideMenuImpl.class)
public interface SideMenu extends DefaultPanel,SideMenuActions{

    String LOCATOR = "sidebar_ul";

}
