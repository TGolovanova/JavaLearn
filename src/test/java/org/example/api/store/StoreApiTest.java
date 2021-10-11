package org.example.api.store;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import org.example.model.Order;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

import static io.restassured.RestAssured.given;

public class StoreApiTest {

    @BeforeClass
    public void prepare() throws IOException {

        System.getProperties().load(ClassLoader.getSystemResourceAsStream("my.properties"));

        RestAssured.requestSpecification = new RequestSpecBuilder()
                .setBaseUri("https://petstore.swagger.io/v2/")
                .addHeader("api_key", System.getProperty("api.key"))
                .addHeader("Authorization", System.getProperty("token"))
                .setAccept(ContentType.JSON)
                .setContentType(ContentType.JSON)
                .log(LogDetail.ALL)
                .build();

        RestAssured.filters(new ResponseLoggingFilter());

    }

    @Test
    public void placeOrderTest() {

        Order order = new Order();
        int id = 8220;
        int petId = 2;
        int quantity = 1;
        String shipDate = "2021-10-11T07:55:29.972Z";
        String status = "placed";
        String complete = "true";

        order.setId(id);
        order.setPetId(petId);
        order.setQuantity(quantity);
        order.setShipDate(shipDate);
        order.setStatus(status);
        order.setComplete(complete);

        given()
                .body(order)
                .when()
                .post("/store/order")
                .then()
                .statusCode(200);

        Order actual =
                given()
                        .pathParam("id", id)
                        .when()
                        .get("/store/order/{id}")
                        .then()
                        .statusCode(200)
                        .extract().body()
                        .as(Order.class);

        Assert.assertEquals(actual.getId(), order.getId());

    }

    @Test
    public void deleteOrderTest() throws IOException {

        System.getProperties().load(ClassLoader.getSystemResourceAsStream("my.properties"));

        given()
                .pathParam("id", System.getProperty("id"))
                .when()
                .delete("/store/order/{id}")
                .then()
                .statusCode(200);

        given()
                .pathParam("id", System.getProperty("id"))
                .when()
                .get("/store/order/{id}")
                .then()
                .statusCode(404);
    }
}
