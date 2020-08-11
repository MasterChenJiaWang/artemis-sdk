package com.daren.chen.sdk.artemis.dto.domain;

import java.io.Serializable;

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
public class HkvsGetRootRegions implements Serializable {

    private static final long serialVersionUID = -1474100918459293598L;
    /**
     * 区域唯一标识码
     */
    private String indexCode;
    /**
     * 区域名称
     */
    private String name;
    /**
     * 父区域唯一标识码
     */
    private String parentIndexCode;

    /**
     * 树编号
     */
    private String treeCode;

}
