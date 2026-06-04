package com.mycompany.app;

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
}