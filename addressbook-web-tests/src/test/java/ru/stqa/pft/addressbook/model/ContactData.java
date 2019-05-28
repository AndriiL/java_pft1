package ru.stqa.pft.addressbook.model;

public class ContactData {
  private final String firstname;
  private final String lastname;
  private final String company;
  private final String mobile_phone;
  private final String email;

  public ContactData(String firstname, String lastname, String company, String mobile_phone, String email) {
    this.firstname = firstname;
    this.lastname = lastname;
    this.company = company;
    this.mobile_phone = mobile_phone;
    this.email = email;
  }

  public String getFirstname() {
    return firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public String getCompany() {
    return company;
  }

  public String getMobile_phone() {
    return mobile_phone;
  }

  public String getEmail() {
    return email;
  }
}
