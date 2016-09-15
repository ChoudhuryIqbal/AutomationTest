import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Created by a on 9/14/2016.
 */
public class SampleTest extends CommonAPI
    {
    @Test
    public void linkTest()throws InterruptedException{
        driver.get("file:///C:/Users/a/Desktop/LAB1.html");
        Thread.sleep(400);
      // System.out.println( driver.findElement(By.linkText("Moogle")).getText());
       // driver.findElement(By.linkText(locator)).findElement(By.tagName("a")).getText();
   String word1=driver.findElement(By.linkText("Moogle")).getAttribute("href");

       // getLinks("Google");
        driver.findElement(By.linkText("Moogle")).click();
       String word= driver.getCurrentUrl();
      System.out.println(word);
        System.out.println(word1);
        Thread.sleep(3000);


    }


    }

