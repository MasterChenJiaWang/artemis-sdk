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
 * @CreateDate: 2020/3/22 21:01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
public class HkvsCameraPlaybackURLs implements Serializable {

    private static final long serialVersionUID = 6608046365539517353L;

    /**
     * 分页标记 标记本次查询的全部标识符，用于查询分片时的多次查询
     */
    private String uuid;
    /**
     * 取流短url，注：rtsp的回放url后面要指定?playBackMode=1 在vlc上才能播放
     */
    private String url;
    /**
     * 录像片段信息
     */
    private List<HkvsCameraPlaybackURLsData> list;

}
