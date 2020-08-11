package com.daren.chen.sdk.artemis.dto.domain;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @Description:
 * @author: chendaren
 * @CreateDate: 2020/1/20 17:48
 */
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
public class HkvsResResult<T> implements Serializable {

    private static final long serialVersionUID = 156783666270025724L;

    public static final String SUCCESS_CODE = "0";
    /**
     * 返回码，0:接口业务处理成功
     */
    private String code;
    /**
     * 返回描述
     */
    private String msg;

    /**
     * 返回数据
     */
    private T data;

    /**
     *
     * @param msg
     * @param <T>
     * @return
     */
    public static <T> HkvsResResult<T> error(String msg) {
        return new HkvsResResult<>("-1", msg, null);
    }

    private static <T> HkvsResResult<T> build(String code, String msg, T data) {
        return new HkvsResResult<>(code, msg, data);
    }

}
