package general;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {
    protected WebDriver driver;
  //Ao usar Page Factory mudar de public para protect
    public Base(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
}



