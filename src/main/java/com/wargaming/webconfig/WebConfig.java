package com.wargaming.webconfig;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.ConfigFactory;

/**
 * The interface Web config.
 */
@Config.Sources({"classpath:${env}.properties"})
public interface WebConfig extends Config {

    /**
     * Value BASE_CONFIG.
     */
    WebConfig BASE_CONFIG = ConfigFactory.create(WebConfig.class, System.getenv(), System.getProperties());

    /**
     * Value api.url.
     *
     * @return url. url
     */
    @DefaultValue("https://api.worldoftanks.eu/wot/account/")
    @Key("api.url")
    String getApiUrl();
}
