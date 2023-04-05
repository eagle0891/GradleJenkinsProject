package StepDefs;

import Helpers.Base;
import io.cucumber.java.en.Given;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.MalformedURLException;

public class SearchStepDefs extends Base {

    private static final Logger LOG = LoggerFactory.getLogger(Base.class);
    @Given("^the user is on the website '(.*)' using '(.*)'$")
    public void navigateToWebsite(String websiteURL, String browser) throws MalformedURLException {
        System.out.println("**** Navigating to site " + websiteURL);
        openBrowser(browser);
        navigateToSite(websiteURL);
    }
}
