import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracticeFormPage extends BasePage{


    private final By nameLocator = By.id("firstName");
    private final By lastNameLocator = By.id("lastName");
    private final By emailLocator = By.id("userEmail");

    private GenderSection genderSection;



    public  PracticeFormPage(WebDriver driver){
        super(driver);
        driver.get(baseUrl.concat("automation-practice-form"));
        genderSection = new GenderSection(driver);
    }

    public GenderSection genderSection(){
        return this.genderSection;
    }


    public void setName(String name) {
        type(nameLocator,name);

    }

    public void setLastName(String lastName){
        type(lastNameLocator,lastName);


    }

    public void setEmail(String mailAddress){
        type(emailLocator,mailAddress);

    }

    public String getName(){
        return find(nameLocator).getAttribute("value");
    };

    public String getLastName() {
        return find(lastNameLocator).getAttribute("value");
    }

    public String getEmail() {
       return find(emailLocator).getAttribute("value");
    }
}
