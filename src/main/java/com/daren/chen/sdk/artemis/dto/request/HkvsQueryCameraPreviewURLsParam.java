package com.daren.chen.sdk.artemis.dto.request;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @Description:
 * @author: chendaren
 * @CreateDate: 2020/3/22 21:02
 */
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
public class HkvsQueryCameraPreviewURLsParam implements Serializable {
    private static final long serialVersionUID = 6193258822578140847L;

    /**
     * 监控点唯一标识，分页获取监控点资源接口获取返回参数cameraIndexCode
     */
    private String cameraIndexCode;
    /**
     * 码流类型，0:主码流 1:子码流 2:第三码流 参数不填，默认为主码流
     */
    private Integer streamType;
    /**
     * 取流协议（应用层协议）， “hik”:HIK私有协议，使用视频SDK进行播放时，传入此类型； “rtsp”:RTSP协议； “rtmp”:RTMP协议；
     * “hls”:HLS协议（HLS协议只支持海康SDK协议、EHOME协议、ONVIF协议接入的设备；只支持H264视频编码和AAC音频编码；云存储版本要求v2.2.4及以上的2.x版本，或v3.0.5及以上的3.x版本；ISC版本要求v1.2.0版本及以上，需在运管中心-视频联网共享中切换成启动平台外置VOD）。
     * 参数不填，默认为HIK协议
     */
    private String protocol;
    /**
     * 传输协议（传输层协议），0:UDP 1:TCP 默认是TCP 注：EHOME设备回放只支持TCP传输 GB28181 2011及以前版本只支持UDP传输
     */
    private Integer transmode;
    /**
     * 标识扩展内容，格式：key=value， 调用方根据其播放控件支持的解码格式选择相应的封装类型； 支持的内容详见附录F expand扩展内容说明
     */
    private String expand;
    /**
     * 输出码流转封装格式，“ps”:PS封装格式、“rtp”:RTP封装协议。当protocol=rtsp时生效，且不传值时默认为RTP封装协议
     */
    private String streamform;

}
