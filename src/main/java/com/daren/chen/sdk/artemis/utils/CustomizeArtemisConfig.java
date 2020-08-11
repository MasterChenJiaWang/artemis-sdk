package com.daren.chen.sdk.artemis.utils;

import lombok.EqualsAndHashCode;

/**
 * @Description:
 * @author: chendaren
 * @CreateDate: 2020/3/23 8:44
 */
@EqualsAndHashCode(callSuper = false)
public class CustomizeArtemisConfig {

    /**
     *
     */
    private String ip;


    /**
     *
     */
    private String port;
    /**
     *
     */
    public String host;
    /**
     *
     */
    public String appKey;
    /**
     *
     */
    public String appSecret;

    public CustomizeArtemisConfig() {
    }

    public CustomizeArtemisConfig(String host, String appKey, String appSecret) {
        this.host = host;
        this.appKey = appKey;
        this.appSecret = appSecret;
    }

    public CustomizeArtemisConfig(String ip, String port, String appKey, String appSecret) {
        this.ip = ip;
        this.port = port;
        this.appKey = appKey;
        this.appSecret = appSecret;
        this.host = ip + ":" + port;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    public String getAppSecret() {
        return appSecret;
    }

    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }
}
