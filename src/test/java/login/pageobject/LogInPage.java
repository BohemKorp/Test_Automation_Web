package login.pageobject;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://beta.id90travel.com/login/")
public class LogInPage extends PageObject {

    @FindBy(id="airline")
    WebElementFacade txtAirline;

    @FindBy(css = "#airline-email-3")
    WebElementFacade txtEmail;

    @FindBy(css = "#airline-password-3")
    WebElementFacade txtPassword;

    @FindBy(xpath = "//form[@id='airline-employee-form-3']//button[@class='btn btn-primary my-2 w-100'][contains(text(),'Log In')]")
    WebElementFacade btnLogIn;

    @FindBy(xpath = "//div[contains(text(),'Invalid login credentials.')]")
    WebElement invalidCredentials;

    @FindBy(xpath = "//div[contains(text(),'Company is required')]")
    WebElement errorCompanyNull;

    @FindBy(xpath = "//div[contains(text(),'Email or Employee Number is required')]")
    WebElement errorEmailNull;

    @FindBy(xpath = "//div[@class='tab-pane active']//div[@class='error-message'][contains(text(),'Password is required')]")
    WebElement errorPasswordNull;

    public void setAirline(String company) {
        txtAirline.type(company);
    }

    public void setEmail(String email) {
        txtEmail.type(email);
    }

    public void setPassword(String password) {
        txtPassword.type(password);
    }


    public void signIn() {
        btnLogIn.click();
    }

    public boolean isValidUser(){
        return !invalidCredentials.isDisplayed();
    }

    public boolean isUserNull(){
        return errorCompanyNull.isDisplayed()||errorEmailNull.isDisplayed()||errorPasswordNull.isDisplayed();
    }
}
