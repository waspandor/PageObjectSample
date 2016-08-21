package com.bbc;

/**
 * Created by Waseem on 8/21/2016.
 */
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(format = { "pretty", "json:target/json/output.json" }, features = "src/test/resource",tags = "@test"
)
public class RunnerTest {

}