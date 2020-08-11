package com.daren.chen.sdk.artemis.service;

import org.apache.commons.lang3.StringUtils;
import org.apache.http.entity.ContentType;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.daren.chen.sdk.artemis.common.NmsUrl;
import com.daren.chen.sdk.artemis.dto.domain.HkvsCameraOnlineStatus;
import com.daren.chen.sdk.artemis.dto.domain.HkvsDeviceOnlineStatus;
import com.daren.chen.sdk.artemis.dto.domain.HkvsResPage;
import com.daren.chen.sdk.artemis.dto.domain.HkvsResResult;
import com.daren.chen.sdk.artemis.dto.domain.HkvsVideoClipstimeSegment;
import com.daren.chen.sdk.artemis.dto.domain.HkvsVideoQualityDiagnosis;
import com.daren.chen.sdk.artemis.dto.domain.HkvsVideoRecord;
import com.daren.chen.sdk.artemis.dto.request.HkvsQueryCameraOnlineStatusParam;
import com.daren.chen.sdk.artemis.dto.request.HkvsQueryDeviceOnlineStatusParam;
import com.daren.chen.sdk.artemis.dto.request.HkvsQueryVideoListPageParam;
import com.daren.chen.sdk.artemis.dto.request.HkvsQueryVideoQualityDiagnosisParam;
import com.daren.chen.sdk.artemis.utils.CustomizeHttpUtil;
import com.daren.chen.sdk.artemis.utils.PreviewURLsApiUtil;

/**
 * @Description:
 * @author: chendaren
 * @CreateDate: 2020/3/22 19:21
 */
public class VideoNmsService {

    /**
     * 根据监控点编号、开始时间、结束时间，分页获取录像录像完整性记录。 级联场景下， 如需调用需要在 "系统配置–>网络管理配置–>下级平台管理” 中进行配置
     *
     * @param hkvsPage
     * @return
     */
    public static HkvsResResult<HkvsResPage<HkvsVideoRecord<HkvsVideoClipstimeSegment>>>
        queryVideoList(HkvsQueryVideoListPageParam hkvsPage) {
        if (null == hkvsPage) {
            hkvsPage = new HkvsQueryVideoListPageParam();
        }
        try {
            String result =
                CustomizeHttpUtil.doPostStringArtemis(PreviewURLsApiUtil.getPath(NmsUrl.MANAGEMENT_RECORD_LIST_URL),
                    JSON.toJSONString(hkvsPage), null, null, ContentType.APPLICATION_JSON.getMimeType());
            if (StringUtils.isBlank(result)) {
                return HkvsResResult.error("返回消息为空");
            }
            HkvsResResult<HkvsResPage<HkvsVideoRecord<HkvsVideoClipstimeSegment>>> hkvsResResult = JSON.parseObject(
                result, new TypeReference<HkvsResResult<HkvsResPage<HkvsVideoRecord<HkvsVideoClipstimeSegment>>>>() {});
            if (null == hkvsResResult) {
                return HkvsResResult.error("返回消息为空");
            }
            if (!HkvsResResult.SUCCESS_CODE.equals(hkvsResResult.getCode())) {
                HkvsResResult.error(hkvsResResult.getMsg());
            }
            return hkvsResResult;
        } catch (Exception e) {
            return HkvsResResult.error(e.getMessage());
        }
    }

