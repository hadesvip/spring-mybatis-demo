package com.utils.page;


import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.SystemMetaObject;

import java.sql.Connection;
import java.util.Properties;

/**
 * 分页插件
 * 原理:主要拦截的是StatementHandler类中的prepare方法，
 * 因为sql的预编译是在StatementHandler类中的prepare方法中进行的，
 * 所以我们只要拦截StatementHandler类中的prepare方法，将要sql改成分页sql
 * mybatis 四大组件　Executor,StatementHandler,ParameterHandler,ResultHandler
 *
 * @author created by wangyong on 17-11-12
 */
@Intercepts({
        @Signature(
                type = StatementHandler.class,
                method = "prepare",
                args = {Connection.class}
        )
})
public class PagePlugin implements Interceptor {

    //默认页码
    private Integer defaultPage;
    //默认每页展示条数
    private Integer defaultPageSize;
    //默认是否启动插件
    private Boolean defaultUseFlag;
    //默认是否检测页码有效性
    private Boolean defaultCheckFlag;


    /**
     * @param invocation
     * @return
     * @throws Throwable
     * @see org.apache.ibatis.scripting.defaults.DefaultParameterHandler
     * @see org.apache.ibatis.mapping.BoundSql
     */
    @Override
    public Object intercept(Invocation invocation) throws Throwable {

        //TODO 从代理对象中抽取出真正的对象
        StatementHandler statementHandler = (StatementHandler) invocation.getTarget();
        MetaObject metaObject = SystemMetaObject.forObject(statementHandler);
        Object object = null;
        while (metaObject.hasGetter("h")) {
            object = metaObject.getValue("h");
        }


        //TODO 1. 获取要执行的sql

        //TODO 2. 判断是否是查询语句

        //TODO 3.如果不是查询语句或者不是要分页的查询直接放开

        //TODO 4.

        //TODO 1. 获取当时sql返回的总记录数

        //TODO 2.计算出总页数，回填值


        return null;
    }

    /**
     * 生成代理对象
     *
     * @param target
     * @return
     */
    @Override
    public Object plugin(Object target) {
        return Plugin.wrap(target, this);
    }

    /**
     * 用于设定默认值，参数来源于PageParams
     *
     * @param properties
     * @see com.utils.page.PageParams
     */
    @Override
    public void setProperties(Properties properties) {

        // defaultPage = properties.getProperty("default.page","1");

    }


    /**
     * 检查是否是查询语句
     *
     * @param sql 要执行的sql语句
     * @return true 为是查询语句
     */
    boolean checkSelectOrFindOrGet(String sql) {
        return sql.trim().toLowerCase().indexOf("select") > 0
                || sql.trim().toLowerCase().indexOf("find") > 0
                || sql.trim().toLowerCase().indexOf("get") > 0;
    }
}
