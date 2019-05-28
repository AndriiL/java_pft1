package ru.stqa.pft.addressbook.tests;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() throws Exception {
    app.gotoAddNew();
    app.fillContactForm(new ContactData("Firstname", "Lastname", "Company", "380506268596", "firstname@gmail.com"));
    app.submitContactForm();
  }

}
