package com.daren.chen.sdk.artemis.dto.request;

import java.io.Serializable;
import java.util.List;

import com.daren.chen.sdk.artemis.dto.domain.HkvsPage;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 视频质量诊断
 *
 * @Description:
 * @author: chendaren
 * @CreateDate: 2020/3/22 20:39
 */
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
public class HkvsQueryCameraOnlineStatusParam extends HkvsPage implements Serializable {

    private static final long serialVersionUID = -5669435232517273281L;
    /**
     * 监控点编号集， 可通过分页获取监控点资源获取返回参数cameraIndexCode
     */
    private List<String> indexCodes;

    /**
     * 区域id； 可通过区域信息接口获取获取返回参数indexCode
     */
    private String regionId;
    /**
     * 是否包含下级区域中的资源数据，1包含，0不包含（若regionId为空，则该参数不起作用）
     */
    private String includeSubNode;
    /**
     * 状态，1-在线，0-离线，-1-未检测
     */
    private String status;

}
