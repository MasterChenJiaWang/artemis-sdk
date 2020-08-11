package com.daren.chen.sdk.artemis.dto.request;

import java.io.Serializable;
import java.util.List;

import com.daren.chen.sdk.artemis.dto.domain.HkvsAddRegion;
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
public class HkvsAddRegionsParam extends HkvsPage implements Serializable {

    private static final long serialVersionUID = 7772874742780576927L;

    /**
     *
     */
    private List<HkvsAddRegion> list;

}
