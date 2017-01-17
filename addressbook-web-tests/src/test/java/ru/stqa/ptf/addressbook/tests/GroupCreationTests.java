package ru.stqa.ptf.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.ptf.addressbook.model.GroupData;

import java.util.List;


public class GroupCreationTests extends TestBase{

  @Test
  public void testGroupCreationTests() {

    app.getNavigationHelper().gotoGroupPage();
    List<GroupData> before = app.getGroupHelper().getGroupList();
    app.getGroupHelper().createGroup(new GroupData("test7", null, null));
    List<GroupData> after = app.getGroupHelper().getGroupList();
    Assert.assertEquals(after.size(), before.size() + 1);

  }

}
