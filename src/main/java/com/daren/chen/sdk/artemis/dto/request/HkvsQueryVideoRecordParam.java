package com.daren.chen.sdk.artemis.dto.request;

import java.io.Serializable;
import java.util.List;

import com.daren.chen.sdk.artemis.dto.domain.HkvsPage;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @Description:
 * @author: chendaren
 * @CreateDate: 2020/3/22 19:29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
public class HkvsQueryVideoRecordParam extends HkvsPage implements Serializable {
    private static final long serialVersionUID = -2266010024307999146L;

    /**
     * 录像开始日期， 采用ISO8601标准，如2018-07-26T21:30:08+08:00 表示北京时间2017年7月26日21时30分08秒
     */
    private String beginTime;
    /**
     * 录像结束日期， 采用ISO8601标准，如2018-07-26T21:30:08+08:00 表示北京时间2017年7月26日21时30分08秒
     */
    private String endTime;
    /**
     *
     */
    private List<String> indexCodes;

}
