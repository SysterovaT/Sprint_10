package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    private By orderButton = By.xpath("//div[@class='Button_Button__ra12g Button_UltraBig__UU3Lp']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOrderButton() {
        driver.findElement(orderButton).click();
    }

}
