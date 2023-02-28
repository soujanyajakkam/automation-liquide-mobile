package life.liquide.apiCreation;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreationAPI {

    public static String TOKEN;
    private final DeleteAPIPojo deleteAPIPojo = new DeleteAPIPojo();

   
    public void createAPIOfToken() throws JsonProcessingException {
        RestAssured.baseURI = "https://dev-host01.api.liquide.life";
        deleteAPIPojo.setMobile("8367358123");
        deleteAPIPojo.setOtp("862924");
        ObjectMapper objectMapper = new ObjectMapper();
        String requestBody = objectMapper.writeValueAsString(deleteAPIPojo);
        RequestSpecification httpRequest = RestAssured.given();
        Response responseBody = httpRequest.header("Content-Type", "application/json")
                .body(requestBody).log().all().post("/api/auth/authenticate");
        JsonPath js = new JsonPath(responseBody.body().print());
        int statusLine = responseBody.statusCode();
        TOKEN = js.getString("message.data[0].token");
        System.out.println("token of the session"+TOKEN);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(js.getString("status"), "success");
        softAssert.assertEquals(statusLine,201);
        softAssert.assertAll();
    }
    
    public void deleteNumber() throws JsonProcessingException {
        RestAssured.baseURI = "https://dev-host01.api.liquide.life";
        Map<String, String> headerMap = new HashMap<>();
        headerMap.put("x-access-token",TOKEN);
        RequestSpecification httpRequest = RestAssured.given();
        Response responseBody = httpRequest.header("Content-Type", "application/json").headers(headerMap)
                .log().all().delete("/api/users/6666666666");
        JsonPath js = new JsonPath(responseBody.body().print());
        int statusLine = responseBody.statusCode();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(js.getString("status"), "success");
        softAssert.assertEquals(statusLine,200);
        softAssert.assertAll();
    }
}