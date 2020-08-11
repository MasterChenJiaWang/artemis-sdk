package com.daren.chen.sdk.artemis.dto.request;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @Description:
 * @author: chendaren
 * @CreateDate: 2020/3/22 21:45
 */
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
public class HkvsQueryCameraVideoStatusParam implements Serializable {
    private static final long serialVersionUID = 4414164338629647442L;

    /**
     * 监控点唯一标识，分页获取监控点资源接口获取返回参数cameraIndexCode
     */
    private String cameraIndexCode;
    /**
     * 手动录像编号，从开始手动录像接口获取返回参数taskID
     */
    private String taskID;
    /**
     * 下发的存储类型,0-中心存储 1-设备存储 如果不传入，默认为0-中心存储
     */
    private Integer type;

}
