package com.daren.chen.sdk.artemis.dto.domain;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 实际巡检录像的片段
 *
 * @Description:
 * @author: chendaren
 * @CreateDate: 2020/3/22 19:25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
public class HkvsVideoClipstimeSegment implements Serializable {

    private static final long serialVersionUID = -2326821496184534718L;
    /**
     * 片段开始时间（单位：秒）
     */
    private Long from;
    /**
     * 片段结束时间（单位：秒）
     */
    private Long to;
    /**
     * 片段结果(31-正常，32-异常，34-未配置)
     */
    private Long type;
}
