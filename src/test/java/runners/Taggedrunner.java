
package runners;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features="src//test//resources//taggedFeatures",
glue= {"stepDefs.taggedStepDefs"},
dryRun = false,
monochrome = true,
plugin= 
{"html:target\\Reports\\HtmlReport.html",
		/*"usage:target\\Reports\\UsageReport",
		"json:target\\Reports\\JsonReport.json"*/
		
		//"rerun:target\\failedScenarios.txt"
		//"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
},

tags = "Smoketest"
)


public class Taggedrunner extends AbstractTestNGCucumberTests{
	

	

}
