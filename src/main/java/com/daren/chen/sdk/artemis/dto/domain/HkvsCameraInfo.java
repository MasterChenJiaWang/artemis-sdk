package com.daren.chen.sdk.artemis.dto.domain;

import java.io.Serializable;

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
public class HkvsCameraInfo implements Serializable {

    private static final long serialVersionUID = 4544342940381813832L;
    /**
     * 海拔
     */
    private String altitude;
    /**
     * 监控点唯一标识
     */
    private String cameraIndexCode;
    /**
     * 监控点名称
     */
    private String cameraName;
    /**
     * 监控点类型，参考附录A.4
     */
    private Integer cameraType;
    /**
     * 监控点类型说明
     */
    private String cameraTypeName;
    /**
     * 设备能力集，参考附录A.22
     */
    private String capabilitySet;
    /**
     * 能力集说明
     */
    private String capabilitySetName;
    /**
     * 智能分析能力集，扩展字段，暂不使用
     */
    private String intelligentSet;
    /**
     * 智能分析能力集说明，扩展字段，暂不使用
     */
    private String intelligentSetName;
    /**
     * 通道编号
     */
    private String channelNo;
    /**
     * 通道类型，附录A.5
     */
    private String channelType;
    /**
     * 通道类型说明
     */
    private String channelTypeName;
    /**
     * 创建时间，采用ISO8601标准，如2018-07-26T21:30:08+08:00 表示北京时间2018年7月26日21时30分08秒
     */
    private String createTime;
    /**
     * 所属编码设备唯一标识
     */
    private String encodeDevIndexCode;
    /**
     * 所属设备类型，扩展字段，暂不使用
     */
    private String encodeDevResourceType;
    /**
     * 所属设备类型说明，扩展字段，暂不使用
     */
    private String encodeDevResourceTypeName;
    /**
     * 监控点国标编号，即外码编号externalIndexCode
     */
    private String gbIndexCode;
    /**
     * 安装位置，详见附录附录A.81 安装位置
     */
    private String installLocation;
    /**
     * 键盘控制码
     */
    private String keyBoardCode;
    /**
     * 纬度
     */
    private String latitude;
    /**
     * 经度
     */
    private String longitude;
    /**
     * 摄像机像素（1-普通像素，2-130万高清，3-200万高清，4-300万高清），扩展字段，暂不使用
     */
    private String pixel;
    /**
     * 云镜类型（1-全方位云台（带转动和变焦），2-只有变焦,不带转动，3-只有转动，不带变焦，4-无云台，无变焦），扩展字段，暂不使用
     */
    private String ptz;
    /**
     * 云镜类型说明，扩展字段，暂不使用
     */
    private String ptzName;
    /**
     * 云台控制(1-DVR，2-模拟矩阵，3-MU4000，4-NC600)，扩展字段，暂不使用
     */
    private String ptzController;
    /**
     * 云台控制说明，扩展字段，暂不使用
     */
    private String ptzControllerName;
    /**
     * 录像存储位置
     */
    private String recordLocation;
    /**
     * 录像存储位置说明
     */
    private String recordLocationName;
    /**
     * 所属区域唯一标识
     */
    private String regionIndexCode;
    /**
     * 在线状态（0-未知，1-在线，2-离线），扩展字段，暂不使用
     */
    private Integer status;
    /**
     * 状态说明
     */
    private String statusName;
    /**
     * 传输协议，参考附录A.40
     */
    private Integer transType;
    /**
     * 传输协议类型说明
     */
    private String transTypeName;
    /**
     * 接入协议，参考附录A.6
     */
    private String treatyType;
    /**
     * 接入协议类型说明
     */
    private String treatyTypeName;
    /**
     * 可视域相关（JSON格式），扩展字段，暂不使用
     */
    private String viewshed;
    /**
     * 更新时间 采用ISO8601标准，如2018-07-26T21:30:08+08:00 表示北京时间2017年7月26日21时30分08秒
     */
    private String updateTime;

}
