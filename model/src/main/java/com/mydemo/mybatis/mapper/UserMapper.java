package com.mydemo.mybatis.mapper;

import com.mydemo.mybatis.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 指定这是一个操作数据库的mapper
 *
 * @author
 */
@Mapper
@Repository
public interface UserMapper {
    User queryUserInfo(@Param("id")String id);

    List<User> getUserList();
}
