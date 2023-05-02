package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.ProductsPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;


public class WomenTest extends BaseTest {

    HomePage homePage = new HomePage();
    ProductsPage productsPage = new ProductsPage();

    @Test
    public void verifyTheSortByProductNameFilter() {

        homePage.mouseHoverOnWomenMenu();
        //  homePage.mouseHoverOnTops();
        homePage.clickOnJackets();
        productsPage.selectFilterOptions("Products Name");

        productsPage.verifyProductsInAlphabeticalOrder();
        Assert.assertEquals(productsPage.ac,expectedSortedProductList);

    }

    @Test
    public void verifyTheSortByPriceFilter() {
        productsPage.verifyProductsDisplayByPrice();
    }


}
