package ru.stqa.pft.addressbook;

public class ContactData {
  private final String name;
  private final String lastname;
  private final String company;
  private final String telefone_mobile;
  private final String email;

  public ContactData(String name, String lastname, String company, String telefone_mobile, String email) {
    this.name = name;
    this.lastname = lastname;
    this.company = company;
    this.telefone_mobile = telefone_mobile;
    this.email = email;
  }

  public String getName() {
    return name;
  }

  public String getLastname() {
    return lastname;
  }

  public String getCompany() {
    return company;
  }

  public String getTelefone_mobile() {
    return telefone_mobile;
  }

  public String getEmail() {
    return email;
  }
}
