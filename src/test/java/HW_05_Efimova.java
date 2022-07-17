import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class HW_05_Efimova {

    WebDriver wd;

    @BeforeMethod
    public void preCondition() {
        wd = new ChromeDriver();
        wd.navigate().to("https://www.w3schools.com/css/css_table.asp");
    }


    @Test
    public void tableHW(){
        // get row 4 content

        WebElement   element = wd.findElement(By.xpath("//body[1]/div[7]/div[1]/div[1]/table[1]/tbody[1]/tr[4]"));

        // check if there is text "Mexico" there
        //тест отрабатывает, но я не уверена, что это то, что нужно было. Мой джава-минус
        String text = element.getText();
        System.out.println(text);
       Assert.assertTrue(text.contains("exi"));



            // print amount of table rows
            // print amount of table columns
            // print content of row3
            // print content of last column
            // print number of row with name "Philip Cramer"

    }
    @AfterMethod
    public void postCondition(){

        wd.quit();
    }
}