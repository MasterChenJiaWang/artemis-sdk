package com.daren.chen.sdk.artemis.dto.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @Description:
 * @author: chendaren
 * @CreateDate: 2020/1/20 17:46
 */
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
public class HkvsCamera implements Serializable {

    private static final long serialVersionUID = 5786480687278642871L;

    /**
     * 唯一编码
     */
    private String indexCode;

    /**
     * 资源类型，camera：监控点
     */
    private String resourceType;

    /**
     * 监控点国标编号
     */
    private String externalIndexCode;
    /**
     * 资源名称
     */
    private String name;
    /**
     * 通道号，为级联监控点时，该字段为空； 本级监控点时，该字段非空
     */
    private Integer chanNum;
    /**
     * 级联编号
     */
    private String cascadeCode;
    /**
     * 父级资源编号
     */
    private String parentIndexCode;
    /**
     * 经度，精确到小数点后8位
     */
    private BigDecimal longitude;
    /**
     * 纬度，精确到小数点后8位
     */
    private BigDecimal latitude;
    /**
     * 海拔高度，单位：米
     */
    private String elevation;
    /**
     * 监控点类型 枪机0 半球1 快球2 带云台枪机3
     */
    private Integer cameraType;
    /**
     * 能力集，详见附录A.44 设备能力集
     */
    private String capability;
    /**
     * 录像存储位置
     */
    private String recordLocation;
    /**
     * 通道子类型， 模拟通道analog 数字通道digital 镜像通道mirror 录播通道record 零通道zero
     */
    private String channelType;
    /**
     * 所属区域
     */
    private String regionIndexCode;
    /**
     * 所属区域路径,以@符号分割，包含本节点
     */
    private String regionPath;
    /**
     * 传输协议， 0：UDP 1：TCP
     */
    private Integer transType;
    /**
     * 接入协议，详见附录A.6 编码设备接入协议
     */
    private Integer treatyType;
    /**
     * 安装位置，详见附录附录A.81 安装位置
     */
    private String installLocation;
    /**
     * 创建时间，IOS8601格式，参考附录B ISO8601时间格式说明
     */
    private Date createTime;
    /**
     * 更新时间，IOS8601格式，参考附录B ISO8601时间格式说明
     */
    private Date updateTime;
    /**
     * 数据在界面上的显示顺序
     */
    private Integer disOrder;
    /**
     * 资源唯一编码
     */
    private String resourceIndexCode;
    /**
     * 解码模式
     */
    private String decodeTag;
    /**
     * 监控点关联对讲唯一标志
     */
    private String cameraRelateTalk;
    /**
     * 所属区域路径，由唯一标示组成，最大10级，格式： @根节点@子区域1@子区域2@
     */
    private String regionName;
    /**
     * 区域路径名称，"/"分隔
     */
    private String regionPathName;

}
