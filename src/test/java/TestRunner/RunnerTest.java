package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= {"AllFeaturesFiles"},
		glue= {"StepDefinitions"}
		)
	public class RunnerTest extends AbstractTestNGCucumberTests {

	}


