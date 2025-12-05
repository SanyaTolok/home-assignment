package MainSettings;
import java.util.Map;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
public class UserApi {

 private static String USERS_ENDPOINT = "users/";
 
 public static Response addUser(Map<String, String> requestBody) {
  return RestAssured
   .given()
    .contentType(ContentType.JSON)
    .body(requestBody)
   .when()
    .post(USERS_ENDPOINT);
 }
}