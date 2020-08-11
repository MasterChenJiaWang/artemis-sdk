package com.daren.chen.sdk.artemis.dto.domain;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @Description:
 * @author: chendaren
 * @CreateDate: 2020/1/20 17:39
 */
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
public class HkvsPage implements Serializable {

    private static final long serialVersionUID = 5792751583568247700L;
    /**
     * 当前页码
     */
    private Long pageNo = 1L;

    /**
     * 分页大小
     */
    private Long pageSize = 50L;

    /**
     * 降序升序,降序：desc 升序：asc
     */
    private String orderBy = "desc";

    /**
     * 排序字段,注意：排序字段必须是查询条件，否则返回参数错误
     */
    private String orderType;

    public HkvsPage(Long pageNo, Long pageSize) {
        this.pageNo = pageNo;
        this.pageSize = pageSize;
    }
}
