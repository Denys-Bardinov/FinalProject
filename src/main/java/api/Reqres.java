package api;

import api.data.*;
import org.junit.Assert;

import java.util.List;
import java.util.stream.Collectors;

import static io.restassured.RestAssured.given;


public class Reqres {
    private final static String URL = "https://reqres.in/";


    public void checkAvatarTest() {
        Specification.installSpecification(Specification.requestSpec(URL), Specification.responseSpecOk200());
        List<UserData> users = given()
                .when()
                .get("api/users?page=2")
                .then().log().all()
                .extract().body().jsonPath().getList("data", UserData.class);
        List<String> avatars = users.stream().map(UserData::getAvatar).collect(Collectors.toList());
        List<String> ids = users.stream().map(x -> x.getId().toString()).collect(Collectors.toList());
        for (int i = 0; i < avatars.size(); i++) {
            Assert.assertTrue(avatars.get(i).contains(ids.get(i)));
        }
    }

    public void successRegtTest() {
        Specification.installSpecification(Specification.requestSpec(URL), Specification.responseSpecOk200());
        Integer id = 4;
        String token = "QpwL5tke4Pnpja7X4";
        Register user = new Register("eve.holt@reqres.in", "pistol");
        SuccessReg successReg = given()
                .body(user)
                .when()
                .post("api/register")
                .then().log().all()
                .extract().as(SuccessReg.class);
        Assert.assertNotNull(successReg.getId());
        Assert.assertNotNull(successReg.getToken());
        Assert.assertEquals(id, successReg.getId());
        Assert.assertEquals(token, successReg.getToken());
    }

    public void unSuccessReg() {
        Specification.installSpecification(Specification.requestSpec(URL), Specification.responseSpecError400());

        Register user = new Register("sydney@fife", "");

        UnSuccessReg unSuccessReg = given()
                .body(user)
                .post("api/register")
                .then().log().all()
                .extract().as(UnSuccessReg.class);
        Assert.assertEquals("Missing password", unSuccessReg.getError());
    }

    public void sortedYearsTest() {
        Specification.installSpecification(Specification.requestSpec(URL), Specification.responseSpecOk200());
        List<ColorsData> colors = given()
                .when()
                .get("api/unkown")
                .then().log().all()
                .extract().body().jsonPath().getList("data", ColorsData.class);
        List<Integer> years = colors.stream().map(ColorsData::getYear).collect(Collectors.toList());
        List<Integer> sortedYears = years.stream().sorted().collect(Collectors.toList());
        Assert.assertEquals(sortedYears, years);
    }


    public void deleteUserTest() {
        Specification.installSpecification(Specification.requestSpec(URL), Specification.responseSpecUnique(204));
        given()
                .when()
                .delete("api/users/2")
                .then().log().all();
    }


    public void updateUserTest() {
        Specification.installSpecification(Specification.requestSpec(URL), Specification.responseSpecOk200());
        UpdatingUser user = new UpdatingUser("morpheus", "zion resident");
        UpdatingUserRespons updatingUserRespons = given()
                .body(user)
                .when()
                .put("api/users/2")
                .then().log().all()
                .extract().as(UpdatingUserRespons.class);
        Assert.assertEquals("morpheus", updatingUserRespons.getName());
        Assert.assertEquals("zion resident", updatingUserRespons.getJob());
    }

}
