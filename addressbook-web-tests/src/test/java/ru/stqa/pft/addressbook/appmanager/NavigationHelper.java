package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationHelper {


  private MyHelperBase helperBase;

  public NavigationHelper(WebDriver wd) {
    helperBase = new MyHelperBase(wd);
  }

  public void gotoGroupPage() {
    helperBase.click(By.linkText("groups"));
  }

  public HelperBase getHelperBase() {
    return helperBase;
  }

  public void gotoAddNew() {
    helperBase.gotoAddNew();
  }

  private class MyHelperBase extends HelperBase {
    public MyHelperBase(WebDriver wd) {
      super(wd);
    }
  }
}
