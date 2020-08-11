package com.daren.chen.sdk.artemis.common;

/**
 * @Description:
 * @author: chendaren
 * @CreateDate: 2020/3/24 10:36
 */
public class ResourceDirectoryUrl {

    /**
     * 总 管理url
     */
    public static final String V1_BASE_MANAGEMENT_URL = "/artemis/api/resource/v1";
    /**
     *
     */
    public static final String V2_BASE_MANAGEMENT_URL = "/artemis/api/resource/v2";

    /**
     * 获取根区域信息
     */
    public static final String GET_ROOT_REGIONS_INFO_URL =
        ResourceDirectoryUrl.V1_BASE_MANAGEMENT_URL + "/regions/root";

    /**
     * 根据查询条件查询区域列表信息，主要用于区域信息查询过滤。 相对V1接口，支持级联场景的区域查询
     */
    public static final String GET_REGIONS_INFO_V2_URL = "/artemis/api/irds/v2/region/nodesByParams";

    /**
     * 根据用户请求的资源类型和资源权限获取父区域的下级区域列表，主要用于逐层获取父区域的下级区域信息，例如监控点预览业务的区域树的逐层获取。下级区域只包括直接下级子区域。
     */
    public static final String GET_REGIONS_INFO_SUBREGIONS_URL =
        ResourceDirectoryUrl.V2_BASE_MANAGEMENT_URL + "/regions/subRegions";

    /**
     * 获取区域列表接口可用来全量同步区域信息，返回结果分页展示。 注：查询的区域包括非级联区域和级联区域。
     */
    public static final String GET_PAGE_REGIONS_INFO_URL = ResourceDirectoryUrl.V1_BASE_MANAGEMENT_URL + "/regions";

    /**
     * 获取单个区域信息
     */
    public static final String GET_REGIONS_INFO_BY_INDEXCODE_URL =
        ResourceDirectoryUrl.V1_BASE_MANAGEMENT_URL + "/regions/indexCode/regionInfo";

    /**
     * 支持区域的批量添加。 三方可以自行指定区域的唯一标识，也可以由ISC平台自行生成。
     */
    public static final String ADD_REGIONS_INFO_URL = ResourceDirectoryUrl.V1_BASE_MANAGEMENT_URL + "/region/batch/add";

    /**
     * 根据区域标志修改区域信息
     */
    public static final String UPDATE_REGIONS_INFO_URL =
        ResourceDirectoryUrl.V1_BASE_MANAGEMENT_URL + "/region/single/update";

}
