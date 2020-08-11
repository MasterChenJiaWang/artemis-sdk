package com.daren.chen.sdk.artemis.dto.domain;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 视频质量诊断
 *
 * @Description:
 * @author: chendaren
 * @CreateDate: 2020/3/22 20:39
 */
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
public class HkvsVideoQualityDiagnosis implements Serializable {
    private static final long serialVersionUID = -8199737712862980425L;

    /**
     * 偏色检测结果(2-诊断失败，-1-未知，1-正常，0-异常)
     */
    private Integer scChromaResult;
    /**
     * 雪花点干扰结果(2-诊断失败，-1-未知，1-正常，0-异常)
     */
    private Integer scSnowResult;
    /**
     * 图像过暗结果(2-诊断失败，-1-未知，1-正常，0-异常)
     */
    private Integer scDarkResult;
    /**
     * 巡检日期（格式：yyyy-MM-dd）
     */
    private String inspectDate;
    /**
     * 监控点编号（通用唯一识别码UUID）
     */
    private String indexCode;
    /**
     * 亮度异常结果（2-诊断失败，-1-未知，1-正常，0-异常）
     */
    private Integer scLumaResult;
    /**
     * 画面冻结结果（2-诊断失败，-1-未知，1-正常，0-异常）
     */
    private Integer scFreezeResult;
    /**
     * 视频抖动结果（2-诊断失败，-1-未知，1-正常，0-异常）
     */
    private Integer scShakeResult;
    /**
     * 分辨率（720为基准 1-高清，0-标清，-1-未知）
     */
    private Integer resolution;
    /**
     * 对比度检测结果（2-诊断失败，-1-未知，1-正常，0-异常）
     */
    private Integer scContrastResult;
    /**
     * 条纹干扰结果（2-诊断失败，-1-未知，1-正常，0-异常）
     */
    private Integer scStreakResult;
    /**
     * 图片url地址
     */
    private String picUrl;
    /**
     * 视频丢帧结果（2-诊断失败，-1-未知，1-正常，0-异常）
     */
    private Integer scFrameResult;
    /**
     * 视频遮挡结果（2-诊断失败，-1-未知，1-正常，0-异常）
     */
    private Integer scCoverResult;
    /**
     * 视频丢失结果（2-诊断失败，-1-未知，1-正常，0-异常）
     */
    private Integer scSignalResult;
    /**
     * 黑白图像结果（2-诊断失败，-1-未知，1-正常，0-异常）
     */
    private Integer scMonoResult;
    /**
     * 视频巡检结果（0-视频异常，1-视频正常，2-登录失败，3-取流异常，4-解码失败，5-码流延时，6-诊断失败）
     */
    private Integer inspectResult;
    /**
     * 图像模糊结果（2-诊断失败，-1-未知，1-正常，0-异常）
     */
    private Integer scBlurResult;
    /**
     * 场景变更结果（2-诊断失败，-1-未知，1-正常，0-异常）
     */
    private Integer scSceneResult;
    /**
     * 视频剧变结果（2-诊断失败，-1-未知，1-正常，0-异常）
     */
    private Integer scFlashResult;

}
