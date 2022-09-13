package com.mydemo;

import com.mydemo.mybatis.entity.MetricDO;
import com.mydemo.mybatis.entity.User;
import com.mydemo.mybatis.mapper.MetricMapper;
import com.mydemo.mybatis.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;


public class MyBatisTest {

    @Test
    public void test(){
        try (SqlSession session = MyBatisUtils.getSession()) {

            //初始化sql接口
            UserMapper userMapper = session.getMapper(UserMapper.class);
            //执行sql方法
            List<User> userList = userMapper.getUserList();

            //输出结果
            for(User user : userList){
                System.out.println(userMapper.queryUserInfo(user.getId()));
            }

        }
    }

    @Test
    public void test2(){

        try (SqlSession session = MyBatisUtils.getSession()) {
            MetricDO metricDO = new MetricDO();
            metricDO.setMainMetric("mainTest");
            metricDO.setSubMetric("subTest");
            metricDO.setUserId("12345");
            metricDO.setCreator("Frank");
            metricDO.setModifier("Frank");
            metricDO.setMetricItem("{\"patentName\": \"Leads重构\", \"level\": \"PROJECT\"}");

            MetricMapper metricMapper = session.getMapper(MetricMapper.class);
            metricMapper.create(metricDO);

            session.commit();
        }
    }
}
