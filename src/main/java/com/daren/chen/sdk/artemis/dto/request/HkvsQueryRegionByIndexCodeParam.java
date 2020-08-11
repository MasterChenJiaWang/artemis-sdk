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
public class HkvsQueryRegionByIndexCodeParam extends HkvsPage implements Serializable {

    private static final long serialVersionUID = -6460579608494386299L;
    /**
     * 区域唯一标识 最大长度64 分页获取区域列表接口可以获取
     */
    private String regionIndexCode;

    /**
     * 树编号（默认0，0代表国标树） 综合安防平台当前未使用该字段。该字段预留
     */
    private String treeCode;

}
