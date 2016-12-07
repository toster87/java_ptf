package ru.stqa.ptf.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.ptf.addressbook.model.ContactData;

/**
 * Created by legai on 17.10.2016.
 */
public class ContactModificationTests extends TestBase {

  @Test
  public void testContactModification() {
    if (! app.getContactHelper().isThereAContact()){
      app.getContactHelper().createContact(new ContactData("Tester2", "Tester3", "89250000006", "tester2.tester3@mail.ru", "test7"), true);
    }

    app.getContactHelper().initContactModification();
    app.getContactHelper().fillContactForm(new ContactData("Tester2", "Tester3", "89250000006", "tester2.tester3@mail.ru", null), false);
    app.getContactHelper().updateContactModification();
    app.getContactHelper().returnToHomePage();

  }

}
