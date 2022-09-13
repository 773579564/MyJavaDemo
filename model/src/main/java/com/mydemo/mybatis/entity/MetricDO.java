package com.mydemo.mybatis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MetricDO extends BaseDO{


    private String id;
    /**
     * 域账号
     */
    private String userId;
    /**
     * 主度量
     */
    private String mainMetric;
    /**
     * 子度量
     */
    private String subMetric;
    /**
     * 度量条目
     */
    private String metricItem;
}
