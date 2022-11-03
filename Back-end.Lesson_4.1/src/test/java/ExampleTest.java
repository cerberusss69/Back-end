import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class ExampleTest extends AbstractTest {

    @Test
    void getRecipePositiveTest () {
        given().spec(getRequestSpecification())
                .when()
                .get("https://api.spoonacular.com/recipes/716429/information")
                .then()
                .spec(responseSpecification);
    }
    @Test
    void getRecipePositiveTest1 () {
        given().spec(getRequestSpecification())
                .when()
                .get("https://api.spoonacular.com/recipes/715594/information")
                .then()
                .spec(responseSpecification);
    }

    @Test
    void getRecipePositiveTest2 () {
        given().spec(getRequestSpecification())
                .when()
                .get("https://api.spoonacular.com/recipes/1095834/information")
                .then()
                .spec(responseSpecification);
    }

    @Test
    void getRecipePositiveTest3 () {
        given().spec(getRequestSpecification())
                .when()
                .get("https://api.spoonacular.com/recipes/663357/information")
                .then()
                .spec(responseSpecification);
    }

    @Test
    void getRecipePositiveTest4 () {
        given().spec(getRequestSpecification())
                .when()
                .get("https://api.spoonacular.com/recipes/655847/information")
                .then()
                .spec(responseSpecification);
    }

    @Test
    void getRecipePositiveTest5 () {
        given().spec(getRequestSpecification())
                .when()
                .get("https://api.spoonacular.com/recipes/1426917/information")
                .then()
                .spec(responseSpecification);
    }

    @Test
    void getRecipePositiveTest6 (){
        given().spec(getRequestSpecification())
                .when()
                .get("https://api.spoonacular.com/recipes/636360/information")
                .then()
                .spec(responseSpecification);
    }

    @Test
    void getRecipePositiveTest7 (){
        given().spec(getRequestSpecification())
                .when()
                .get("https://api.spoonacular.com/recipes/663087/information")
                .then()
                .spec(responseSpecification);
    }

    @Test
    void getRecipePositiveTest8 () {
        given().spec(getRequestSpecification())
                .when()
                .get("https://api.spoonacular.com/recipes/650651/information")
                .then()
                .spec(responseSpecification);
    }

    @Test
    void getRecipePositiveTest9 (){
        given().spec(getRequestSpecification())
                .when()
                .get("https://api.spoonacular.com/recipes/635686/information")
                .then()
                .spec(responseSpecification);
    }

    @Test
    void test () {
        given().spec(requestSpecification)
                .when()
                .formParam("title","Burger")
                .formParam("language", "en")
                .post("https://api.spoonacular.com/recipes/cuisine").prettyPeek()
                .then()
                .statusCode(200);
    }

    @Test
    void postTest1 () {
        given().spec(requestSpecification)
                .when()
                .formParam("id", 635686)
                .formParam("title", "Borscht Soup")
                .post("https://api.spoonacular.com/recipes/cuisine").prettyPeek()
                .then()
                .statusCode(200);
    }

    @Test
    void postTest2 () {
        given().spec(requestSpecification)
                .when()
                .formParam("id", 1095810)
                .formParam("title", "Buffalo Mozzarella & Pepperoni Pizza with a Cauliflower Crust")
                .post("https://api.spoonacular.com/recipes/cuisine").prettyPeek()
                .then()
                .statusCode(200);
    }

    @Test
    void postTest3(){
        given().spec(requestSpecification)
                .when()
                .formParam("id", 664929)
                .formParam( "title", "Walnut Lentil Burgers with Tarragon")
                .post("https://api.spoonacular.com/recipes/cuisine")
                .then()
                .statusCode(200);
    }

    @Test
    void postTest4(){
        given().spec(requestSpecification)
                .when()
                .formParam("id", 650651)
                .formParam("title", "Make It Quick Italian Shrimp Rolls")
                .post("https://api.spoonacular.com/recipes/cuisine")
                .then()
                .statusCode(200);
    }

    @Test
    void postTest5(){
        given().spec(requestSpecification)
                .when()
                .formParam("id", 663357)
                .formParam("title", "The Unagi Burger")
                .post("https://api.spoonacular.com/recipes/cuisine")
                .then()
                .statusCode(200);
    }

    @Test
    void postTest6(){
        given().spec(requestSpecification)
                .when()
                .formParam("id", 636360)
                .formParam("title", "Brussels Sprout Carbonara with Fettuccini")
                .post("https://api.spoonacular.com/recipes/cuisine")
                .then()
                .statusCode(200);
    }

    @Test
    void postTest7(){
        given().spec(requestSpecification)
                .when()
                .formParam("id", 6630870)
                .formParam("title", "Thai Coconut Beetroot Soup")
                .post("https://api.spoonacular.com/recipes/cuisine")
                .then()
                .statusCode(200);
    }

    @Test
    void postTest8(){
        given().spec(requestSpecification)
                .when()
                .formParam("id", 1096250)
                .formParam("title", "Pho With Zucchini Noodles")
                .post("https://api.spoonacular.com/recipes/cuisine")
                .then()
                .statusCode(200);
    }

    @Test
    void postTest9(){
        given().spec(requestSpecification)
                .when()
                .formParam("id", 665734)
                .formParam("title", "Zucchini Chicken Omelette")
                .post("https://api.spoonacular.com/recipes/cuisine")
                .then()
                .statusCode(200);
    }

}
