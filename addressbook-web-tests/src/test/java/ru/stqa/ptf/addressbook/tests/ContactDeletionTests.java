package ru.stqa.ptf.addressbook.tests;

import org.testng.annotations.Test;

/**
 * Created by legai on 17.10.2016.
 */
public class ContactDeletionTests extends TestBase{

  @Test

  public void testContactDeletion(){

    app.getContactHelper().selectContact();
    app.getContactHelper().confirmDeletion();
  }
}
