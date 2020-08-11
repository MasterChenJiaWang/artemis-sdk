package com.daren.chen.sdk.artemis.dto.domain;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @Description:
 * @author: chendaren
 * @CreateDate: 2020/3/22 20:47
 */
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
public class HkvsCameraOnlineStatus implements Serializable {
    private static final long serialVersionUID = 8253703354400478063L;

    /**
     * 设备型号
     */
    private String deviceType;
    /**
     * 区域编码
     */
    private String regionIndexCode;
    /**
     * 采集时间
     */
    private String collectTime;
    /**
     * 区域编码
     */
    private String deviceIndexCode;
    /**
     * 端口，监控点无此值
     */
    private String port;
    /**
     * ip地址，监控点无此值
     */
    private String ip;
    /**
     * 区域名字
     */
    private String regionName;
    /**
     * 资源唯一编码
     */
    private String indexCode;
    /**
     * 在线状态，0离线，1在线
     */
    private Integer online;
    /**
     * 设备名称
     */
    private String cn;
    /**
     * 码流传输协议，0：UDP，1：TCP
     */
    private Short treatyType;
    /**
     * 厂商，hikvision-海康，dahua-大华
     */
    private String manufacturer;

}
