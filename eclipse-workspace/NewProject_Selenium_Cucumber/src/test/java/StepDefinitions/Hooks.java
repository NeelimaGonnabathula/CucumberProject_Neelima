package StepDefinitions;

import java.io.IOException;

import Utilities.UtilityVariables;
import io.cucumber.java.After;

public class Hooks {
	
 public UtilityVariables utilityvar;	
 public Hooks(UtilityVariables utilityvar)
 {
	 this.utilityvar = utilityvar;
 }
 
@After 
public void afterScenario() throws IOException
{
	utilityvar.tb1.WebDriverManager().quit();
}
}
