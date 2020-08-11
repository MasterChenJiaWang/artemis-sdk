package com.daren.chen.sdk.artemis.service;

import org.apache.commons.lang3.StringUtils;
import org.apache.http.entity.ContentType;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.daren.chen.sdk.artemis.common.CamerasUrl;
import com.daren.chen.sdk.artemis.dto.domain.HkvsCamera3dSelZoom;
import com.daren.chen.sdk.artemis.dto.domain.HkvsCameraPlaybackURLs;
import com.daren.chen.sdk.artemis.dto.domain.HkvsCameraPreviewURLs;
import com.daren.chen.sdk.artemis.dto.domain.HkvsCameraVideoStart;
import com.daren.chen.sdk.artemis.dto.domain.HkvsCameraVideoStatus;
import com.daren.chen.sdk.artemis.dto.domain.HkvsManualCapture;
import com.daren.chen.sdk.artemis.dto.domain.HkvsResResult;
import com.daren.chen.sdk.artemis.dto.domain.HkvsSerachCameraVideoTaskId;
import com.daren.chen.sdk.artemis.dto.request.HkvsCamera3dSelZoomParam;
import com.daren.chen.sdk.artemis.dto.request.HkvsCameraVideoLockParam;
import com.daren.chen.sdk.artemis.dto.request.HkvsCameraVideoStartParam;
import com.daren.chen.sdk.artemis.dto.request.HkvsCameraVideoStopParam;
import com.daren.chen.sdk.artemis.dto.request.HkvsManualCaptureParam;
import com.daren.chen.sdk.artemis.dto.request.HkvsPtzControllingParam;
import com.daren.chen.sdk.artemis.dto.request.HkvsQueryCameraPlaybackURLsParam;
import com.daren.chen.sdk.artemis.dto.request.HkvsQueryCameraPreviewURLsParam;
import com.daren.chen.sdk.artemis.dto.request.HkvsQueryCameraVideoStatusParam;
import com.daren.chen.sdk.artemis.dto.request.HkvsQueryCameraVideoTaskIdParam;
import com.daren.chen.sdk.artemis.utils.CustomizeHttpUtil;
import com.daren.chen.sdk.artemis.utils.PreviewURLsApiUtil;

/**
 * @Description:
 * @author: chendaren
 * @CreateDate: 2020/3/22 20:59
 */
public class VideoService {

