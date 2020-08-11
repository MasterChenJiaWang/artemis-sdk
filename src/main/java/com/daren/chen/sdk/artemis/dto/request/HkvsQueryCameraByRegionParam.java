package com.daren.chen.sdk.artemis.dto.request;

import java.io.Serializable;

import com.daren.chen.sdk.artemis.dto.domain.HkvsPage;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @Description:
 * @author: chendaren
 * @CreateDate: 2020/1/20 18:15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
public class HkvsQueryCameraByRegionParam extends HkvsPage implements Serializable {
    private static final long serialVersionUID = -1414753394491931448L;
    /**
     * 父区域编号； 可通过区域信息接口获取
     */
    private String regionIndexCode;

}
