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
 * @CreateDate: 2020/3/22 21:45
 */
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
public class HkvsSerachCameraVideoTaskId implements Serializable {

    private static final long serialVersionUID = -3184547764298355240L;

    /**
     * 下发手动录像的用户ID
     */
    private String userId;
    /**
     * 手动录像编号集合，只查询未结束的手动录像编号信息
     */
    private List<HkvsManualRecordTask> hkvsManualRecordTask;

}
