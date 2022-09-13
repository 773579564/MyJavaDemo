package com.mydemo.mybatis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户的java类形式
 *
 * @author
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements java.io.Serializable{

    private static final long serialVersionUID = -1L;
    /**
     * 编号
     */
    private String id;

    /**
     * 用户名
     */
    private Integer age;

    /**
     *
     */
    private Integer height;

    /**
     *
     */
    private Integer weight;
}
