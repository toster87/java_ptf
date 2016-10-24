package ru.stqa.ptf.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by legai on 12.10.2016.
 */
public class NavigationHelper extends HelperBase {


  public NavigationHelper(WebDriver wd) {
    super(wd);

  }

  public void gotoGroupPage() {
    click(By.linkText("groups"));
  }
}
