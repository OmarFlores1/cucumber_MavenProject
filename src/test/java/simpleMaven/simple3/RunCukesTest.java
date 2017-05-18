package simpleMaven.simple3;
//import org.junit.RunWith;

import cucumber.api.CucumberOptions;
//import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@CucumberOptions(
        features = "src/test/java" //, //resources/features",
        //glue = "com.testing"
)
@org.junit.runner.RunWith(Cucumber.class)
public class RunCukesTest {

}
