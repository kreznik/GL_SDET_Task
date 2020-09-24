import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.junit.Test;

public class ApiTest {
    @Test
    public void isThereAFilmTitle() {
        get("http://www.omdbapi.com/?t=Back+to+the+future").then().statusCode(200).assertThat()
                .body("Title", equalTo("Back to the Future"));
    }
}
