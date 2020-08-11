package com.daren.chen.sdk.artemis.dto.request;

import java.io.Serializable;
import java.util.List;

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
public class HkvsQueryCameraVideoTaskIdParam implements Serializable {

    private static final long serialVersionUID = 2950141779062830227L;
    /**
     * 监控点唯一标识，分页获取监控点资源接口获取返回参数cameraIndexCode
     */
    private List<String> cameraIndexCodes;

}
