package tests.API.getUsers;

import org.junit.Test;

public class ListUsersTest extends BaseTest{

    @Test
    public void getUsers() {
        listUsers.checkAllUsersDon_tHaveEmptyFields();
        close();
    }
}
