package com.daren.chen.sdk.artemis.dto.request;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @Description:
 * @author: chendaren
 * @CreateDate: 2020/3/22 21:21
 */
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
public class HkvsPtzControllingParam implements Serializable {
    private static final long serialVersionUID = 1309679051017583886L;

    /**
     * 监控点编号， 可通过分页获取监控点资源获取
     */
    private String cameraIndexCode;
    /**
     * 0-开始 ，1-停止 注：GOTO_PRESET命令下填任意值均可转到预置点,建议填0即可
     */
    private Integer action;
    /**
     * 不区分大小写 说明： LEFT 左转 RIGHT右转 UP 上转 DOWN 下转 ZOOM_IN 焦距变大 ZOOM_OUT 焦距变小 LEFT_UP 左上 LEFT_DOWN 左下 RIGHT_UP 右上
     * RIGHT_DOWN 右下 FOCUS_NEAR 焦点前移 FOCUS_FAR 焦点后移 IRIS_ENLARGE 光圈扩大 IRIS_REDUCE 光圈缩小 WIPER_SWITCH 接通雨刷开关
     * START_RECORD_TRACK 开始记录轨迹 STOP_RECORD_TRACK 停止记录轨迹 START_TRACK 开始轨迹 STOP_TRACK 停止轨迹； 以下命令presetIndex不可为空：
     * GOTO_PRESET到预置点
     */
    private String command;
    /**
     * 云台速度，取值范围为1-100，默认50
     */
    private Integer speed;
    /**
     * 预置点编号，可通过查询预置点信息接口获取整数，通常在300以内
     */
    private Integer presetIndex;

}
