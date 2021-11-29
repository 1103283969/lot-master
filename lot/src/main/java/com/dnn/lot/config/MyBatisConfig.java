package com.dnn.lot.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类
 * Created by wzl on 2021/11/29.
 */
@Configuration
@MapperScan({"com.dnn.lot.mapper","com.dnn.lot.dao"})
public class MyBatisConfig {

}