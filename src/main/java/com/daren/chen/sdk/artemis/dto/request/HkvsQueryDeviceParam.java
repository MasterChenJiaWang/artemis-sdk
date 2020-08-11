package com.daren.chen.sdk.artemis.dto.request;

import java.util.List;

import com.daren.chen.sdk.artemis.dto.domain.HkvsPage;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @Description:
 * @author: chendaren
 * @CreateDate: 2020/1/20 18:15
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class HkvsQueryDeviceParam extends HkvsPage {
    private static final long serialVersionUID = 2944522115588320948L;
    /**
     * 名称，模糊搜索 若包含中文，最大长度指不超过按照指定编码的字节长度，即getBytes(“utf-8”).length 最大长度：32
     */
    private String name;

    /**
     * 是否包含下级区域，注： 1、参数containSubRegion和regionIndexCodes必须同时存在，且regionIndexCodes只能指定一个区域编码；
     * 2、参数containSubRegion和exactCondition不能同时存在
     */
    private Boolean containSubRegion;

    /**
     * 区域编号,可以为空; 支持根据区域批量查询，区域编号个数<=1000个； 可通过区域信息接口获取
     */
    private List<String> regionIndexCodes;

    /**
     * 权限码集合 ; String[]，详见附录A.3,权限码个数<=20个； 单个权限码长度<=40Byte； 当authCodes为空时，则不进行权限过滤； 当authCodes为空时，则只返回对应权限码的资源信息
     */
    private List<String> authCodes;

    public HkvsQueryDeviceParam(Long pageNo, Long pageSize) {
        super(pageNo, pageSize);
    }
}
