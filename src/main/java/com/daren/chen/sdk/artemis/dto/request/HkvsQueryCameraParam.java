package com.daren.chen.sdk.artemis.dto.request;

import java.io.Serializable;
import java.util.List;

import com.daren.chen.sdk.artemis.dto.domain.HkvsExpressions;
import com.daren.chen.sdk.artemis.dto.domain.HkvsPage;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @Description:
 * @author: chendaren
 * @CreateDate: 2020/3/22 18:49
 */
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
public class HkvsQueryCameraParam extends HkvsPage implements Serializable {
    private static final long serialVersionUID = -8106967774626352089L;

    /**
     * 名称，模糊搜索，最大长度32，若包含中文，最大长度指不超过按照指定编码的字节长度，即getBytes(“utf-8”).length
     */
    private String name;
    /**
     * true时，搜索regionIndexCodes及其子孙区域的资源； false时，只搜索 regionIndexCodes的资源； isSubRegion不为空，regionIndexCodes也不可为空
     */
    private Boolean isSubRegion;

    /**
     * 区域编号,可以为空; String[]，支持根据区域批量查询； 区域编号个数 <=1000个； 单个长度<=64Byte；，可从查询区域列表v2接口获取返回参数indexCode
     */
    private List<String> regionIndexCodes;
    /**
     * 权限码集合，详见附录A.3 资源权限码中的监控点对应的资源权限码
     */
    private List<String> authCodes;
    /**
     * 查询表达式
     */
    private List<HkvsExpressions> hkvsExpressionsList;

}
