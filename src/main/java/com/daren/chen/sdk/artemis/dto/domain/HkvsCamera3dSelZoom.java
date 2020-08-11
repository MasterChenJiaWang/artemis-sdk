package com.daren.chen.sdk.artemis.dto.domain;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @Description:
 * @author: chendaren
 * @CreateDate: 2020/3/22 21:25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
public class HkvsCamera3dSelZoom implements Serializable {
    private static final long serialVersionUID = 651415568161172120L;

    /**
     * 用户等级
     */
    private Integer priority;

    /**
     * 用户编号
     */
    private String userId;

}
