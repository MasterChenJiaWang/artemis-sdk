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
public class HkvsUpdateRegion implements Serializable {

    private static final long serialVersionUID = -4392986225288293374L;

    /**
     * 区域唯一标志，从分页获取区域列表接口可以获取
     */
    private String regionIndexCode;
    /**
     * 区域唯一标志，不允许与其它区域唯一标志重复，包括已删除的区域，值为空或者不传此字段时系统自动生成唯一标志
     */
    private String parentIndexCode;

    /**
     * 父区域唯一标识码
     */
    private String regionName;

    /**
     * 区域名称，同一级不可重复
     */
    private String regionCode;

    /**
     * 外码编码，regionType为12时有效，regionType为10时忽略该值
     */
    private Integer regionType;

    /**
     * 区域类型 10: 普通区域 12: 楼栋单元
     */
    private String description;

}
