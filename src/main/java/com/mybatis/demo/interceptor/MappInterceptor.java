package com.mybatis.demo.interceptor;

import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.plugin.*;
import java.util.Properties;

/**
 * Created by yangliangbin on 2016/9/29.
 * mybatis的Mapper拦截器,处理公用Dao
 */
@Intercepts({
    @Signature(
            type = Executor.class,
            method = "insert",//拦截的方法
            args = {Object.class}
            ),
    @Signature(
            type = Executor.class,
            method = "update",
            args = {Object.class})
})
public class MappInterceptor implements Interceptor {

    /**
     * 对方法进行拦截
     * @param invocation
     * @return
     * @throws Throwable
     */
    public Object intercept(Invocation invocation) throws Throwable {

        //todo
        processIntercept(invocation.getArgs());
        return invocation.proceed();
    }

    /**
     * 把拦截器插入到目标对象中
     * @param o
     * @return
     */
    public Object plugin(Object o) {
        return Plugin.wrap(o, this);
    }

    /**
     * 设置属性
     * @param properties
     */
    public void setProperties(Properties properties) {

    }

    /**
     * 处理拦截信息
     * @param queryArgs
     */
    @SuppressWarnings("unchecked")
    private void processIntercept(final Object[] queryArgs) {
        Class t = (Class) queryArgs[0];


    }
}
