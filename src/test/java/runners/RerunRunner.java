package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;

import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
features="@target/failedScenarios.txt",
glue= {"stepDefs"},
dryRun = false,
monochrome = true,
plugin= {"pretty",
		/*"html:target\\Reports\\HtmlReport.html",
		"usage:target\\Reports\\UsageReport",
		"json:target\\Reports\\JsonReport.json"*/
		
		"rerun:target\\failedScenarios.txt"
		
}
)


public class RerunRunner extends AbstractTestNGCucumberTests{
	
	
	

}
