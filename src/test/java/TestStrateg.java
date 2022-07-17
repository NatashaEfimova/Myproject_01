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

         element = wd.findElement(By.xpath("//div[@class='login_login__3EHKB']"));

         element = wd.findElement(By.xpath("//div[@class='login_login__3EHKB']"));
         element = wd.findElement(By.xpath("//*[@class='login_login__3EHKB']"));

         // активная кнопка
         element =  wd.findElement(By.cssSelector(".active"));

         // для этой задачи xPath в данном случае НЕ подходит, так как задача была найти АКТИВНУЮ кнопку, а не кнопку Логин, но пусть будет так:
         element = wd.findElement(By.xpath("(//a[normalize-space()='LOGIN'])[1]"));



         // посчитать сколько полей для ввода
         // для этой задачи xPath в данном случае НЕ подходит, потому что он находит только конкретный элемент?

         List<WebElement> elements = wd.findElements(By.tagName("input"));
         System.out.println(elements.size());




     }
     @AfterMethod
     public void postCondition(){

         wd.quit();
     }
 }



