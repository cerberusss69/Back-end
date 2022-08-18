import io.restassured.path.json.JsonPath;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;


import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;


/*
public class RecipeTests {
@Test
void getRecipePositiveTest() {
    given().when()
            .get("https://api.spoonacular.com/recipes/716429/information?” + “includeNutrition=false&apiKey=b1abaf53eb53484cbd61272bf7f7dc24")
                            .then()
                            .statusCode(200);
}


    @Test
    void getRecipeWithQueryParametersPositiveTest() {
        given()
                .queryParam("apiKey", "b1abaf53eb53484cbd61272bf7f7dc24")
                .queryParam("includeNutrition", "false")
                .when()
                .get("https://api.spoonacular.com/recipes/716429/information")
                .then()
                .statusCode(200);
    }

    String id;
    @Test
    void addMealTest() {
        id = given()
                .queryParam("hash", "a3da66460bfb7e62ea1c96cfa0b7a634a346ccbf")
                .queryParam("apiKey", "b1abaf53eb53484cbd61272bf7f7dc24")
                .body("{\n"
                        + " \"date\": 1644881179,\n"
                        + " \"slot\": 1,\n"
                        + " \"position\": 0,\n"
                        + " \"type\": \"INGREDIENTS\",\n"
                        + " \"value\": {\n"
                        + " \"ingredients\": [\n"
                        + " {\n"
                        + " \"name\": \"1 banana\"\n"
                        + " }\n"
                        + " ]\n"
                        + " }\n"
                        + "}")
                .when()
                .post("https://api.spoonacular.com/mealplanner/geekbrains/items")
                .then()
                .statusCode(200)
                .extract()
                .jsonPath()
                .get("id")
                .toString();
    }

    @AfterEach
    void tearDown (){
        given()
                .queryParam("hash", "a3da66460bfb7e62ea1c96cfa0b7a634a346ccbf")
                .queryParam("apiKey", "b1abaf53eb53484cbd61272bf7f7dc24")
                .delete("https://api.spoonacular.com/mealplanner/geekbrains/items/" + id)
                .then()
                .statusCode(200);
    }

    @Test
    void getRecipeWithBodyChecksAfterRequestPositiveTest() {
        JsonPath response = given()
                .queryParam("apiKey", apiKey)
                .queryParam("includeNutrition", "false")
                .when()
                .get("https://api.spoonacular.com/recipes/716429/information")
                .body()
                .jsonPath();
        assertThat(response.get("vegetarian"), is(false));
        assertThat(response.get("vegan"), is(false));
        assertThat(response.get("license"), equalTo("CC BY-SA 3.0"));
        assertThat(response.get("pricePerServing"), equalTo(163.15F));
        assertThat(response.get("extendedIngredients[0].aisle"), equalTo("Milk, Eggs, Other Dairy"));
    }



}
*/

