package drivers;

import com.codeborne.selenide.WebDriverProvider;
import config.ProjectConfig;
import lombok.SneakyThrows;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import javax.annotation.Nonnull;
import java.net.URL;

public class BrowserstackDriver implements WebDriverProvider {

    private static ProjectConfig config = ConfigFactory.create(ProjectConfig.class);
    @SneakyThrows
    @Override
    @Nonnull
    public WebDriver createDriver(@Nonnull Capabilities capabilities) {
        System.out.println("config.device() -- " + config.device());
//        MutableCapabilities mutableCapabilities = new MutableCapabilities();
//        mutableCapabilities.merge(capabilities);
//
//        // Set your access credentials
//        mutableCapabilities.setCapability("browserstack.user", config.login());
//        mutableCapabilities.setCapability("browserstack.key", config.password());
//
//        // Set URL of the application under test
//        mutableCapabilities.setCapability("app", config.appUrl());
//
//        // Specify device and os_version for testing
//        mutableCapabilities.setCapability("device", config.device());
//        mutableCapabilities.setCapability("os_version",config.osVersion());
//
//        // Set other BrowserStack capabilities
//        mutableCapabilities.setCapability("project", config.projectName());
//        mutableCapabilities.setCapability("build", config.buildName());
//        mutableCapabilities.setCapability("name", config.testName());
//
//        // Initialise the remote Webdriver using BrowserStack remote URL
//        // and desired capabilities defined above
//        return new RemoteWebDriver(new URL(config.baseUrl()), mutableCapabilities);
        //============================================
        MutableCapabilities mutableCapabilities = new MutableCapabilities();
        mutableCapabilities.merge(capabilities);

        // Set your access credentials
        mutableCapabilities.setCapability("browserstack.user", "asdasdqwdffsfdwe_FJixVj");
        mutableCapabilities.setCapability("browserstack.key", "Lstx5wXmrYFxG5o5G46S");

        // Set URL of the application under test
        mutableCapabilities.setCapability("app", "bs://c700ce60cf13ae8ed97705a55b8e022f13c5827c");

        // Specify device and os_version for testing
        mutableCapabilities.setCapability("device", "Google Pixel 3");
        mutableCapabilities.setCapability("os_version", "9.0");

        // Set other BrowserStack capabilities
        mutableCapabilities.setCapability("project", "First Java Project");
        mutableCapabilities.setCapability("build", "browserstack-build-1");
        mutableCapabilities.setCapability("name", "first_test");

        // Initialise the remote Webdriver using BrowserStack remote URL
        // and desired capabilities defined above
        return new RemoteWebDriver(new URL("http://hub.browserstack.com/wd/hub"), mutableCapabilities);
    }
}
