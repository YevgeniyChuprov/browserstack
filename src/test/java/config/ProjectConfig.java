package config;

import org.aeonbits.owner.Config;

@ProjectConfig.LoadPolicy(ProjectConfig.LoadType.MERGE)
@ProjectConfig.Sources({
        "classpath:${env}.properties"
})
public interface ProjectConfig extends Config {
    @Key("login")
    String login();

    @Key("password")
    String password();

    @Key("baseURL")
    String baseUrl();

    @Key("appURL")
    String appUrl();

    @Key("device")
    String device();

    @Key("os_version")
    String osVersion();

    @Key("project")
    String projectName();

    @Key("build")
    String buildName();

    @Key("name")
    String testName();
}

