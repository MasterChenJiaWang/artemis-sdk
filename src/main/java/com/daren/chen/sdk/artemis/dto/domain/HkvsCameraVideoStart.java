package com.daren.chen.sdk.artemis.dto.domain;

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
public class HkvsCameraVideoStart implements Serializable {

    private static final long serialVersionUID = -1434881383677270255L;
    /**
     * 任务编号,结束手动录像时需要用到此参数
     */
    private String taskID;

}
