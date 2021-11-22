package tests.API;

import org.junit.jupiter.api.Test;

public class ReqresTest extends BaseTest {
    @Test
    public void checkUserNameAndAvatar() {
        reqres.checkAvatarTest();
    }

    @Test
    public void checkSuccesReg() {
        reqres.successRegtTest();
    }

    @Test
    public void checkUnsuccessReg() {
        reqres.unSuccessReg();
    }

    @Test
    public void checkSortedYears() {
        reqres.sortedYearsTest();
    }

    @Test
    public void checkDeletingUser() {
        reqres.deleteUserTest();
    }

    @Test
    public void checkCreationUser() {
        reqres.createUserTest();
    }
}
