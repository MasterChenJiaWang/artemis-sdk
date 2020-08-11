package com.daren.chen.sdk.artemis.test;

import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.daren.chen.sdk.artemis.utils.CustomizeArtemisConfig;
import com.daren.chen.sdk.artemis.utils.CustomizeHttpUtil;
import com.daren.chen.sdk.artemis.utils.Environment;
import com.hikvision.artemis.sdk.config.ArtemisConfig;

/**
 * @Description:
 * @author: chendaren
 * @CreateDate: 2020/1/20 14:38
 */
public class GetCameraPreviewURL {

    public static String GetCameraPreviewURL() {

        /**
         * STEP1：设置平台参数，根据实际情况,设置host appkey appsecret 三个参数.
         */
        // ArtemisConfig.host = "api.unittec.iotube.cn"; // artemis网关服务器ip端口
        ArtemisConfig.host = "192.168.1.33:443"; // artemis网关服务器ip端口
        ArtemisConfig.appKey = "25151313"; // 秘钥appkey
        ArtemisConfig.appSecret = "WQEzkBbsebKTxZgcrpDY";// 秘钥appSecret
        CustomizeArtemisConfig customizeArtemisConfig =
            new CustomizeArtemisConfig(ArtemisConfig.host, ArtemisConfig.appKey, ArtemisConfig.appSecret);
        Environment.setArtemisConfig(customizeArtemisConfig);
        /**
         * STEP2：设置OpenAPI接口的上下文
         */
        final String ARTEMIS_PATH = "/artemis";

        /**
         * STEP3：设置接口的URI地址
         */
        final String previewURLsApi = ARTEMIS_PATH + "/api/resource/v1/regions/root";
        Map<String, String> path = new HashMap<String, String>(2) {
            {
                put("https://", previewURLsApi);// 根据现场环境部署确认是http还是https
            }
        };
        /**
         * STEP4：设置参数提交方式
         */
        // String contentType = "application/json";
        String contentType = "application/json";
        /**
         * STEP5：组装请求参数
         */
        Map<String, Object> jsonBody = new HashMap<>(16);
        // jsonBody.put("cameraIndexCode", "748d84750e3a4a5bbad3cd4af9ed5101");
        // jsonBody.put("streamType", 0);
        // jsonBody.put("protocol", "rtsp");
        // jsonBody.put("transmode", 1);
        // jsonBody.put("expand", "streamform=ps");
        jsonBody.put("pageNo", "1");
        jsonBody.put("pageSize", "100");
        // jsonBody.put("resourceType", "camera");
        String body = JSON.toJSONString(jsonBody);
        /**
         * STEP6：调用接口
         */
        String result = CustomizeHttpUtil.doPostStringArtemis(path, body, null, null, contentType);// post请求application/json类型参数
        return result;
    }

    public static void main(String[] args) {
        String result = GetCameraPreviewURL();
        System.out.println("result结果示例: " + result);
    }
}
