package com.daren.chen.sdk.artemis.dto.domain;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 录像片段信息
 *
 * @Description:
 * @author: chendaren
 * @CreateDate: 2020/3/22 21:11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
public class HkvsCameraPlaybackURLsData implements Serializable {
    private static final long serialVersionUID = 53039745418735695L;

    /**
     * 查询录像的锁定类型，0-全部录像；1-未锁定录像；2-已锁定录像。
     */
    private Integer lockType;
    /**
     * 开始时间 录像片段的开始时间（IOS8601格式yyyy-MM-dd’T’HH:mm:ss.SSSzzz），参考附录B ISO8601时间格式说明
     */
    private String beginTime;
    /**
     * 结束时间 录像片段的开始时间（IOS8601格式yyyy-MM-dd’T’HH:mm:ss.SSSzzz），参考附录B ISO8601时间格式说明
     */
    private String endTime;
    /**
     * 录像片段大小 录像片段大小（单位：Byte）
     */
    private Integer size;

}
