package ebay.core;


public class ElementRepo extends Page {

    public String searchBox = "#gh-ac";
    public String submitSearch = "#gh-btn";
    public String lowestPrice = "//*[@id='DashSortByContainer']/ul[1]/li";
    public String highestPrice = "//*[@id='DashSortByContainer']/ul[1]/li";
    public String newlyListed = "//*[@id='DashSortByContainer']/ul[1]/li";
    public String itemSelection = "//*[@id=\"ListViewInner\"]";
    public String allListings = "//*[@id=\"cbelm\"]/div[1]/div[2]/span";
    public String auction = "//*[@id=\"cbelm\"]/div[1]/div[2]/a[1]";
    public String buyItNow = "//*[@id=\"cbelm\"]/div[1]/div[2]/a[2]";


}
