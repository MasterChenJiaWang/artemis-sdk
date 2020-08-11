package com.daren.chen.sdk.artemis.common;

/**
 * 视频网管
 *
 * @Description:
 * @author: chendaren
 * @CreateDate: 2020/1/20 16:24
 */
public class NmsUrl {

    /**
     * 总 管理url
     */
    public static final String BASE_MANAGEMENT_URL = "/artemis/api/nms/v1";

    //

    /**
     * 根据监控点列表查询录像完整性结果 - 根据监控点编号、开始时间、结束时间，分页获取录像录像完整性记录。 级联场景下， 如需调用需要在 "系统配置–>网络管理配置–>下级平台管理” 中进行配置
     */
    public static final String MANAGEMENT_RECORD_LIST_URL = NmsUrl.BASE_MANAGEMENT_URL + "/record/list";

    /**
     * 根据监控点列表查询视频质量诊断结果 根据监控点编号查询视频质量诊断结果，此接口可用作检测监控点位预览画面是否正常。 级联场景下， 如需调用需要在 "系统配置–>网络管理配置–>下级平台管理” 中进行配置
     */
    public static final String MANAGEMENT_VQD_LIST_URL = NmsUrl.BASE_MANAGEMENT_URL + "/vqd/list";

    /**
     * 获取监控点在线状态 根据条件获取监控点在线状态接口 级联场景下， 如需调用需要在 "系统配置–>网络管理配置–>下级平台管理” 中进行配置
     */
    public static final String MANAGEMENT_ONLINE_CAMERA_GET_URL = NmsUrl.BASE_MANAGEMENT_URL + "/online/camera/get";

    /**
     * 获取编码设备在线状态 根据条件获取编码设备在线状态接口 级联场景下， 如需调用需要在 "系统配置–>网络管理配置–>下级平台管理” 中进行配置
     */
    public static final String MANAGEMENT_ONLINE_ENCODE_DEVICE_GET_URL =
        NmsUrl.BASE_MANAGEMENT_URL + "/online/encode_device/get";

}
