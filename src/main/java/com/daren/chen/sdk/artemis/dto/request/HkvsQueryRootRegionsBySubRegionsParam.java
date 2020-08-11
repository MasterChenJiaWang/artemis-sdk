package com.daren.chen.sdk.artemis.dto.request;

import java.io.Serializable;

import com.daren.chen.sdk.artemis.dto.domain.HkvsPage;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @Description:
 * @author: chendaren
 * @CreateDate: 2020/3/24 10:51
 */
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
public class HkvsQueryRootRegionsBySubRegionsParam extends HkvsPage implements Serializable {

    private static final long serialVersionUID = -4203055980354175104L;
    /**
     * 资源类型;详见附录A.3 资源类型/资源权限码 查询资源的类型，传region时查询的为用户有配置权限的区域树， 传资源类型如：camera、encodeDevice查询用户对该类资源有权限的区域树；
     * 注：资源iasDevice\reader\floor不进行权限校验，即不传authCodes
     */
    private String resourceType;

    /**
     * 级联标识，默认0 0: 全部， 1: 本级， 2: 级联
     */
    private Integer cascadeFlag;

    /**
     * 父区域编号，当指定parentIndexCode为-1时，表示查询根节点信息； 分页获取区域列表接口可以获取
     */
    private String parentIndexCode;
}
