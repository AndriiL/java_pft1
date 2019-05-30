package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase {

  @Test
  public void testContactModification() {
    app.getContactHelper();
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillContactForm(new ContactData("Firstname", "Lastname", "Company", "380506268596", "firstname@gmail.com"));
    app.getContactHelper().submitContactModification();
  }
}
