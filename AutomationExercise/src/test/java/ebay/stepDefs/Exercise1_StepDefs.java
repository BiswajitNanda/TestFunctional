package ebay.stepDefs;


import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ebay.pageObjects.Search;


import static ebay.core.DriverFactory.getDriver;


public class Exercise1_StepDefs {

    Search user = new Search();

    @Given("^user is on ebay$")
    public void user_is_on_ebay() throws Throwable {
        getDriver();
        user.open("http://www.ebay.co.uk/");
    }

    @Given("^User searches \"([^\"]*)\"$")
    public void user_searches(String query) throws Throwable {
        user.searchForAnItem(query);
    }

    @When("^user sort by \"([^\"]*)\"$")
    public void user_sort_by(String options) throws Throwable {
        user.selectSort(options);
    }

    @When("^user filter by \"([^\"]*)\"$")
    public void user_filter_by(String listings) throws Throwable {
        user.filteringItems(listings);
    }

    @When("^user selects an item from the search result$")
    public void user_selects_an_item_from_the_search_result() throws Throwable {
        user.selectItemFromTheSearchResult();
    }

    @Then("^the \"([^\"]*)\" should get display$")
    public void the_should_get_display(String result) throws Throwable {
        user.verifyThatItemHasFreePostage(result);
        user.verifyTheGivenPrice(result);
        user.verifyThatItemHasBids(result);
    }

    @After
    public void tearDownDriver() {
        getDriver().quit();
    }


}
