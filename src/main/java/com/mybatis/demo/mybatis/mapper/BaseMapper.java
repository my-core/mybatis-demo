package com.mybatis.demo.mybatis.mapper;

/**
 * Created by yangliangbin on 2016/9/29.
 */
public interface BaseMapper {

    /**
     * 获取指定条件的一条表记录
     * @param t 实体映射类型
     * @param columnName 列名
     * @param value      列值
     * @param <T>
     * @return
     */
    <T> T getModel(Class<T> t, String columnName, Object value);
}
