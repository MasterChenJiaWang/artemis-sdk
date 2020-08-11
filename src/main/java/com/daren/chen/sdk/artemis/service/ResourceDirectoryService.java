package com.daren.chen.sdk.artemis.service;

import org.apache.commons.lang3.StringUtils;
import org.apache.http.entity.ContentType;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.daren.chen.sdk.artemis.common.ResourceDirectoryUrl;
import com.daren.chen.sdk.artemis.dto.domain.HkvsAddRegionResult;
import com.daren.chen.sdk.artemis.dto.domain.HkvsGetRootRegions;
import com.daren.chen.sdk.artemis.dto.domain.HkvsPage;
import com.daren.chen.sdk.artemis.dto.domain.HkvsQueryAllRegions;
import com.daren.chen.sdk.artemis.dto.domain.HkvsQueryRegions;
import com.daren.chen.sdk.artemis.dto.domain.HkvsResPage;
import com.daren.chen.sdk.artemis.dto.domain.HkvsResResult;
import com.daren.chen.sdk.artemis.dto.domain.HkvsUpdateRegion;
import com.daren.chen.sdk.artemis.dto.request.HkvsAddRegionsParam;
import com.daren.chen.sdk.artemis.dto.request.HkvsQueryRegionByIndexCodeParam;
import com.daren.chen.sdk.artemis.dto.request.HkvsQueryRootRegionsBySubRegionsParam;
import com.daren.chen.sdk.artemis.dto.request.HkvsQueryRootRegionsListV2Param;
import com.daren.chen.sdk.artemis.utils.CustomizeHttpUtil;
import com.daren.chen.sdk.artemis.utils.PreviewURLsApiUtil;

/**
 * @Description:
 * @author: chendaren
 * @CreateDate: 2020/3/24 10:49
 */
public class ResourceDirectoryService {

