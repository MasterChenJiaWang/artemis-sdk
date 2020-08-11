package com.daren.chen.sdk.artemis.service;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.http.entity.ContentType;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.daren.chen.sdk.artemis.common.ResourceUrl;
import com.daren.chen.sdk.artemis.dto.domain.HkvsCamera;
import com.daren.chen.sdk.artemis.dto.domain.HkvsCameraInfo;
import com.daren.chen.sdk.artemis.dto.domain.HkvsEncodeDevice;
import com.daren.chen.sdk.artemis.dto.domain.HkvsPage;
import com.daren.chen.sdk.artemis.dto.domain.HkvsResPage;
import com.daren.chen.sdk.artemis.dto.domain.HkvsResResult;
import com.daren.chen.sdk.artemis.dto.request.HkvsQueryCameraByRegionParam;
import com.daren.chen.sdk.artemis.dto.request.HkvsQueryCameraParam;
import com.daren.chen.sdk.artemis.dto.request.HkvsQueryDeviceByRegionParam;
import com.daren.chen.sdk.artemis.dto.request.HkvsQueryDeviceParam;
import com.daren.chen.sdk.artemis.utils.CustomizeHttpUtil;
import com.daren.chen.sdk.artemis.utils.PreviewURLsApiUtil;

/**
 * @Description:
 * @author: chendaren
 * @CreateDate: 2020/1/20 17:37
 */
public class ResourceService {

