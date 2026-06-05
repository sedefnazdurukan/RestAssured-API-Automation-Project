package com.mycompany.app;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasKey;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.*;

public class AppTest {

    @Test
    public void testGitHubRepoGetir() {
        given()
            .header("User-Agent", "RestAssured-Test") 
        .when()
            .get("https://api.github.com/repos/junit-team/junit5") 
        .then()
            .statusCode(200) 
            .body("name", org.hamcrest.Matchers.equalTo("junit-framework")) 
            .body("private", org.hamcrest.Matchers.equalTo(false)) 
            .time(org.hamcrest.Matchers.lessThan(6000L)); 
    }

    @Test
    public void testGitHubRepoBulunamadi() {
        try {
            given()
                .header("User-Agent", "RestAssured-Test")
            .when()
                .get("https://api.github.com/repos/bu-kullanici-kesinlikle-yok-12345/bu-repo-da-yok")
            .then()
                .statusCode(404);
        } catch (Exception e) {
            System.out.println("Beklenen hata yakalandi.");
        }
    }

    @Test
public void testKullaniciOlusturPOST() {

    // 1. Request Body (JSON Gövdesi) Hazırlama
    String jsonBody = "{\n" +
            "    \"title\": \"Yazilim Test Projesi\",\n" +
            "    \"body\": \"Yapay Zeka Destekli Test\",\n" +
            "    \"userId\": 1\n" +
            "}";

    System.out.println("POST isteği için hazırlanan Request Body:\n" + jsonBody);

    // 2. Rest-Assured ile POST İsteği Atılması ve Doğrulanması
    given()
            .header("Content-Type", "application/json; charset=UTF-8")
            .body(jsonBody) // Hazırlanan isteğin Request Body'si
    .when()
            .post("https://jsonplaceholder.typicode.com/posts")
    .then()
            .statusCode(201) // HTTP 201 Created doğrulaması
            .body("title",
                    org.hamcrest.Matchers.equalTo("Yazilim Test Projesi"))
            .body("body",
                    org.hamcrest.Matchers.equalTo("Yapay Zeka Destekli Test"))
            .body("$",
                    org.hamcrest.Matchers.hasKey("id"));

    System.out.println(
            "POST isteği başarıyla tamamlandı. Yeni veri oluşturuldu ve HTTP 201 döndü.");
}
}
