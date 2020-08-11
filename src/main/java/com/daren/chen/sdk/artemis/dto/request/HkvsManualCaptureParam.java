package com.daren.chen.sdk.artemis.dto.request;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @Description:
 * @author: chendaren
 * @CreateDate: 2020/3/22 21:16
 */
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
public class HkvsManualCaptureParam implements Serializable {
    private static final long serialVersionUID = -5749231888038182039L;

    /**
     * 监控点唯一标识， 可通过分页获取监控点资源获取
     */
    private String cameraIndexCode;
}