    /**
     * 获取编码设备列表
     *
     * @param hkvsPage
     * @return
     */
    public static HkvsResResult<HkvsResPage<HkvsEncodeDevice>> queryEncodeDeviceList(HkvsPage hkvsPage) {
        if (null == hkvsPage) {
            hkvsPage = new HkvsPage();
        }
        try {
            String result = CustomizeHttpUtil.doPostStringArtemis(
                PreviewURLsApiUtil.getPath(ResourceUrl.RESOURCE_ENCODEDEVICE_GET_URL), JSON.toJSONString(hkvsPage),
                null, null, ContentType.APPLICATION_JSON.getMimeType());
            if (StringUtils.isBlank(result)) {
                return HkvsResResult.error("返回消息为空");
            }
            HkvsResResult<HkvsResPage<HkvsEncodeDevice>> hkvsResResult =
                JSON.parseObject(result, new TypeReference<HkvsResResult<HkvsResPage<HkvsEncodeDevice>>>() {});
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
     * 查询目录下有权限的编码设备列表。
     *
     * @param param
     * @return
     */
    public static HkvsResResult<HkvsResPage<HkvsEncodeDevice>> findEncodeDeviceList(HkvsQueryDeviceParam param) {
        if (null == param) {
            param = new HkvsQueryDeviceParam();
        }
        try {
            String result = CustomizeHttpUtil.doPostStringArtemis(
                PreviewURLsApiUtil.getPath(ResourceUrl.RESOURCE_ENCODEDEVICE_SEARCH_URL), JSON.toJSONString(param),
                null, null, ContentType.APPLICATION_JSON.getMimeType());
            if (StringUtils.isBlank(result)) {
                return HkvsResResult.error("返回消息为空");
            }
            HkvsResResult<HkvsResPage<HkvsEncodeDevice>> hkvsResResult =
                JSON.parseObject(result, new TypeReference<HkvsResResult<HkvsResPage<HkvsEncodeDevice>>>() {});
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
     * 获取单个编码设备信息
     *
     * @param resourceIndexCode
     * @return
     */
    public static HkvsResResult<HkvsEncodeDevice> findEncodeDevice(String resourceIndexCode) {
        if (StringUtils.isBlank(resourceIndexCode)) {
            return HkvsResResult.error("参数为空");
        }
        Map<String, String> map = new HashMap<>(2);
        map.put("resourceIndexCode", resourceIndexCode);
        try {
            String result = CustomizeHttpUtil.doPostStringArtemis(
                PreviewURLsApiUtil.getPath(ResourceUrl.RESOURCE_ENCODEDEVICE_SINGLE_GET_URL), JSON.toJSONString(map),
                null, null, ContentType.APPLICATION_JSON.getMimeType());
            if (StringUtils.isBlank(result)) {
                return HkvsResResult.error("返回消息为空");
            }
            HkvsResResult<HkvsEncodeDevice> hkvsResResult =
                JSON.parseObject(result, new TypeReference<HkvsResResult<HkvsEncodeDevice>>() {});
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
     * 根据区域获取下级编码设备列表
     *
     * @param param
     * @return
     */
    public static HkvsResResult<HkvsResPage<HkvsEncodeDevice>>
        findEncodeDeviceByRegion(HkvsQueryDeviceByRegionParam param) {
        if (param == null) {
            return HkvsResResult.error("参数为空");
        }
        try {
            String result = CustomizeHttpUtil.doPostStringArtemis(
                PreviewURLsApiUtil.getPath(ResourceUrl.RESOURCE_ENCODEDEVICE_SUBRESOURCES_URL),
                JSON.toJSONString(param), null, null, ContentType.APPLICATION_JSON.getMimeType());
            if (StringUtils.isBlank(result)) {
                return HkvsResResult.error("返回消息为空");
            }
            HkvsResResult<HkvsResPage<HkvsEncodeDevice>> hkvsResResult =
                JSON.parseObject(result, new TypeReference<HkvsResResult<HkvsResPage<HkvsEncodeDevice>>>() {});
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
     * 查询监控点列表v2
     *
     * @param param
     * @return
     */
    public static HkvsResResult<HkvsResPage<HkvsCamera>> queryCameraList(HkvsQueryCameraParam param) {
        if (null == param) {
            param = new HkvsQueryCameraParam();
        }
        try {
            String result = CustomizeHttpUtil.doPostStringArtemis(
                PreviewURLsApiUtil.getPath(ResourceUrl.RESOURCE_CAMERAS_ADVANCE_CAMERALIST_URL),
                JSON.toJSONString(param), null, null, ContentType.APPLICATION_JSON.getMimeType());
            if (StringUtils.isBlank(result)) {
                return HkvsResResult.error("返回消息为空");
            }
            HkvsResResult<HkvsResPage<HkvsCamera>> hkvsResResult =
                JSON.parseObject(result, new TypeReference<HkvsResResult<HkvsResPage<HkvsCamera>>>() {});
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
     * 获取监控点列表接口可用来全量同步监控点信息，返回结果分页展示。
     *
     * @param hkvsPage
     * @return
     */
    public static HkvsResResult<HkvsResPage<HkvsCameraInfo>> queryPageCameraList(HkvsPage hkvsPage) {
        if (null == hkvsPage) {
            hkvsPage = new HkvsPage();
        }
        try {
            String result =
                CustomizeHttpUtil.doPostStringArtemis(PreviewURLsApiUtil.getPath(ResourceUrl.RESOURCE_CAMERAS_URL),
                    JSON.toJSONString(hkvsPage), null, null, ContentType.APPLICATION_JSON.getMimeType());
            if (StringUtils.isBlank(result)) {
                return HkvsResResult.error("返回消息为空");
            }
            HkvsResResult<HkvsResPage<HkvsCameraInfo>> hkvsResResult =
                JSON.parseObject(result, new TypeReference<HkvsResResult<HkvsResPage<HkvsCameraInfo>>>() {});
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
     * 根据指定的区域编号获取该区域下的监控点列表信息，返回结果分页展示。
     *
     * @param param
     * @return
     */
    public static HkvsResResult<HkvsResPage<HkvsCameraInfo>>
        queryCameraListByRegion(HkvsQueryCameraByRegionParam param) {
        if (null == param) {
            param = new HkvsQueryCameraByRegionParam();
        }
        try {
            String result = CustomizeHttpUtil.doPostStringArtemis(
                PreviewURLsApiUtil.getPath(ResourceUrl.RESOURCE_REGIONS_REGIONINDEXCODE_CAMERAS_URL),
                JSON.toJSONString(param), null, null, ContentType.APPLICATION_JSON.getMimeType());
            if (StringUtils.isBlank(result)) {
                return HkvsResResult.error("返回消息为空");
            }
            HkvsResResult<HkvsResPage<HkvsCameraInfo>> hkvsResResult =
                JSON.parseObject(result, new TypeReference<HkvsResResult<HkvsResPage<HkvsCameraInfo>>>() {});
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
     * 获取单个监控点信息是指根据监控点唯一标识来获取指定的监控点信息。
     *
     * @param cameraIndexCode
     *            监控点编号，可通过分页获取监控点资源获取
     * @return
     */
    public static HkvsResResult<HkvsCameraInfo> findCameraInfoByCameraIndexCode(String cameraIndexCode) {
        if (StringUtils.isBlank(cameraIndexCode)) {
            return HkvsResResult.error("参数为空");
        }
        Map<String, String> map = new HashMap<>(2);
        map.put("cameraIndexCode", cameraIndexCode);
        try {
            String result = CustomizeHttpUtil.doPostStringArtemis(
                PreviewURLsApiUtil.getPath(ResourceUrl.RESOURCE_CAMERAS_INDEXCODE_URL), JSON.toJSONString(map), null,
                null, ContentType.APPLICATION_JSON.getMimeType());
            if (StringUtils.isBlank(result)) {
                return HkvsResResult.error("返回消息为空");
            }
            HkvsResResult<HkvsCameraInfo> hkvsResResult =
                JSON.parseObject(result, new TypeReference<HkvsResResult<HkvsCameraInfo>>() {});
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
