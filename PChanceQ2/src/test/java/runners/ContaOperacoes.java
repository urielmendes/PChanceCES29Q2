package runners;
 
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.*;

@RunWith(Cucumber.class) 

@CucumberOptions(  monochrome = true,
tags = "@contaOperacoes",
features = "src/test/resources/features/",
dryRun = false,
glue = "steps" )

public class ContaOperacoes {}