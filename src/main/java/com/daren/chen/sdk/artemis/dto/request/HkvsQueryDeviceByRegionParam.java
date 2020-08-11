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
 * @CreateDate: 2020/1/20 18:15
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class HkvsQueryDeviceByRegionParam extends HkvsPage implements Serializable {
    private static final long serialVersionUID = 9092899311920815942L;
    /**
     * 父区域编号； 可通过区域信息接口获取
     */
    private String regionIndexCode;

    /**
     * 权限码集合 ; String[]，详见附录A.3,权限码个数<=20个； 单个权限码长度<=40Byte； 当authCodes为空时，则不进行权限过滤； 当authCodes为空时，则只返回对应权限码的资源信息
     */
    private List<String> authCodes;

}
