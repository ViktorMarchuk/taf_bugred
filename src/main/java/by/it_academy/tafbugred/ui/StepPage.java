package by.it_academy.tafbugred.ui;

import org.openqa.selenium.WebDriver;

public class StepPage extends BugRedPage{
    public StepPage(WebDriver driver){
        super(driver);
    }

    public void ActionsWithPageTafBugRed(){
        openPage(URL);
        clickButtonEnter();
    }
}
