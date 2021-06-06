package pages_intrum;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ContactPage {
    @FindBy(how = How.CSS, using = "#onetrust-accept-btn-handler")
    private WebElement acceptAllCookiesButton;
    @FindBy(how = How.CSS, using = "#onetrust-pc-btn-handler")
    private WebElement cookieSettingsButton;
    @FindBy(how = How.CSS, using = ".button.use-popup")
    private WebElement formButton;

    public String getPageUrl() {
        return "https://www.intrum.lv/saistibu-parvaldisana/sazinieties-ar-mums/";
    }

    public void clickAcceptAllCookiesButton() {
        acceptAllCookiesButton.click();
    }

    public void clickFormButton() {
        formButton.click();
    }
}
