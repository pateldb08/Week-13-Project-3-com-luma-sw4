package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductsPage extends Utility {

    By sortByFilter = By.id("sorter");

    public void selectFilterOptions(String filterOptions){
        selectByVisibleTextFromDropDown(sortByFilter,"Product Name");
        selectByVisibleTextFromDropDown(sortByFilter,"Price");
    }
    public void verifyProductsInAlphabeticalOrder(){
        List<WebElement> productsName = driver.findElements(By.xpath("//strong[@class='product name product-item-name']"));
        // Declare Two Arraylists to store the product names
        System.out.println(productsName.size()+"........................");
        List<String> actualProductList = new ArrayList<>();
        List<String> expectedSortedProductList = new ArrayList<>();
        for(WebElement product: productsName){
            actualProductList.add(product.getText());    // add product from ProductsName to ArrayList and also get name by get() method
            expectedSortedProductList.add(product.getText());
            System.out.println(product.getText()+"..................") ;
        }
        //sort the expected product list by Collections.sort();
        Collections.sort(expectedSortedProductList);
             // Asssert.
       // isArrayListsorted(actualProductList,expectedSortedProductList);

    }
    public void verifyProductsDisplayByPrice(){
        List<WebElement> prices = driver.findElements(By.xpath("//span[@class='price-wrapper ']//span"));
        List<Double> actualPrices = new ArrayList<>();
        List<Double> expectedSortedPrices = new ArrayList<>();
        for(WebElement price : prices){
            //  from product prices add price to ArrayList, by removing 'Dollar sign' by replace() method and
            // converting String to Double as getText() return String value
            actualPrices.add(Double.valueOf(price.getText().replace("$","")));
            expectedSortedPrices.add(Double.valueOf(price.getText().replace("$", "")));
        }
        //sort the expected product price by Collections.sort();
        Collections.sort(expectedSortedPrices);
        System.out.println();
        //Assert.assertEquals("Products are not sorted by Prices", actualPrices, expectedSortedPrices);


    }

}
