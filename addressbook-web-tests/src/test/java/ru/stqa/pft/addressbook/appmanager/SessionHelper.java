package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.openqa.selenium.By.name;

public class SessionHelper extends HelperBase {

  public SessionHelper(FirefoxDriver wd) {
    super(wd);
  }

  public void login(String username, String password) {
    type(name("user"), username);
    type(name("pass"), password);
    click(By.xpath("//input[@value='Login']"));
  }

}