    /**
     * 根据监控点编号查询视频质量诊断结果，此接口可用作检测监控点位预览画面是否正常。 级联场景下， 如需调用需要在 "系统配置–>网络管理配置–>下级平台管理” 中进行配置
     *
     * @param param
     * @return
     */
    public static HkvsResResult<HkvsResPage<HkvsVideoQualityDiagnosis>>
        queryVideoQualityDiagnosisList(HkvsQueryVideoQualityDiagnosisParam param) {
        if (null == param) {
            param = new HkvsQueryVideoQualityDiagnosisParam();
        }
        try {
            String result =
                CustomizeHttpUtil.doPostStringArtemis(PreviewURLsApiUtil.getPath(NmsUrl.MANAGEMENT_VQD_LIST_URL),
                    JSON.toJSONString(param), null, null, ContentType.APPLICATION_JSON.getMimeType());
            if (StringUtils.isBlank(result)) {
                return HkvsResResult.error("返回消息为空");
            }
            HkvsResResult<HkvsResPage<HkvsVideoQualityDiagnosis>> hkvsResResult =
                JSON.parseObject(result, new TypeReference<HkvsResResult<HkvsResPage<HkvsVideoQualityDiagnosis>>>() {});
            if (null == hkvsResResult) {
                return HkvsResResult.error("返回消息为空");
            }
            if (!HkvsResResult.SUCCESS_CODE.equals(hkvsResResult.getCode())) {
                HkvsResResult.error(hkvsResResult.getMsg());
            }
            return hkvsResResult;
        } catch (Exception e) {
            return HkvsResResult.error(e.getMessage());
        }
    }

    /**
     * 根据条件获取监控点在线状态接口 级联场景下， 如需调用需要在 "系统配置–>网络管理配置–>下级平台管理” 中进行配置
     *
     * @param param
     * @return
     */
    public static HkvsResResult<HkvsResPage<HkvsCameraOnlineStatus>>
        queryCameraOnlineStatusList(HkvsQueryCameraOnlineStatusParam param) {
        if (null == param) {
            param = new HkvsQueryCameraOnlineStatusParam();
        }
        try {
            String result = CustomizeHttpUtil.doPostStringArtemis(
                PreviewURLsApiUtil.getPath(NmsUrl.MANAGEMENT_ONLINE_CAMERA_GET_URL), JSON.toJSONString(param), null,
                null, ContentType.APPLICATION_JSON.getMimeType());
            if (StringUtils.isBlank(result)) {
                return HkvsResResult.error("返回消息为空");
            }
            HkvsResResult<HkvsResPage<HkvsCameraOnlineStatus>> hkvsResResult =
                JSON.parseObject(result, new TypeReference<HkvsResResult<HkvsResPage<HkvsCameraOnlineStatus>>>() {});
            if (null == hkvsResResult) {
                return HkvsResResult.error("返回消息为空");
            }
            if (!HkvsResResult.SUCCESS_CODE.equals(hkvsResResult.getCode())) {
                HkvsResResult.error(hkvsResResult.getMsg());
            }
            return hkvsResResult;
        } catch (Exception e) {
            return HkvsResResult.error(e.getMessage());
        }
    }

    /**
     * 根据条件获取编码设备在线状态接口 级联场景下， 如需调用需要在 "系统配置–>网络管理配置–>下级平台管理” 中进行配置
     *
     * @param param
     * @return
     */
    public static HkvsResResult<HkvsResPage<HkvsDeviceOnlineStatus>>
        queryDeviceOnlineStatusList(HkvsQueryDeviceOnlineStatusParam param) {
        if (null == param) {
            param = new HkvsQueryDeviceOnlineStatusParam();
        }
        try {
            String result = CustomizeHttpUtil.doPostStringArtemis(
                PreviewURLsApiUtil.getPath(NmsUrl.MANAGEMENT_ONLINE_ENCODE_DEVICE_GET_URL), JSON.toJSONString(param),
                null, null, ContentType.APPLICATION_JSON.getMimeType());
            if (StringUtils.isBlank(result)) {
                return HkvsResResult.error("返回消息为空");
            }
            HkvsResResult<HkvsResPage<HkvsDeviceOnlineStatus>> hkvsResResult =
                JSON.parseObject(result, new TypeReference<HkvsResResult<HkvsResPage<HkvsDeviceOnlineStatus>>>() {});
            if (null == hkvsResResult) {
                return HkvsResResult.error("返回消息为空");
            }
            if (!HkvsResResult.SUCCESS_CODE.equals(hkvsResResult.getCode())) {
                HkvsResResult.error(hkvsResResult.getMsg());
            }
            return hkvsResResult;
        } catch (Exception e) {
            return HkvsResResult.error(e.getMessage());
        }
    }
}
