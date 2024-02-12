package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/Features",
        glue = {"stepDefinitions"},
      //  tags = "@Activity1"
      //  tags = "@activity2"
      //  tags = "@activity3",
       // tags = "@activity4",
      //  tags = "@activity5",
        tags="@SimpleAlert",

        plugin={"pretty"},
        monochrome = true
    //    plugin={"html:test-reports/HTML_Reports.html"}
)

public class ActivitiesRunner {
    //empty
}
