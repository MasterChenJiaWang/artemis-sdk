package com.daren.chen.sdk.artemis.common;

/**
 * @Description:
 * @author: chendaren
 * @CreateDate: 2020/1/20 16:24
 */
public class CamerasUrl {
    /**
     * 总 视频url
     */
    public static final String BASE_VODEO_PREVIEW_URL = "/artemis/api/video/v1";

    //

    /**
     * 视频预览 - 获取监控点预览取流URL
     */
    public static final String CAMERAS_PREVIEWURLS_URL = CamerasUrl.BASE_VODEO_PREVIEW_URL + "/cameras/previewURLs";

    // 录像回放
    /**
     * 获取监控点回放取流URL
     */
    public static final String CAMERAS_PLAYBACKURLS_URL = CamerasUrl.BASE_VODEO_PREVIEW_URL + "/cameras/playbackURLs";

    /**
     * 查询对讲URL
     */
    public static final String CAMERAS_TALKURLS_URL = CamerasUrl.BASE_VODEO_PREVIEW_URL + "/cameras/talkURLs";

    // 云台操作
    /**
     * 根据监控点编号进行云台操作
     */
    public static final String CAMERAS_CONTROLLING_URL = CamerasUrl.BASE_VODEO_PREVIEW_URL + "/ptzs/controlling";

    // 抓图
    /**
     * 手动抓图 该接口用于手动触发设备抓图，返回图片的地址，抓图前请确保平台上已配置图片存储信息。抓图时间为触发手动抓图命令的时间。
     */
    public static final String CAMERAS_MANUALCAPTURE_URL = CamerasUrl.BASE_VODEO_PREVIEW_URL + "/manualCapture";
    // 3D放大
    /**
     * 监控点3D放大 该接口用于控制监控点进行3D电子放大。
     */
    public static final String CAMERAS_SELZOOM_URL = CamerasUrl.BASE_VODEO_PREVIEW_URL + "/ptzs/selZoom";

    // 手动录像
    /**
     * 录像锁定与解锁
     */
    public static final String CAMERAS_MANUALRECORD_LOCK_URL =
        CamerasUrl.BASE_VODEO_PREVIEW_URL + "/api/video/v1/record/lock";
    /**
     * 开始手动录像 该接口用于向中心存储下发开始手动录像请求，将前端实时流存储到中心存储设备上，设备存储暂不支持该能力。
     */
    public static final String CAMERAS_MANUALRECORD_START_URL =
        CamerasUrl.BASE_VODEO_PREVIEW_URL + "/manualRecord/start";

    /**
     * 停止手动录像 该接口用于根据手动录像任务ID，向中心存储接入服务下发停止手动录像状态请求, 设备存储暂不支持该能力。
     */
    public static final String CAMERAS_MANUALRECORD_STOP_URL = CamerasUrl.BASE_VODEO_PREVIEW_URL + "/manualRecord/stop";

    /**
     * 获取手动录像状态 该接口用于根据手动录像任务ID，向存储接入服务下发查询手动录像状态请求, 设备存储暂不支持该能力。萤石设备不支持手动录像功能。
     */
    public static final String CAMERAS_MANUALRECORD_STATUS_URL =
        CamerasUrl.BASE_VODEO_PREVIEW_URL + "/manualRecord/status";
    /**
     * 查询手动录像编号
     */
    public static final String CAMERAS_MANUALRECORD_SERACH_TASKID_URL =
        CamerasUrl.BASE_VODEO_PREVIEW_URL + "/api/video/v1/manualRecord/taskId/search";

    // 预置点管理
    /**
     * 设置预置点信息 该接口用于设置监控点的预置点信息，若参数传已经存在的预置点编号，则可修改预置点信息
     */
    public static final String CAMERAS_PRESETS_ADDITION_URL = CamerasUrl.BASE_VODEO_PREVIEW_URL + "/presets/addition";

    /**
     * 查询预置点信息 该接口用于查询监控点的预置点信息。
     */
    public static final String CAMERAS_PRESETS_SEARCHES_URL = CamerasUrl.BASE_VODEO_PREVIEW_URL + "/presets/searches";

    /**
     * 删除预置点信息 该接口用于删除监控点的预置点信息
     */
    public static final String CAMERAS_PRESETS_DELETION_URL = CamerasUrl.BASE_VODEO_PREVIEW_URL + "/presets/deletion";

    /**
     * 批量获取监控点的预置点信息 该接口用于批量获取监控点的预置点信息列表。
     */
    public static final String CAMERAS_PRESETS_GET_URL = CamerasUrl.BASE_VODEO_PREVIEW_URL + "/presets/get";

    // 图片获取
    /**
     * 获取视频事件的图片 通过该接口根据输入的图片的相对Uri地址，可以获取到具体的图片数据。
     */
    public static final String CAMERAS_EVENTS_PICTURE_URL = CamerasUrl.BASE_VODEO_PREVIEW_URL + "/events/picture";
}
