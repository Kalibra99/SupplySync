package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.Driver;

public class Hooks {
    @Before
    public void beforeScenario(){
        System.out.println("This is before scenario method");

    }

    @After
    public void afterScenario(){
        System.out.println("This is after scenario method");
        Driver.closeDriver();
    }
}
