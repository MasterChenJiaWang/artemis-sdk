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
public class HkvsCameraVideoStartParam implements Serializable {
    private static final long serialVersionUID = -9116111206451514867L;

    /**
     * 监控点唯一标识，分页获取监控点资源接口获取返回参数cameraIndexCode
     */
    private String cameraIndexCode;
    /**
     * 录像类型： 范围:0-65535，参考附录A.31 录像类型，中心存储必填
     */
    private Integer recordType;
    /**
     * 下发的存储类型。0-中心存储 1-设备存储。如果不传入，默认为0-中心存储
     */
    private Integer type;

}
