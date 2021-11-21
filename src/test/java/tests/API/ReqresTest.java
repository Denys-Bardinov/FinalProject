package tests.API;

import org.junit.jupiter.api.Test;

public class ReqresTest extends BaseTest {
    @Test
    public void checkUserNameAndAvatar() {
        reqres.checkAvatarTest();
    }

    @Test
    void checkSuccesReg() {
        reqres.successRegtTest();
    }

    @Test
    void checkUnsuccessReg() {
        reqres.unSuccessReg();
    }
}
