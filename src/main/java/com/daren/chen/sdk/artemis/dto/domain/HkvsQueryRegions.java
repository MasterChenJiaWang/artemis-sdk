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
public class HkvsQueryRegions implements Serializable {

    private static final long serialVersionUID = 3929756778775648811L;

    /**
     * 区域编号
     */
    private String indexCode;
    /**
     * 区域名称
     */
    private String name;
    /**
     * 区域完整路径，含本节点，@进行分割，上级节点在前
     */
    private String regionPath;
    /**
     * 父区域唯一标识码
     */
    private String parentIndexCode;
    /**
     * 用于标识区域节点是否有权限操作，true：有权限 false：无权限
     */
    private Boolean available;
    /**
     * true:是叶子节点，表示该区域下面未挂区域 false:不是叶子节点，表示该区域下面挂有区域
     */
    private Boolean leaf;
    /**
     * 级联平台标识，多个级联编号以@分隔，本级区域默认值“0”
     */
    private String cascadeCode;
    /**
     * 区域标识 0：本级 1：级联 2：混合，下级推送给上级的本级点（杭州本级有滨江，然后下级滨江又把自己推送上来了，滨江是混合区域节点） 入参cascadeFlag与返回值对应： cascadeFlag=0：返回0、1、2
     * cascadeFlag=1：返回0、2 cascadeFlag=2：返回1、2
     */
    private Integer cascadeType;
    /**
     * 区域类型 0: 国标区域 1: 雪亮工程区域 2: 司法行政区域 9: 自定义区域 10: 历史兼容版本占用普通区域 11: 历史兼容版本占用级联区域 12: 楼栋单元
     */
    private Integer catalogType;
    /**
     * 外码(如：国际码)
     */
    private String externalIndexCode;
    /**
     * 同级区域顺序
     */
    private String sort;
    /**
     * 创建时间，要求遵守ISO8601标准，如2018-07-26T21:30:08.322+08:00
     */
    private String createTime;
    /**
     * 创建时间，要求遵守ISO8601标准，如2018-07-26T21:30:08.322+08:00
     */
    private String updateTime;

}
