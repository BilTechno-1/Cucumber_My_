package StepDefinitions;

import Utilities.GWD;
import io.cucumber.java.After;

public class Hooks {
    // Cucumbera ait her senaryodan sonra çalışan
    // Annotation
    @After
    public void after() {
        GWD.quitDriver();}
}
