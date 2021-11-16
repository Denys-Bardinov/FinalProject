package API.pages;


import org.openqa.selenium.WebDriver;

import static API.constantURI.ListURI.BASE_URI;
import static API.constantURI.ListURI.GET_LIST_USERS;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class ListUsers extends BasePage{

    public ListUsers(WebDriver driver) {
        super(driver);
    }


    public ListUsers checkAllUsersDon_tHaveEmptyFields() {
given().get(BASE_URI + GET_LIST_USERS).then().statusCode(200)
        .body("data[1].first_name",equalTo("Lindsay"));
return this;
    }
}
