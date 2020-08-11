package com.daren.chen.sdk.artemis.dto.request;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @Description:
 * @author: chendaren
 * @CreateDate: 2020/3/22 21:31
 */
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
public class HkvsCameraVideoLockParam implements Serializable {
    private static final long serialVersionUID = 2741374738491954643L;

    /**
     * 监控点唯一标识，分页获取监控点资源接口获取返回参数cameraIndexCode
     */
    private String cameraIndexCode;
    /**
     * 下发的存储类型。0-中心存储，1-设备存储。如果不传入，默认为0-中心存储
     */
    private Integer type;
    /**
     * 开始时间（IOS8601格式：yyyy-MM-dd’T’HH:mm:ss.SSSzzz +当前时区，例如北京时间：2018-07-26T15:00:00.000+08:00）
     */
    private String startTime;
    /**
     * 结束时间（IOS8601格式：yyyy-MM-dd’T’HH:mm:ss.SSSzzz +当前时区，例如北京时间：2018-07-26T15:00:00.000+08:00）
     */
    private String endTime;
    /**
     * 锁定时长，单位：秒，为0时表示解锁，取值范围：0-1576800000
     */
    private Long lockTime;

}
