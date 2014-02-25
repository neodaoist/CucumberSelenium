package com.swm.cucumberselenium;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@Cucumber.Options(
        features = "src/test/resources/User",
        format = {"json:target/integration_cucumber.json"},
        tags = {"@run"}
)
public class LoginTest {
}
