package login.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import login.pageobject.HomePage;
import login.pageobject.LogInPage;
import org.junit.Assert;

import static login.pageobject.HomePage.TITLE_RESULT;

public class AirlineEmployee {

    LogInPage loginPage;
    HomePage homePage;

    @Given("^The user access login form$")
    public void loginWeb() throws Throwable{
        loginPage.setDefaultBaseUrl("https://beta.id90travel.com/login/");
        loginPage.open();
    }

    @When("^The user complete (.*) , (.*) and (.*)$")
    public void enter_data(String company, String username, String password) throws Throwable {
        loginPage.setAirline(company);
        loginPage.setEmail(username);
        loginPage.setPassword(password);
    }

    @And("^Press login button$")
    public void send_information() throws Throwable {
        loginPage.signIn();
    }

    @And("^The user press (.*)$")
    public void navigation(String action) throws Throwable {
        loginPage.signIn();
    }


    @Then("^The user access is (.*)$")
    public void enter_the_platform(String result) throws Throwable{
        if (result.equals("Success")){
            homePage.validar();
            Assert.assertEquals(TITLE_RESULT,homePage.getTitleHome());

        }
        else if(result.equals("IncorrectUser")){
            Assert.assertFalse(loginPage.isValidUser());
        }
        else if(result.equals("UserNull")){
            Assert.assertTrue(loginPage.isUserNull());
        }

    }

    @Then("^is redirected to form (.*)$")
    public void isRedirectedToFormPasswordReset(String action) {
    }
}

