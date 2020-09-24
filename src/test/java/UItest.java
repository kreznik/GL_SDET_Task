import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import org.junit.Test;
import org.openqa.selenium.By;

public class UItest {
   /* @Test
    public void UiTest(){
        open("https://www.imdb.com/");
        $("Title").shouldHave(text("Back to the Future")).pressEnter();
        $(By.name("Back to the Future")).shouldHave(text("Marty McFly, a 17-year-old high school student, is accidentally sent thirty years into the past in a time\n" +
                "                -traveling DeLorean invented by his close friend, the eccentric scientist Doc Brown."));
                 }
*/
   @Test
   public void UiTest(){
       open("https://www.imdb.com/");

       $(By.name("search")).val("Back to the Future").pressEnter().shouldHave(text("Marty McFly, a 17-year-old high school student," +
               " is accidentally sent thirty years into the past in a time\n" +
               "                -traveling DeLorean invented by his close friend, the eccentric scientist Doc Brown."));




   }
}
