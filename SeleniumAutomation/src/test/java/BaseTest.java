import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class BaseTest {
    protected WebDriver driver;
    PracticeFormPage practiceFormPage;


@BeforeAll  //Her şeyden önce ilk çalıştırılacak kod kısmı
    public void setUp(){  //Amacı sadece browser'ı başlatmak ve o sayfaya yönlendirmektir
    System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
    driver = new ChromeDriver();
    driver.get("https://demoqa.com/automation-practice-form");
    System.out.println("Test Initiated");
    practiceFormPage = new PracticeFormPage(driver);

    }

  //  @AfterAll
   //  public void tearDown(){
   // driver.quit();
   // }


}