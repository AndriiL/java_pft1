package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() throws Exception {
    app.getContactHelper().gotoAddNew();
    app.getContactHelper().fillContactForm(new ContactData("Firstname", "Lastname", "Company", "380506268596", "firstname@gmail.com"));
    app.getContactHelper().submitContactForm();
  }

}
