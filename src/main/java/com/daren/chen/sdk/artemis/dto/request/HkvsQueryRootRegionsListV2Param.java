package com.daren.chen.sdk.artemis.dto.request;

import java.io.Serializable;
import java.util.List;

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
public class HkvsQueryRootRegionsListV2Param extends HkvsPage implements Serializable {
    private static final long serialVersionUID = 1573252441152880212L;

    /**
     * 资源类型;详见附录A.3 资源类型/资源权限码 查询资源的类型，传region时查询的为用户有配置权限的区域树， 传资源类型如：camera、encodeDevice查询用户对该类资源有权限的区域树；
     * 注：资源iasDevice\reader\floor不进行权限校验，即不传authCodes
     */
    private String resourceType;
    /**
     * 是否包含下级区域 true: 搜索parentIndexCodes的所有子、孙区域； false: 只搜索parentIndexCodes的直接子区域；
     */
    private boolean isSubRegion;

    /**
     * 区域类型 10: 普通区域 11: 级联区域 12: 楼栋单元
     */
    private Integer regionType;

    /**
     * 区域名称；根据区域名称过滤，可模糊查询； 若包含中文，最大长度40，最大长度指不超过按照指定编码的字节长度，即getBytes(“utf-8”).length
     */
    private String regionName;

    /**
     * 级联标识，默认0 0: 全部， 1: 本级， 2: 级联
     */
    private Integer cascadeFlag;

    /**
     * 父编号集合; 父编号个数 <=1000个； 单个长度<=64Byte； 分页获取区域列表接口可以获取
     */
    private List<String> parentIndexCodes;

    /**
     * 权限码集合; 详见附录A.3 资源类型/资源权限码 权限码个数 <=20个； 单个权限码长度 <=40Byte； 只有同时指定userId、authCodes时，才进行权限过滤；
     * 当指定多个权限码时，只返回同时具有这些权限码的区域；
     */
    private List<String> authCodes;

}
