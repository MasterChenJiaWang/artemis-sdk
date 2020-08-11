package com.daren.chen.sdk.artemis.dto.domain;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @Description:
 * @author: chendaren
 * @CreateDate: 2020/3/22 21:50
 */
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
public class HkvsManualRecordTask implements Serializable {
    private static final long serialVersionUID = -669968449229650282L;

    /**
     * 监控点唯一标识
     */
    private String cameraIndexCode;
    /**
     * 手动录像编号
     */
    private String taskID;
    /**
     * 下发的存储类型。0-中心存储，1-设备存储。如果不传入，默认为0-中心存储
     */
    private Integer type;
}
