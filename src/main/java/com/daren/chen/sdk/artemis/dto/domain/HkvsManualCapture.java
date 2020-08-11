package com.daren.chen.sdk.artemis.dto.domain;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @Description:
 * @author: chendaren
 * @CreateDate: 2020/3/22 19:23
 */
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
public class HkvsManualCapture implements Serializable {

    private static final long serialVersionUID = -2573322367514030813L;
    /**
     * 图片url信息
     */
    private String picUrl;

}
