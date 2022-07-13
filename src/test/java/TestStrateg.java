import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class TestStrateg {



    WebDriver wd;

    @BeforeMethod
    public void preCondition() {
        wd = new ChromeDriver();
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/login");
    }
     @Test
     public void testName(){



       // весь  div class="login_login__3EHKB"

         WebElement element = wd.findElement(By.className("login_login__3EHKB"));

         // активная кнопка
         element =  wd.findElement(By.cssSelector(".active"));


         // посчитать сколько полей для ввода

         List<WebElement> elements = wd.findElements(By.tagName("input"));
         System.out.println(elements.size());


         //этот тест НЕ работает потому что я плоха в Джаве, но есть вопрос:
         // Предположим, что на огромной километровой странице с кучей элементов и контента мне надо найти из всех кнопок на странице элемент, который именно кнопка и именно регистрация. Как?
       // element = wd.findElement(By.tagName("button") .cssSelector("[href$='rat']"));

     }
     @AfterMethod
     public void postCondition(){

         wd.quit();
     }
 }



