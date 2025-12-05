import java.util.Map;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import MainSettings.APISettings;
import MainSettings.UserApi;
import MainSettings.UserFactory;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class UserAPITest {
 
 private Map<String, String> user;
 
 @BeforeClass
 public void setup() {
  user = UserFactory.getRandomUser();
  RestAssured.baseURI = APISettings.HEROKU;
 }
 
 @Test
 public void addUserTest() { 
  Response response = UserApi.addUser(user);
  String userPrity = ((Object) user).toString();
  System.out.println("Request body: " + userPrity);
  response.then().assertThat().statusCode(201);
  System.out.println("Response: " + response.getBody().asString());
 }
}