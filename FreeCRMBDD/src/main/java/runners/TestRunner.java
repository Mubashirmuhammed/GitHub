package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"C:\\QA\\SeleniumWorkSpace\\FreeCRMBDD\\src\\main\\java\\Features\\tagging.feature"},//the path of the feature files
		glue={"stepDefinitions"},
		plugin ={"pretty","html:test-outout/output.html", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"},
		dryRun = false,
		monochrome = true
		//strict =true
		//tags = {"~@SmokeTest" , "~@RegressionTest", "~@End2End"}
		)
public class TestRunner {
	


}
