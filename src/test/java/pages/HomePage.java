package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends CommonPage{

    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    
    public By byLocal(String local){

        return By.cssSelector("optin[value=\"" + local + "\"]");
    }

    @FindBy(css = ".btn-primary")
    WebElement btnFindFlights;

    public void selecionarOrigemDestino(String byOrigem, String byDestino){
        driver.findElement(byLocal(byOrigem)).click();
        driver.findElement(byLocal(byDestino)).click();
    }

    public void clicarBotaoFindFlights(){
        
    }
}