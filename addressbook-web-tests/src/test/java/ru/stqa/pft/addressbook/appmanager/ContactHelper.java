package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactHelper extends HelperBase {

  public ContactHelper(FirefoxDriver wd) {
    super(wd);
  }

  public void submitContactForm() {
    getClick();
  }

  public void fillContactForm(ContactData contactData) {
    type(By.name("firstname"), contactData.getFirstname());
    type(By.name("lastname"), contactData.getLastname());
    type(By.name("company"), contactData.getCompany());
    type(By.name("mobile"), contactData.getMobile_phone());
    type(By.name("email"), contactData.getEmail());
  }

  public void initContactModification() {
    click(By.xpath("//tr[2]//td[8]//a[1]//img[1]"));
  }

  public void submitContactModification() {
    click(By.name("update"));
  }

  public void initContactDeletion() {
    click(By.xpath("(//input[@name='update'])[3]"));
  }
}
