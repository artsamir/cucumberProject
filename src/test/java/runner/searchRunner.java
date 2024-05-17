package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		features = "C:\\Users\\samir\\Downloads\\cucumber Project\\src\\test\\resources\\eBayfeatures\\search.feature",
		glue = "Steps"
		)



public class searchRunner {

}
