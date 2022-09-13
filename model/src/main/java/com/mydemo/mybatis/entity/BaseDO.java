package com.mydemo.mybatis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseDO implements java.io.Serializable{

    private static final long serialVersionUID = -1L;

    private String creator;

    private String modifier;
}
