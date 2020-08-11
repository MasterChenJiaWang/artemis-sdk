package com.daren.chen.sdk.artemis.utils;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

/**
 * @Description:
 * @author: chendaren
 * @CreateDate: 2020/1/20 17:16
 */
public class PreviewURLsApiUtil {

    public volatile static String REQUEST_TYPE;

    /**
     *
     * @param previewUrlsApi
     * @return
     */
    public static Map<String, String> getPath(String previewUrlsApi) {
        if (StringUtils.isBlank(previewUrlsApi)) {
            throw new RuntimeException("path is empty");
        }
        Map<String, String> map = new HashMap<>(2);
        if (StringUtils.isBlank(REQUEST_TYPE)) {
            REQUEST_TYPE = "https://";
        }
        map.put(REQUEST_TYPE, previewUrlsApi);
        return map;
    }

    /**
     *
     * @param previewUrlsApi
     * @return
     */
    public static Map<String, String> getPath(String previewUrlsApi, String requestType) {
        if (StringUtils.isBlank(previewUrlsApi)) {
            throw new RuntimeException("path is empty");
        }
        Map<String, String> map = new HashMap<>(2);
        if (StringUtils.isBlank(requestType)) {
            requestType = "https://";
        }
        map.put(requestType, previewUrlsApi);
        return map;
    }
}
