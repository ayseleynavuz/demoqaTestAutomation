import org.junit.jupiter.api.Assertions;

public class Test_Setting_Name_LastName_EMail extends BaseTest{

    public void setName(){
        practiceFormPage.setName("Aleyna");
        Assertions.assertEquals("Aleyna", practiceFormPage.getName(), "Name value is not correct.");

    }
    public void setLastName(){
        practiceFormPage.setLastName("Yavuz");
        Assertions.assertEquals("Yavuz", practiceFormPage.getLastName(), "LastName value is not correct.");
    }
    public void setEMAil(){
        practiceFormPage.setEMAil("aleynayavuz@gmail.com");
        Assertions.assertEquals("aleynayavuz@gmail.com", practiceFormPage.getEmail(), "Email value is not correct.");

    }
}
