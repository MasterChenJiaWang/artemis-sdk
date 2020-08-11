package com.daren.chen.sdk.artemis.dto.request;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @Description:
 * @author: chendaren
 * @CreateDate: 2020/3/22 21:26
 */
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
public class HkvsCamera3dSelZoomParam implements Serializable {
    private static final long serialVersionUID = -699175203384519795L;

    /**
     * 监控点唯一标识， 可通过分页获取监控点资源获取
     */
    private String cameraIndexCode;
    /**
     * 开始放大的X坐标，范围：0-255。由于设备比例限制，以及实际场景屏幕比例大小不同，请按照如下坐标位计算方式计算入参：屏幕X坐标/屏幕宽 *
     * 255，即该坐标位X坐标占总屏幕宽的比例*255。监控点会对startX、startY、endX 、endY四点围成的区域进行放大。
     */
    private BigDecimal startX;
    /**
     * 开始放大的Y坐标，范围：0-255，由于设备比例限制，以及实际场景屏幕比例大小不同，请按照如下坐标位计算方式计算入参：屏幕Y坐标/屏幕高 *
     * 255，即该坐标位Y坐标占总屏幕高的比例*255。监控点会对startX、startY、endX 、endY四点围成的区域进行放大。
     */
    private BigDecimal startY;
    /**
     * 结束放大的X坐标，范围以及计算方式同startX
     */
    private BigDecimal endX;
    /**
     * 结束放大的Y坐标，范围以及计算方式同startY
     */
    private BigDecimal endY;

}
