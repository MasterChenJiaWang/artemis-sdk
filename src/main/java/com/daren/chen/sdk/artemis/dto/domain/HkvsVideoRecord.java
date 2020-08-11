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
public class HkvsVideoRecord<T> implements Serializable {
    private static final long serialVersionUID = -6510231961984082479L;

    /**
     * 监控点编号
     */
    private String indexCode;
    /**
     * 录像日期（格式：yyyy-MM-dd）
     */
    private String date;
    /**
     * 录像巡检时间（具体的巡检结果更新时间，时间戳，单位：毫秒）
     */
    private Long collectTime;
    /**
     * 巡检日期（格式：yyyy-MM-dd）
     */
    private String inspectionDate;
    /**
     * 巡检结果(31-正常，32-异常，34-未配置)
     */
    private Integer result;
    /**
     * 实际巡检录像的片段
     */
    private Integer intactDuration;
    /**
     * 计划录像时长（单位：秒）
     */
    private Integer planDuration;
    /**
     * 实际巡检录像的片段
     */
    private List<T> videoClipstimeSegment;

}
