package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features",glue="stepDefinitions",tags="@60045_TC1 or @60045_TC2")
public class LoginTest {

}
