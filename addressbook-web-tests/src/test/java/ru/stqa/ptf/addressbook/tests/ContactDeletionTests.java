package ru.stqa.ptf.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.ptf.addressbook.model.ContactData;

/**
 * Created by legai on 17.10.2016.
 */
public class ContactDeletionTests extends TestBase {

  @Test

  public void testContactDeletion() {

    if (! app.getContactHelper().isThereAContact()) {
      app.getContactHelper().createContact(new ContactData("Tester2", "Tester3", "89250000006", "tester2.tester3@mail.ru", "test7"), true);
    }

    app.getContactHelper().selectContact();
    app.getContactHelper().confirmDeletion();
    app.getContactHelper().checkDeleted();
  }
}