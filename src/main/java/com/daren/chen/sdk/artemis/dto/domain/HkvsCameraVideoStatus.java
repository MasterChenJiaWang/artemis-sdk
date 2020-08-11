package com.daren.chen.sdk.artemis.dto.domain;

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
public class HkvsCameraVideoStatus implements Serializable {

    private static final long serialVersionUID = 1950263168236933820L;
    /**
     * 手动录像状态,0：未接入 1：正常执行 2：异常
     */
    private String taskStatus;

}
