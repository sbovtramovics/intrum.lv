package pages_intrum;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class FormPage {
    @FindBy(how = How.CSS, using = ".btn.primary")
    private WebElement submitButton;

    @FindBy(how = How.CSS, using = ".vārdsuzvārds input")
    private WebElement nameSurnameInputField;
    @FindBy(how = How.CSS, using = ".personaskods input")
    private WebElement ssnInputField;
    @FindBy(how = How.CSS, using = ".lietasnumursnavobligāts input")
    private WebElement caseInputField;
    @FindBy(how = How.CSS, using = ".kontakttālrunis input")
    private WebElement phoneInputField;
    @FindBy(how = How.CSS, using = ".epastaadrese input")
    private WebElement emailInputField;
    @FindBy(how = How.CSS, using = ".adrese input")
    private WebElement addressInputField;
    @FindBy(how = How.CSS, using = ".komentāraiebildumubūtība textarea")
    private WebElement commentInputField;
    @FindBy(how = How.CSS, using = ".kāvēlossaņemtatbildi select")
    private WebElement replyInputField;

    @FindBy(how = How.CSS, using = ".vārdsuzvārds .field-validation-error")
    private WebElement nameSurnameInputValidation;
    @FindBy(how = How.CSS, using = ".personaskods .field-validation-error")
    private WebElement ssnInputValidation;
    @FindBy(how = How.CSS, using = ".kontakttālrunis .field-validation-error")
    private WebElement phoneInputValidation;
    @FindBy(how = How.CSS, using = ".epastaadrese .field-validation-error")
    private WebElement emailInputValidation;
    @FindBy(how = How.CSS, using = ".adrese .field-validation-error")
    private WebElement addressInputValidation;
    @FindBy(how = How.CSS, using = ".komentāraiebildumubūtība .field-validation-error")
    private WebElement commentInputValidation;
    @FindBy(how = How.CSS, using = ".kāvēlossaņemtatbildi .field-validation-error")
    private WebElement replyInputValidation;
    @FindBy(how = How.CLASS_NAME, using = "field-validation-error")
    private List<WebElement> inputValidation;


    public void typeNameSurname(String text) {
        nameSurnameInputField.sendKeys(text);
    }

    public void typeSsn(String text) {
        ssnInputField.sendKeys(text);
    }

    public void typeCase(String text) {
        caseInputField.sendKeys(text);
    }

    public void typePhone(String text) {
        phoneInputField.sendKeys(text);
    }

    public void typeEmail(String text) {
        emailInputField.sendKeys(text);
    }

    public void typeAddress(String text) {
        addressInputField.sendKeys(text);
    }

    public void typeComment(String text) {
        commentInputField.sendKeys(text);
    }

    public void typeReply(String text) {
        replyInputField.sendKeys(text);
    }

    public boolean validateNameSurname() {
        return nameSurnameInputValidation.isDisplayed();
    }

    public boolean validateSsn() {
        return ssnInputValidation.isDisplayed();
    }

    public boolean validatePhone() {
        return phoneInputValidation.isDisplayed();
    }

    public boolean validateEmail() {
        return emailInputValidation.isDisplayed();
    }

    public boolean validateAddress() {
        return addressInputValidation.isDisplayed();
    }

    public boolean validateComment() {
        return commentInputValidation.isDisplayed();
    }

    public boolean validateReply() {
        return replyInputValidation.isDisplayed();
    }

    public void clickSubmitButton() {
        submitButton.click();
    }

    public int getValidationErrorsCount() {
        return inputValidation.size();
    }
}
