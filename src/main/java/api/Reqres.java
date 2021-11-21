package api;

import org.junit.Assert;

import java.util.List;
import java.util.stream.Collectors;

import static io.restassured.RestAssured.*;


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
        List<String> ids = users.stream().map(x->x.getId().toString()).collect(Collectors.toList());
        for (int i = 0; i < avatars.size(); i++) {
            Assert.assertTrue(avatars.get(i).contains(ids.get(i)));
        }





    }
}
