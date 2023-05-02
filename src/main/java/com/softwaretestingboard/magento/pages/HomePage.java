package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By womenMenu = By.xpath("//span[normalize-space()='Women']");
    By topsMenu = By.xpath("//a[@id='ui-id-9']");
    By jacketsMenu = By.xpath("//a[contains(text(),'Jackets')]");

    public void mouseHoverOnWomenMenu() {
        mouseHoverToElementAndClick(womenMenu);
        //mouseHoverToElement(womenMenu);
    }

    public void mouseHoverOnTops() {
        mouseHoverToElement(topsMenu);
    }

    public void clickOnJackets() {
        mouseHoverToElementAndClick(jacketsMenu);
    }


}
