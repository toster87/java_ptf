package ru.stqa.ptf.addressbook;

import org.testng.annotations.Test;


public class GroupCreationTests extends TestBase{

  @Test
  public void testGroupCreationTests() {

    gotoGroupPage();
    initGroupCreation();
    fillGroupForm(new GroupData("test7", "test8", "test9"));
    submitGroupCreation();
    returnToGroupPage();
  }

}
