package login.pageobject;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("https://beta.id90travel.com/")
public class HomePage extends PageObject {

    public static final String TITLE_RESULT = "Begin your Next Adventure";
    @FindBy(xpath = "//button[contains(text(),'Connect Facebook')]")
    WebElement popUpFacebook;

    @FindBy(xpath = "//a[@class='btn clickable']")
    WebElementFacade showMeLater;

    @FindBy(xpath = "//h1[contains(text(),'Begin your Next Adventure')]")
    WebElement titleHome;

    public void validar() {

        if(popUpFacebook.isDisplayed()){
            showMeLater.click();
        }

    }

    public String getTitleHome(){
        return titleHome.getText();
    }


}
