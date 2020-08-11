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
public class HkvsSuccess implements Serializable {

    private static final long serialVersionUID = 6052437949768312194L;
    /**
     * 调用方指定Id
     */
    private String clientId;

    /**
     * 区域唯一标识
     */
    private String regionIndexCode;
}
