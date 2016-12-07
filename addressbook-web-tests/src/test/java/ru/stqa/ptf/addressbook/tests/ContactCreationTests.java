package ru.stqa.ptf.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.ptf.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase{

    @Test
    public void testContactCreation() {
        app.getContactHelper().gotoAddContact();
        app.getContactHelper().createContact(new ContactData("Tester2", "Tester3", "89250000006", "tester2.tester3@mail.ru", "test7"), true);
    }


}