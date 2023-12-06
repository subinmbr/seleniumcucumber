package runners;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features="src//test//resources//features//",
glue= {"stepDefs"},
dryRun = false,
monochrome = true,
plugin= {"pretty",
		"html:target\\Reports\\HtmlReport.html",
		/*"usage:target\\Reports\\UsageReport",
		"json:target\\Reports\\JsonReport.json"*/
		
		//"rerun:target\\failedScenarios.txt"
		//"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
},

tags = "@SmokeTest"

//    - - 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     - - 
// feature level   - - - tags =  "@phaseOne

//tags = "@SmokeTest" and  "@Regression"
//tags = "@SmokeTest" or  "@Regression"
//tags = "not @Regression"

//run the smoke test of phaseOne feature only ... . .  . .

// tags  = @PhaseOne" and "@Smoketest"

//tags  = not @PhaseOne and @regressiontest"

// tags =  "@phaseone and not @regressiontest"



)


public class ApplicationRunner extends AbstractTestNGCucumberTests{
	
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		
		return super.scenarios();
		
	}
	
	

}
