import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class BasePage {

    protected WebDriver driver;
    String baseUrl = "https://demoqa.com/";
    public BasePage(WebDriver driver){
        this.driver=driver;

    }
    public WebElement find(By locator){
        return driver.findElement(locator);
    }
    public WebElement click(By locator){
        return driver.findElement(locator);
    }

    public void type(By locator,String text){
        find(locator).sendKeys(text);

    }
    public boolean isSelected(By locator){
        return find(locator).isSelected();

    }
}
