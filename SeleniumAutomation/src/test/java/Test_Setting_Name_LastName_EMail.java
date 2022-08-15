import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_Setting_Name_LastName_EMail extends BaseTest{

    @Test
    public void setName(){
        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        practiceFormPage.setName("Aleyna");
        Assertions.assertEquals("Aleyna", practiceFormPage.getName(), "Name value is not correct.");

    }
    @Test
    public void setLastName(){
        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        practiceFormPage.setLastName("Yavuz");
        Assertions.assertEquals("Yavuz", practiceFormPage.getLastName(), "LastName value is not correct.");
    }
    @Test
    public void setEmail(){
        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        practiceFormPage.setEmail("aleynayavuz@gmail.com");
        Assertions.assertEquals("aleynayavuz@gmail.com", practiceFormPage.getEmail(), "Email value is not correct.");

    }
}
