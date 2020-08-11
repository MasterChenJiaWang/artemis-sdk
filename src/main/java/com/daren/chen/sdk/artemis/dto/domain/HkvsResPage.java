package com.daren.chen.sdk.artemis.dto.domain;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @Description:
 * @author: chendaren
 * @CreateDate: 2020/1/20 17:54
 */
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
public class HkvsResPage<T> implements Serializable {

    private static final long serialVersionUID = -94696716662499334L;

    /**
     * 记录总数
     */
    private Integer total;
    /**
     * 当前页码
     */
    private Integer pageNo;

    /**
     * 分页大小
     */
    private Integer pageSize;

    /**
     * 返回数据
     */
    private List<T> list;
}
