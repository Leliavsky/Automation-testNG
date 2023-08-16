package API;

import io.restassured.RestAssured;

import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;

import static io.restassured.RestAssured.given;

public class CRUD {

    private final String token = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.e" +
            "yJleHAiOjE2OTIyNjM3NjksInVzZXJfbmFtZSI6InN1cGVyYWRtaW4iLCJhdXRob3JpdGllcyI6WyJS" +
            "T0xFX0FETUlOSVNUUkFUT1IiXSwianRpIjoiMDkyLXg3anFhQUdFX05vamc3YzRwTk14RzJBIiwiY2xp" +
            "ZW50X2lkIjoidWkiLCJzY29wZSI6WyJ1aSJdfQ.q5dpIvaOwCoRCCFtu7Qu_BXeO2_bb_74RDp2-ZdVfEg";
    private Response createUserResponse;

    @BeforeClass
    public void setUp() {
        RestAssured.baseURI = "http://localhost:8080/api/v1";
    }

    @Test(priority = 1)
    public void testCreateUser() throws IOException {
        createUserResponse =
                given()
                        .header("Content-Type", "application/json")
                        .header("Authorization", token)
                        .body(new ClassPathResource("createBodyUser.json").getFile())
                        .when()
                        .post("/user")
                        .then()
                        .statusCode(201)
                        .extract().response();

        createUserResponse.prettyPrint();
    }

    @Test(priority = 2)
    public void testGetUser() {

        given()
                .header("Authorization", token)
                .log().all()
                .when()
                .get("/user/" + createUserResponse.path("login"))
                .then()
                .statusCode(200)
                .extract().response()
                .prettyPrint();
    }

    @Test(priority = 3)
    public void testUpdateUser() throws IOException {
        Response response =
                given()
                        .log().all()
                        .header("Content-Type", "application/json")
                        .header("Authorization", token)
                        .body(new ClassPathResource("updateBodyUser.json").getFile())
                        .when()
                        .put("/user/" + createUserResponse.path("login"))
                        .then()
                        .log().all()
                        .statusCode(200)
                        .extract().response();
    }

    @Test(priority = 4)
    public void testDeleteUser() {
        Response response =
                given()
                        .header("Content-Type", "application/json")
                        .header("Authorization", token)
                        .body("{" +
                                "\"ids\":[" + createUserResponse.path("id") + "]" +
                                "}")
                        .when()
                        .delete("/user")
                        .then()
                        .statusCode(200)
                        .extract().response();
        response.prettyPrint();
    }
}
