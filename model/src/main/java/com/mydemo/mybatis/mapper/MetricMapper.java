package com.mydemo.mybatis.mapper;

import com.mydemo.mybatis.entity.MetricDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface MetricMapper {

    int create(MetricDO dataObject);

    List<MetricDO> listByUserId(@Param("userId") String userId);

    List<MetricDO> listByMainMetric(@Param("userId") String userId, @Param("mainMetric") String mainMetric);

    List<MetricDO> listBySubMetric(@Param("userId") String userId, @Param("subMetric") String subMetric);

    int delete(@Param("id") String id, @Param("modifier") String modifier);

    MetricDO getById(@Param("id") String id);
}
