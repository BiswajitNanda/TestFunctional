package ebay.pageObjects;

import ebay.core.ElementRepo;
import ebay.core.Page;

public class Search extends ElementRepo {

    /**
     * Allow sorting by ​Best Match​/ ​Lowest Price + P&P​/ ​Highest Price ​/ ​Newly listed and the
     * like Filter by ​All listings​/ ​Auction​/ ​Buy it now
     * Verify that any given item (e.g. first result) has Free Postage, Number of bids (if the Auction
     * filter is applied, or Buy it now in the case of Buy it now) and the given price
     **/

    public void selectSort(String sortType) throws InterruptedException {
        switch (sortType) {
            case "Lowest Price":
                findXpath(lowestPrice).click();
                findLinkText("Lowest price").click();
                break;
            case "Highest price":
                findXpath(highestPrice).click();
                findLinkText("Highest price").click();
                break;
            case "Newly listed":
                findXpath(newlyListed).click();
                findLinkText("Newly listed").click();
                break;
            default:
                System.out.println("Please select 'Lowest Price', 'Highest price' or 'Newly listed' sort type");
                break;
        }
    }

    public void searchForAnItem(String searchQuery) throws InterruptedException {
        findCss(searchBox).sendKeys(searchQuery);
        findCss(submitSearch).click();
        Thread.sleep(10000);
        try {
            selectSort("Lowest Price");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void selectItemFromTheSearchResult() {
        findXpath(itemSelection).click();

    }

    public void filteringItems(String filterType) {
        switch (filterType) {
            case "All listings":
                findXpath(allListings).click();
                break;
            case "Auction":
                findXpath(auction).click();
                break;
            case "Buy it now":
                findXpath(buyItNow).click();
                break;
            default:
                System.out.println("Please select 'All listings', 'Auction' or 'Buy it now' filter option");
                break;
        }
    }

    public void verifyThatItemHasFreePostage(String expectedValue) {
        verify(expectedValue);
        //Verify that any given item (e.g. first result) has Free Postage, Number of bids (if the Auction
        //filter is applied, or Buy it now in the case of Buy it now) and the given price
    }


    public void verifyThatItemHasBids(String expectedValue) {
        verify(expectedValue);

    }

    public void verifyTheGivenPrice(String expectedValue) {
        verify(expectedValue);
    }

}

