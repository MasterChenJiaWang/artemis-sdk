package com.daren.chen.sdk.artemis.dto.request;

import java.io.Serializable;
import java.util.List;

import com.daren.chen.sdk.artemis.dto.domain.HkvsPage;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 视频质量诊断
 *
 * @Description:
 * @author: chendaren
 * @CreateDate: 2020/3/22 20:39
 */
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
public class HkvsQueryVideoQualityDiagnosisParam extends HkvsPage implements Serializable {

    private static final long serialVersionUID = -8636476820741188386L;
    /**
     * 监控点编号集， 可通过分页获取监控点资源获取返回参数cameraIndexCode
     */
    private List<String> indexCodes;

}
