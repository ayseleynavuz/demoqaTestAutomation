import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class BaseTest {
    protected WebDriver driver;
@BeforeAll  //Her şeyden önce ilk çalıştırılacak kod kısmı
    public void setUp(){  //Amacı sadece browser'ı başlatmak ve o sayfaya yönlendirmektir
    System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
    System.out.println("Test Initiated");
    }
    @BeforeEach //her metotdan önce
    public void beforeMethod(){
    driver = new ChromeDriver();
    }
    @AfterEach
    public void afterMethod(){
        driver.quit();
    }

  //  @AfterAll
   //  public void tearDown(){
   // driver.quit();
   // }


}
