package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "input")
    public WebElement loginButton;

    @FindBy(id = "password")
    public WebElement passwordButton;

    @FindBy(xpath = "//button[@class='sc-kfPuZi bvauHb']")
    public WebElement signInButton;


}
