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
 * @CreateDate: 2020/3/22 18:52
 */
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
public class HkvsExpressions implements Serializable {

    private static final long serialVersionUID = 2775666675408161592L;
    /**
     * 资源属性名，目前支持作为查询条件的字段包括:
     * channelNo、indexCode、parentIndexCode、installLocation、capability、updateTime、createTime、resourceType、regionIndexCode、sort、name、description、treatyType。如：key传updateTime，operator传between可以查询特定时间段更新的数据，考虑到校时和夏令时，建议值查询过去一天的数据变更
     */
    private String key;
    /**
     * 操作运算符， 0 ：=， 1 ：>=， 2 ：<=， 3 ：in， 4 ：not in， 5 ：between， 6 ：like， 7 ：pre like 前置 %， 8 ：suffix like 后置 %
     */
    private Integer operator;
    /**
     * 资源属性值，=、>=、<=、like、values数组长度只能是1； in、not in，values数组长度大于1，最大不超时20； between支持整形和日期格式（ISO8601时间格式） ；like只能用于字符串。
     */
    private List<String> values;
}