    /**
     * 获取根区域信息
     *
     * @return
     */
    public static HkvsResResult<HkvsGetRootRegions> queryRootRegionsList() {

        try {
            String result = CustomizeHttpUtil.doPostStringArtemis(
                PreviewURLsApiUtil.getPath(ResourceDirectoryUrl.GET_ROOT_REGIONS_INFO_URL), "", null, null,
                ContentType.APPLICATION_JSON.getMimeType());
            if (StringUtils.isBlank(result)) {
                return HkvsResResult.error("返回消息为空");
            }
            HkvsResResult<HkvsGetRootRegions> hkvsResResult =
                JSON.parseObject(result, new TypeReference<HkvsResResult<HkvsGetRootRegions>>() {});
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
     * 根据查询条件查询区域列表信息，主要用于区域信息查询过滤。 相对V1接口，支持级联场景的区域查询
     *
     * @return
     */
    public static HkvsResResult<HkvsResPage<HkvsQueryRegions>>
        queryRootRegionsListV2(HkvsQueryRootRegionsListV2Param param) {

        try {
            if (null == param) {
                param = new HkvsQueryRootRegionsListV2Param();
            }
            String result = CustomizeHttpUtil.doPostStringArtemis(
                PreviewURLsApiUtil.getPath(ResourceDirectoryUrl.GET_REGIONS_INFO_V2_URL), JSON.toJSONString(param),
                null, null, ContentType.APPLICATION_JSON.getMimeType());
            if (StringUtils.isBlank(result)) {
                return HkvsResResult.error("返回消息为空");
            }
            HkvsResResult<HkvsResPage<HkvsQueryRegions>> hkvsResResult =
                JSON.parseObject(result, new TypeReference<HkvsResResult<HkvsResPage<HkvsQueryRegions>>>() {});
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
     * 根据用户请求的资源类型和资源权限获取父区域的下级区域列表，主要用于逐层获取父区域的下级区域信息，例如监控点预览业务的区域树的逐层获取。下级区域只包括直接下级子区域。 注：
     * 查询区域管理权限（resourceType为region），若父区域的子区域无权限、但是其孙区域有权限时，会返回该无权限的子区域，但是该区域的available标记为false（表示无权限）
     *
     * @return
     */
    public static HkvsResResult<HkvsResPage<HkvsQueryRegions>>
        queryRootRegionsBySubRegions(HkvsQueryRootRegionsBySubRegionsParam param) {

        try {
            if (null == param) {
                param = new HkvsQueryRootRegionsBySubRegionsParam();
            }
            String result = CustomizeHttpUtil.doPostStringArtemis(
                PreviewURLsApiUtil.getPath(ResourceDirectoryUrl.GET_REGIONS_INFO_SUBREGIONS_URL),
                JSON.toJSONString(param), null, null, ContentType.APPLICATION_JSON.getMimeType());
            if (StringUtils.isBlank(result)) {
                return HkvsResResult.error("返回消息为空");
            }
            HkvsResResult<HkvsResPage<HkvsQueryRegions>> hkvsResResult =
                JSON.parseObject(result, new TypeReference<HkvsResResult<HkvsResPage<HkvsQueryRegions>>>() {});
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
     * 获取区域列表接口可用来全量同步区域信息，返回结果分页展示。 注：查询的区域包括非级联区域和级联区域。
     *
     * @return
     */
    public static HkvsResResult<HkvsResPage<HkvsQueryAllRegions>> queryPageRegions(HkvsPage param) {

        try {
            if (null == param) {
                param = new HkvsPage();
            }
            String result = CustomizeHttpUtil.doPostStringArtemis(
                PreviewURLsApiUtil.getPath(ResourceDirectoryUrl.GET_PAGE_REGIONS_INFO_URL), JSON.toJSONString(param),
                null, null, ContentType.APPLICATION_JSON.getMimeType());
            if (StringUtils.isBlank(result)) {
                return HkvsResResult.error("返回消息为空");
            }
            HkvsResResult<HkvsResPage<HkvsQueryAllRegions>> hkvsResResult =
                JSON.parseObject(result, new TypeReference<HkvsResResult<HkvsResPage<HkvsQueryAllRegions>>>() {});
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
     * 获取单个区域信息
     *
     * @return
     */
    public static HkvsResResult<HkvsQueryAllRegions> getRegionInfoByIndexCode(HkvsQueryRegionByIndexCodeParam param) {

        try {
            if (null == param) {
                param = new HkvsQueryRegionByIndexCodeParam();
            }
            String result = CustomizeHttpUtil.doPostStringArtemis(
                PreviewURLsApiUtil.getPath(ResourceDirectoryUrl.GET_REGIONS_INFO_BY_INDEXCODE_URL),
                JSON.toJSONString(param), null, null, ContentType.APPLICATION_JSON.getMimeType());
            if (StringUtils.isBlank(result)) {
                return HkvsResResult.error("返回消息为空");
            }
            HkvsResResult<HkvsQueryAllRegions> hkvsResResult =
                JSON.parseObject(result, new TypeReference<HkvsResResult<HkvsQueryAllRegions>>() {});
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
     * 支持区域的批量添加。 三方可以自行指定区域的唯一标识，也可以由ISC平台自行生成。
     *
     * @return
     */
    public static HkvsResResult<HkvsAddRegionResult> addRegionInfo(HkvsAddRegionsParam param) {

        try {
            if (null == param) {
                param = new HkvsAddRegionsParam();
            }
            String result = CustomizeHttpUtil.doPostStringArtemis(
                PreviewURLsApiUtil.getPath(ResourceDirectoryUrl.ADD_REGIONS_INFO_URL),
                JSON.toJSONString(param.getList()), null, null, ContentType.APPLICATION_JSON.getMimeType());
            if (StringUtils.isBlank(result)) {
                return HkvsResResult.error("返回消息为空");
            }
            HkvsResResult<HkvsAddRegionResult> hkvsResResult =
                JSON.parseObject(result, new TypeReference<HkvsResResult<HkvsAddRegionResult>>() {});
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
     * 根据区域标志修改区域信息
     *
     * @return
     */
    public static HkvsResResult<Object> updateRegionInfo(HkvsUpdateRegion param) {

        try {
            if (null == param) {
                param = new HkvsUpdateRegion();
            }
            String result = CustomizeHttpUtil.doPostStringArtemis(
                PreviewURLsApiUtil.getPath(ResourceDirectoryUrl.UPDATE_REGIONS_INFO_URL), JSON.toJSONString(param),
                null, null, ContentType.APPLICATION_JSON.getMimeType());
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
}
