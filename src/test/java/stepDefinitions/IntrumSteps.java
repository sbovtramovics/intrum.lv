package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages_intrum.ContactPage;
import pages_intrum.FormPage;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static util.CsvParser.readAllDataAtOnce;

public class IntrumSteps {
    static ContactPage contactPage;
    static FormPage formPage;
    private WebDriver driver;
    private WebDriverWait wait;
    private int addedFavouriteSections;

    public IntrumSteps() {
        this.addedFavouriteSections = 0;
        this.driver = Hooks.driver;
        this.wait = Hooks.wait;
        contactPage = PageFactory.initElements(Hooks.driver, ContactPage.class);
        formPage = PageFactory.initElements(Hooks.driver, FormPage.class);
    }

    @Given("^I (?:am on|open) the home page$")
    public void iAmOnHomePage() {
        driver.manage().window().maximize();
        driver.get(contactPage.getPageUrl());
    }

    @When("^I (?:am on|open) the form page$")
    public void iAmOnFormPage() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get(contactPage.getPageUrl());
        sleep(2000);
        contactPage.clickAcceptAllCookiesButton();
        contactPage.clickFormButton();
    }

    @And("^I click Submit button$")
    public void iClickSubmitButton() {
        formPage.clickSubmitButton();
    }

    @Then("^I see the validation messages$")
    public void iSeeTheValidationMessages() {
        assertEquals("The validation errors count is not as expected", 7, formPage.getValidationErrorsCount());
        assertTrue("The validation of Name Surname input field is not displayed", formPage.validateNameSurname());
        assertTrue("The validation of SSN input field is not displayed", formPage.validateSsn());
        assertTrue("The validation of Phone input field is not displayed", formPage.validatePhone());
        assertTrue("The validation of Email input field is not displayed", formPage.validateEmail());
        assertTrue("The validation of Address input field is not displayed", formPage.validateAddress());
        assertTrue("The validation of Comment input field is not displayed", formPage.validateComment());
        assertTrue("The validation of Reply input field is not displayed", formPage.validateReply());
    }

    @Then("^I don't see the validation messages$")
    public void iDonTSeeTheValidationMessages() {
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        assertEquals("The validation errors count is not 0", 0, formPage.getValidationErrorsCount());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @And("^I type data from csv file line (\\d+)$")
    public void iTypeDataFromCsvFileLineNumber(int number) {
        int i = number - 1;
        formPage.typeNameSurname(Objects.requireNonNull(readAllDataAtOnce()).get(i)[0] + " " + Objects.requireNonNull(readAllDataAtOnce()).get(i)[1]);
        formPage.typeSsn(Objects.requireNonNull(readAllDataAtOnce()).get(i)[2]);
        formPage.typeCase(Objects.requireNonNull(readAllDataAtOnce()).get(i)[3]);
        formPage.typePhone(Objects.requireNonNull(readAllDataAtOnce()).get(i)[4]);
        formPage.typeEmail(Objects.requireNonNull(readAllDataAtOnce()).get(i)[5]);
        formPage.typeAddress(Objects.requireNonNull(readAllDataAtOnce()).get(i)[6]);
        formPage.typeComment(Objects.requireNonNull(readAllDataAtOnce()).get(i)[7]);
        formPage.typeReply(Objects.requireNonNull(readAllDataAtOnce()).get(i)[8]);
    }
}