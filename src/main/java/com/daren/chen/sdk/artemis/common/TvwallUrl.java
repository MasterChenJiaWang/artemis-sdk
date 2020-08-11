package com.daren.chen.sdk.artemis.common;

/**
 * 视频网管
 *
 * @Description:
 * @author: chendaren
 * @CreateDate: 2020/1/20 16:24
 */
public class TvwallUrl {

    /**
     * 总电视墙 url
     */
    public static final String BASE_TVWALL_URL = "/artemis/api/tvms/v1/tvwall";

    //

    /**
     * 获取电视墙大屏信息
     *
     * 1.在电视墙客户端配置相关电视墙所需的信息：如添加电视墙、添加解码器、关联输出通道，配置场景信息。 2.调用获取电视墙所有的资源数据的接口。 3.电视墙接口返回参数众多，文档只给出足够支撑业务的关键返回参数。
     *
     */
    public static final String TVWALL_ALLRESOURCES_URL = TvwallUrl.BASE_TVWALL_URL + "/allResources";

    /**
     * 获取电视墙场景列表信息
     *
     * 1.在电视墙客户端配置电视墙的场景信息。 2.获取电视墙所有的场景列表信息。 3.电视墙接口返回参数众多，文档只给出足够支撑业务的关键返回参数。
     */
    public static final String TVWALL_SCENES_URL = TvwallUrl.BASE_TVWALL_URL + "/scenes";

    /**
     * 获取电视墙窗口信息列表
     *
     * 1.在电视墙客户端上添加解码器和电视墙，并关联解码器的输出通道至电视墙上。 2.在电视墙上进行开窗操作。 3.调用获取窗口列表信息接口。 4.电视墙接口返回参数众多，文档只给出足够支撑业务的关键返回参数。
     */
    public static final String TVWALL_WNDS_GET_URL = TvwallUrl.BASE_TVWALL_URL + "/wnds/get";

    /**
     * 电视墙场景切换
     *
     * 1.在电视墙客户端配置电视墙的场景信息。 2.获取电视墙所有的场景列表信息。 3.进行场景切换。 4.电视墙接口返回参数众多，文档只给出足够支撑业务的关键返回参数。
     */
    public static final String TVWALL_SCENE_SWITCH_URL = TvwallUrl.BASE_TVWALL_URL + "/scene/switch";

    /**
     * 批量上墙
     *
     * 1.在电视墙客户端上添加解码器和电视墙，并关联解码器的输出通道至电视墙上。 2.在电视墙上进行开窗操作。 3.调用窗口上墙接口（支持批量上墙）。 4.电视墙接口返回参数众多，文档只给出足够支撑业务的关键返回参数。
     */
    public static final String TVWALL_REALPLAY_ADD_URL = TvwallUrl.BASE_TVWALL_URL + "/realplay/add";

    /**
     * 批量下墙
     *
     * 1.在电视墙客户端上添加解码器和电视墙，并关联解码器的输出通道至电视墙上。 2.在电视墙上进行开窗上墙操作或调用窗口上墙接口。 3.调用窗口下墙接口（支持批量下墙）。
     * 4.电视墙接口返回参数众多，文档只给出足够支撑业务的关键返回参数。
     */
    public static final String TVWALL_REALPLAY_DELETE_URL = TvwallUrl.BASE_TVWALL_URL + "/realplay/delete";

}
