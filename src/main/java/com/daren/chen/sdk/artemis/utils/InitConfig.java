package com.daren.chen.sdk.artemis.utils;

import org.apache.commons.lang3.StringUtils;

import com.hikvision.artemis.sdk.config.ArtemisConfig;

/**
 * @Description:
 * @author: chendaren
 * @CreateDate: 2020/1/20 17:29
 */
public class InitConfig {

    public static synchronized void init(String host, String appKey, String appSecret, String requestType) {
        if (StringUtils.isBlank(host) || StringUtils.isBlank(appKey) || StringUtils.isBlank(appSecret)) {
            throw new RuntimeException("初始化失败,参数为空");
        }
        /**
         * STEP1：设置平台参数，根据实际情况,设置host appkey appsecret 三个参数.
         */
        ArtemisConfig.host = host; // artemis网关服务器ip端口
        ArtemisConfig.appKey = appKey; // 秘钥appkey
        ArtemisConfig.appSecret = appSecret;// 秘钥appSecret

        //
        PreviewURLsApiUtil.REQUEST_TYPE = requestType;
    }
}
