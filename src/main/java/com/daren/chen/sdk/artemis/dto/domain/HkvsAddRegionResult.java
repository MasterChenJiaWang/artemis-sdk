package com.daren.chen.sdk.artemis.dto.domain;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @Description:
 * @author: chendaren
 * @CreateDate: 2020/3/22 19:23
 */
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
public class HkvsAddRegionResult implements Serializable {

    private static final long serialVersionUID = -274683553525466289L;
    /**
     * 批量添加成功的记录
     */
    private List<HkvsSuccess> successes;

    /**
     * 批量添加失败的记录
     */
    private List<HkvsFailures> failures;

}
