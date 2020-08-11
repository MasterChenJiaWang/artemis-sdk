package com.daren.chen.sdk.artemis.dto.domain;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @Description:
 * @author: chendaren
 * @CreateDate: 2020/3/24 11:29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
public class HkvsFailures implements Serializable {

    private static final long serialVersionUID = -5990415789577904649L;

    /**
     * 调用方指定Id
     */
    private String clientId;

    /**
     * 错误码
     */
    private String code;

    /**
     * 错误信息
     */
    private String msg;
}
