package ru.stqa.ptf.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.stqa.ptf.addressbook.model.ContactData;

/**
 * Created by legai on 17.10.2016.
 */
public class ContactHelper extends HelperBase{

  public ContactHelper(ChromeDriver wd) {
    super(wd);

  }

  public void returnToHomePage() {wd.findElement(By.linkText("home page")).click();
  }

  public void submitContactCreation() {wd.findElement(By.xpath("//div[@id='content']/form/input[21]")).click();
  }

  public void fillContactForm(ContactData contactData) {
    type(By.name("firstname"), contactData.getFirstname());
    type(By.name("lastname"), contactData.getLastname());
    type(By.name("mobile"), contactData.getMobile());
    type(By.name("email"), contactData.getEmail());
  }

}
