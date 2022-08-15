import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_GenderSelection extends BaseTest{
    @Test
    public void check_maleRadioButton(){
        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        practiceFormPage.genderSection().clickRadioButton(GenderSection.Genders.MALE);
        Assertions.assertTrue(practiceFormPage.genderSection().isRadioButtonChecked(GenderSection.Genders.MALE),
                 "Male radio button is not check");
    }
    @Test
    public void check_femaleRadioButton(){
        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        practiceFormPage.genderSection().clickRadioButton(GenderSection.Genders.FEMALE);
        Assertions.assertTrue(practiceFormPage.genderSection().isRadioButtonChecked(GenderSection.Genders.FEMALE),
                "Female radio button is not check");
    }
    @Test
    public void check_otherRadioButton(){
        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        practiceFormPage.genderSection().clickRadioButton(GenderSection.Genders.OTHER);
        Assertions.assertTrue(practiceFormPage.genderSection().isRadioButtonChecked(GenderSection.Genders.OTHER),
                "Other radio button is not check");
    }
}
