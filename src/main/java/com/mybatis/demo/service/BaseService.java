package com.mybatis.demo.service;

import com.mybatis.demo.mybatis.mapper.BaseMapper;

import javax.annotation.Resource;

/**
 * Created by yangliangbin on 2016/9/29.
 */
public class BaseService implements  IBaseService {

    @Resource
    private BaseMapper baseMapper;

    /**
     * 获取指定条件的一条表记录
     * @param t 实体映射类型
     * @param columnName 列名
     * @param value      列值
     * @param <T>
     * @return
     */
    public <T> T getModel(Class<T> t, String columnName, Object value){
        return baseMapper.getModel(t,columnName,value);
    }
}
