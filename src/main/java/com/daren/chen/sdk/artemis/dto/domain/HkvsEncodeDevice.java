package com.daren.chen.sdk.artemis.dto.domain;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @Description:
 * @author: chendaren
 * @CreateDate: 2020/1/20 17:46
 */
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
public class HkvsEncodeDevice implements Serializable {
    private static final long serialVersionUID = 1786929345628104335L;

    /**
     * 所属服务编号
     */
    private String belongIndexCode;
    /**
     * 能力集，参考附录A.22，多个用@隔开
     */
    private String capability;
    /**
     * 设备驱动
     */
    private String deviceKey;
    /**
     * 设备驱动版本号
     */
    private String deviceKeyVersion;

    /**
     * 设备系列
     */
    private String deviceType;
    /**
     * 设备序列号
     */
    private String devSerialNum;

    /**
     * 资源唯一编码
     */
    private String indexCode;

    /**
     * IP地址
     */
    private String ip;

    /**
     * 厂商
     */
    private String manufacturer;

    /**
     * 资源名称
     */
    private String name;

    /**
     * 网域
     */
    private String netZoneId;

    /**
     * 端口
     */
    private String port;

    /**
     * 所属区域编码
     */
    private String regionIndexCode;

    /**
     * 资源类型，encodeDevice：编码设备
     */
    private String resourceType;

    /**
     * 接入协议，参考附录A.6
     */
    private String treatyType;

    /**
     * 创建时间（IOS8601格式：yyyy-MM-ddTHH:mm:ss.SSSXXX）例如北京时间：2017-06-15T00:00:00.000+08:00
     */
    private String createTime;

    /**
     * 更新时间（IOS8601格式：yyyy-MM-ddTHH:mm:ss.SSSXXX）例如北京时间：2017-06-15T00:00:00.000+08:00
     */
    private String updateTime;

    /**
     * 编码设备登录用户名
     */
    private Object userName;

    /**
     * 编码设备登录密码
     */
    private Object password;

    /**
     * 萤石应用开发者key
     */
    private Object appKey;

    /**
     * 萤石应用秘钥
     */
    private Object secret;

}
