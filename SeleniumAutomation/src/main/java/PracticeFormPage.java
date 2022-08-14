import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracticeFormPage extends BasePage{
    private final By name = By.id("firstName");
    private final By lastName = By.id("lastName");
    private final By eMail = By.id("userEmail");
    private GenderSection genderSection;

    public PracticeFormPage(WebDriver driver){
        super(driver) ;
        genderSection=new GenderSection(driver);
    }

    public GenderSection genderSection(){ return this.genderSection;}

    public void setName(String nameAsString){
        WebElement nameSpace = driver.findElement(name);
        nameSpace.click();
        nameSpace.sendKeys(nameAsString);  //nameText içindeki ismi gönderir.
    }
    public void setLastName(String lastNameAsString){
        WebElement nameSpace = driver.findElement(lastName);
        nameSpace.click();
        nameSpace.sendKeys(lastNameAsString);
    }
    public void setEMAil(String eMailAsString){
        WebElement nameSpace = driver.findElement(eMail);
        nameSpace.click();
        nameSpace.sendKeys(eMailAsString);
    }
   public String getName(){
        WebElement nameSpace = driver.findElement(name);
        return nameSpace.getAttribute("Value");
    }
    public String getLastName(){
        WebElement lastNameSpace = driver.findElement(lastName);
        return lastNameSpace.getAttribute("Value");
    }
    public String getEmail(){
        WebElement eMailSpace = driver.findElement(eMail);
        return eMailSpace.getAttribute("Value");
    }

}