    /**
     * 获取监控点预览取流URLv2
     *
     * @param param
     * @return
     */
    public static HkvsResResult<HkvsCameraPreviewURLs> findCameraPreviewURLs(HkvsQueryCameraPreviewURLsParam param) {
        if (param == null) {
            param = new HkvsQueryCameraPreviewURLsParam();
        }
        try {
            String result =
                CustomizeHttpUtil.doPostStringArtemis(PreviewURLsApiUtil.getPath(CamerasUrl.CAMERAS_PREVIEWURLS_URL),
                    JSON.toJSONString(param), null, null, ContentType.APPLICATION_JSON.getMimeType());
            if (StringUtils.isBlank(result)) {
                return HkvsResResult.error("返回消息为空");
            }
            HkvsResResult<HkvsCameraPreviewURLs> hkvsResResult =
                JSON.parseObject(result, new TypeReference<HkvsResResult<HkvsCameraPreviewURLs>>() {});
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
     * 获取监控点回放取流URLv2
     *
     * @param param
     * @return
     */
    public static HkvsResResult<HkvsCameraPlaybackURLs> findCameraPlaybackURLs(HkvsQueryCameraPlaybackURLsParam param) {
        if (param == null) {
            param = new HkvsQueryCameraPlaybackURLsParam();
        }
        try {
            String result =
                CustomizeHttpUtil.doPostStringArtemis(PreviewURLsApiUtil.getPath(CamerasUrl.CAMERAS_PLAYBACKURLS_URL),
                    JSON.toJSONString(param), null, null, ContentType.APPLICATION_JSON.getMimeType());
            if (StringUtils.isBlank(result)) {
                return HkvsResResult.error("返回消息为空");
            }
            HkvsResResult<HkvsCameraPlaybackURLs> hkvsResResult =
                JSON.parseObject(result, new TypeReference<HkvsResResult<HkvsCameraPlaybackURLs>>() {});
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
     * 根据监控点编号进行云台操作接口
     *
     * @param param
     * @return
     */
    public static HkvsResResult<Object> controlling(HkvsPtzControllingParam param) {
        if (param == null) {
            param = new HkvsPtzControllingParam();
        }
        try {
            String result =
                CustomizeHttpUtil.doPostStringArtemis(PreviewURLsApiUtil.getPath(CamerasUrl.CAMERAS_CONTROLLING_URL),
                    JSON.toJSONString(param), null, null, ContentType.APPLICATION_JSON.getMimeType());
            if (StringUtils.isBlank(result)) {
                return HkvsResResult.error("返回消息为空");
            }
            HkvsResResult<Object> hkvsResResult =
                JSON.parseObject(result, new TypeReference<HkvsResResult<Object>>() {});
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
     * 该接口用于手动触发设备抓图，返回图片的地址，抓图前请确保平台上已配置图片存储信息。抓图时间为触发手动抓图命令的时间。
     *
     * @param param
     * @return
     */
    public static HkvsResResult<HkvsManualCapture> manualCapture(HkvsManualCaptureParam param) {
        if (param == null) {
            param = new HkvsManualCaptureParam();
        }
        try {
            String result =
                CustomizeHttpUtil.doPostStringArtemis(PreviewURLsApiUtil.getPath(CamerasUrl.CAMERAS_MANUALCAPTURE_URL),
                    JSON.toJSONString(param), null, null, ContentType.APPLICATION_JSON.getMimeType());
            if (StringUtils.isBlank(result)) {
                return HkvsResResult.error("返回消息为空");
            }
            HkvsResResult<HkvsManualCapture> hkvsResResult =
                JSON.parseObject(result, new TypeReference<HkvsResResult<HkvsManualCapture>>() {});
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
     * 该接口用于控制监控点进行3D电子放大。
     *
     * @param param
     * @return
     */
    public static HkvsResResult<HkvsCamera3dSelZoom> camera3dSelZoom(HkvsCamera3dSelZoomParam param) {
        if (param == null) {
            param = new HkvsCamera3dSelZoomParam();
        }
        try {
            String result =
                CustomizeHttpUtil.doPostStringArtemis(PreviewURLsApiUtil.getPath(CamerasUrl.CAMERAS_SELZOOM_URL),
                    JSON.toJSONString(param), null, null, ContentType.APPLICATION_JSON.getMimeType());
            if (StringUtils.isBlank(result)) {
                return HkvsResResult.error("返回消息为空");
            }
            HkvsResResult<HkvsCamera3dSelZoom> hkvsResResult =
                JSON.parseObject(result, new TypeReference<HkvsResResult<HkvsCamera3dSelZoom>>() {});
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
     * 录像锁定与解锁
     *
     * @param param
     * @return
     */
    public static HkvsResResult<Object> cameraVideoLock(HkvsCameraVideoLockParam param) {
        if (param == null) {
            param = new HkvsCameraVideoLockParam();
        }
        try {
            String result = CustomizeHttpUtil.doPostStringArtemis(
                PreviewURLsApiUtil.getPath(CamerasUrl.CAMERAS_MANUALRECORD_LOCK_URL), JSON.toJSONString(param), null,
                null, ContentType.APPLICATION_JSON.getMimeType());
            if (StringUtils.isBlank(result)) {
                return HkvsResResult.error("返回消息为空");
            }
            HkvsResResult<Object> hkvsResResult =
                JSON.parseObject(result, new TypeReference<HkvsResResult<Object>>() {});
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
     * 开始手动录像
     *
     * @param param
     * @return
     */
    public static HkvsResResult<HkvsCameraVideoStart> cameraVideoStart(HkvsCameraVideoStartParam param) {
        if (param == null) {
            param = new HkvsCameraVideoStartParam();
        }
        try {
            String result = CustomizeHttpUtil.doPostStringArtemis(
                PreviewURLsApiUtil.getPath(CamerasUrl.CAMERAS_MANUALRECORD_START_URL), JSON.toJSONString(param), null,
                null, ContentType.APPLICATION_JSON.getMimeType());
            if (StringUtils.isBlank(result)) {
                return HkvsResResult.error("返回消息为空");
            }
            HkvsResResult<HkvsCameraVideoStart> hkvsResResult =
                JSON.parseObject(result, new TypeReference<HkvsResResult<HkvsCameraVideoStart>>() {});
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
     * 停止手动录像
     *
     * @param param
     * @return
     */
    public static HkvsResResult<Object> cameraVideoStop(HkvsCameraVideoStopParam param) {
        if (param == null) {
            param = new HkvsCameraVideoStopParam();
        }
        try {
            String result = CustomizeHttpUtil.doPostStringArtemis(
                PreviewURLsApiUtil.getPath(CamerasUrl.CAMERAS_MANUALRECORD_STOP_URL), JSON.toJSONString(param), null,
                null, ContentType.APPLICATION_JSON.getMimeType());
            if (StringUtils.isBlank(result)) {
                return HkvsResResult.error("返回消息为空");
            }
            HkvsResResult<Object> hkvsResResult =
                JSON.parseObject(result, new TypeReference<HkvsResResult<Object>>() {});
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
     * 获取手动录像状态
     *
     * @param param
     * @return
     */
    public static HkvsResResult<HkvsCameraVideoStatus> getCameraVideoStatus(HkvsQueryCameraVideoStatusParam param) {
        if (param == null) {
            param = new HkvsQueryCameraVideoStatusParam();
        }
        try {
            String result = CustomizeHttpUtil.doPostStringArtemis(
                PreviewURLsApiUtil.getPath(CamerasUrl.CAMERAS_MANUALRECORD_STATUS_URL), JSON.toJSONString(param), null,
                null, ContentType.APPLICATION_JSON.getMimeType());
            if (StringUtils.isBlank(result)) {
                return HkvsResResult.error("返回消息为空");
            }
            HkvsResResult<HkvsCameraVideoStatus> hkvsResResult =
                JSON.parseObject(result, new TypeReference<HkvsResResult<HkvsCameraVideoStatus>>() {});
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
     * 获取录像任务ID
     *
     * @param param
     * @return
     */
    public static HkvsResResult<HkvsSerachCameraVideoTaskId>
        getCameraVideotaskId(HkvsQueryCameraVideoTaskIdParam param) {
        if (param == null) {
            param = new HkvsQueryCameraVideoTaskIdParam();
        }
        try {
            String result = CustomizeHttpUtil.doPostStringArtemis(
                PreviewURLsApiUtil.getPath(CamerasUrl.CAMERAS_MANUALRECORD_SERACH_TASKID_URL), JSON.toJSONString(param),
                null, null, ContentType.APPLICATION_JSON.getMimeType());
            if (StringUtils.isBlank(result)) {
                return HkvsResResult.error("返回消息为空");
            }
            HkvsResResult<HkvsSerachCameraVideoTaskId> hkvsResResult =
                JSON.parseObject(result, new TypeReference<HkvsResResult<HkvsSerachCameraVideoTaskId>>() {});
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
