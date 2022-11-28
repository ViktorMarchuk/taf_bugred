package by.it_academy.tafbugred.api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

public class ApiTest{
    @Test
    void testRegisterUser(){
        String endPoint = "http://users.bugred.ru/tasks/rest/doregister";
        String name = "dom";
        String email = "doma45@gmail.com";
        String password = "23344";
        String requestBody = String.format("{\"name\":\"%s\",\"email\":\"%s\",\"password\":\"%s\"}", name, email, password);
        given()
                .header("Content-type", "application/json")
                .and()
                .body(requestBody)
                .when()
                .post(endPoint)
                .then().statusCode(200)
                .log().all();
    }

    @Test
    void testRegisterUserIncorrectEmail(){
        String endPoint = "http://users.bugred.ru/tasks/rest/deleteuser";
        String email = "dog.23";
        String requestBody = String.format("{\"email\":\"%s\"}", email);
        given()
                .header("Content-type", "application/json")
                .and()
                .body(requestBody)
                .when()
                .post(endPoint)
                .then().statusCode(200)
                .log().all();
    }

    @Test
    void testGetUserInfo(){
        String endPoint = "http://users.bugred.ru/tasks/rest/getuser";
        String email = "doma45@gmail.com";
        String requestBody = String.format("{\"email\":\"%s\"}", email);
        given()
                .header("Content-type", "application/json")
                .and()
                .body(requestBody)
                .when()
                .get(endPoint)
                .then().statusCode(200)
                .body("email", is(email))
                .log().all();
    }

    @Test
    void testGetIncorrectEmail(){
        String endPoint = "http://users.bugred.ru/tasks/rest/getuser";
        String email = "kat.23@gmail.co";
        String requestBody = String.format("{\"email\":\"%s\"}", email);
        given()
                .header("Content type", "application/jason")
                .and()
                .body(requestBody)
                .when()
                .get(endPoint)
                .then().statusCode(200)
                .body("email", is("Пользователь не найден " + email))
                .log().all();
    }

    @Test
    public static void testEditInfoUser(){
        RestAssured.baseURI = "http://users.bugred.ru/tasks/rest";
        long inn = 40596857;
        String gender = "m";
        String birthday = " 02.09.2008";
        String date_start = "23.11.2022";
        String requestBody = String.format("{\"inn\":\"%s\",\"gender\":\"%s\",\"birthday\":\"%s\",\"date_start\":\"%s\"}", inn, gender, birthday, date_start);
        Response response = given()
                .header("Content-type", "application/json")
                .and()
                .body(requestBody)
                .when()
                .patch("/fullupdateuser")
                .then()
                .statusCode(200)
                .log().all()
                .extract().response();
    }

    @Test
    void testDeleteUsers(){
        String endPoint = "http://users.bugred.ru/tasks/rest/deleteuser";
        String email = "doma.23@gmail.com";
        String requestBody = String.format("{\"email\":\"%s\"}", email);
        given()
                .header("Content-type", "application/json")
                .and()
                .body(requestBody)
                .when()
                .delete(endPoint)
                .then().statusCode(200)
                .log().all()
                .extract().response();
    }

    @Test
    void testDeleteIncorrectUser(){
        String endPoint = "http://users.bugred.ru/tasks/rest/deleteuser";
        String email = "dom.23@";
        String requestBody = String.format("{\"email\":\"%s\"}", email);
        given()
                .header("Content-type", "application/json")
                .and()
                .body(requestBody)
                .when()
                .delete(endPoint)
                .then().statusCode(200)
                .log().all()
                .extract().response();
    }
}
