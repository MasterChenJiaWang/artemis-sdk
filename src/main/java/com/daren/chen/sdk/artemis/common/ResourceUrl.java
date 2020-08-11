package com.daren.chen.sdk.artemis.common;

/**
 * @Description:
 * @author: chendaren
 * @CreateDate: 2020/1/20 16:24
 */
public class ResourceUrl {
    /**
     * 总资源url
     */
    public static final String BASE_RESOURCE_URL = "/artemis/api/resource/v1";

    //

    /**
     * 获取编码设备列表
     *
     * 分页获取编码设备列表，主要用于资源信息的全量同步。
     */
    public static final String RESOURCE_ENCODEDEVICE_GET_URL = ResourceUrl.BASE_RESOURCE_URL + "/encodeDevice/get";

    /**
     * 查询编码设备列表
     *
     * 查询目录下有权限的编码设备列表。
     */
    public static final String RESOURCE_ENCODEDEVICE_SEARCH_URL =
        ResourceUrl.BASE_RESOURCE_URL + "/encodeDevice/search";

    /**
     * 获取单个编码设备信息
     *
     * 根据资源编号查询单个编码设备详细信息，主要用于单个编码设备信息的展示。
     */
    public static final String RESOURCE_ENCODEDEVICE_SINGLE_GET_URL =
        ResourceUrl.BASE_RESOURCE_URL + "/encodeDevice/single/get";

    /**
     * 根据区域获取下级编码设备列表
     *
     * 根据区域编码、资源操作权限码分页获取当前区域下（不包含子区域）有权限的编码设备列表，主要用于逐层获取区域下的编码设备信息。
     */
    public static final String RESOURCE_ENCODEDEVICE_SUBRESOURCES_URL =
        ResourceUrl.BASE_RESOURCE_URL + "/encodeDevice/subResources";

    // 监控点信息
    /**
     * 查询监控点列表
     *
     * 查询监控点列表接口可以根据监控点唯一标识集、监控点名称、编码设备唯一标识、区域唯一标识、是否级联这些查询条件来进行高级查询；若不指定查询条件，即全量获取所有的监控点信息。返回结果分页展示。
     * 注：若指定多个查询条件，表示将这些查询条件进行”与”的组合后进行精确查询。 根据”监控点名称cameraName”查询为模糊查询。
     *
     */
    public static final String RESOURCE_CAMERAS_ADVANCE_CAMERALIST_URL =
        ResourceUrl.BASE_RESOURCE_URL + "/camera/advance/cameraList";

    /**
     * 分页获取监控点资源
     *
     * 获取监控点列表接口可用来全量同步监控点信息，返回结果分页展示。
     */
    public static final String RESOURCE_CAMERAS_URL = ResourceUrl.BASE_RESOURCE_URL + "/cameras";

    /**
     * 根据区域编号获取下级监控点列表
     *
     * 根据指定的区域编号获取该区域下的监控点列表信息，返回结果分页展示。 注：返回的监控点不包括下级区域的。
     */
    public static final String RESOURCE_REGIONS_REGIONINDEXCODE_CAMERAS_URL =
        ResourceUrl.BASE_RESOURCE_URL + "/regions/regionIndexCode/cameras";

    /**
     * 根据编号获取监控点详细信息
     *
     * 获取单个监控点信息是指根据监控点唯一标识来获取指定的监控点信息。
     */
    public static final String RESOURCE_CAMERAS_INDEXCODE_URL = ResourceUrl.BASE_RESOURCE_URL + "/cameras/indexCode";

}
