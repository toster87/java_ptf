package ru.stqa.ptf.addressbook.tests;

import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase{

    @Test
    public void testContactCreation() {
        app.gotoAddContact();
        app.fillContactForm(new ContactData("Tester2", "Tester3", "89250000006", "tester2.tester3@mail.ru"));
        app.submitContactCreation();
        app.returnToHomePage();
    }


}