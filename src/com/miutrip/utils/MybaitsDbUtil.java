package com.miutrip.utils;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Component;

/**
 * Mybaits数据库操作
 */
@Component
public class MybaitsDbUtil {
    //核心配置
    private static final String mybatConfig = "mybaitsconf.xml";

    static SqlSessionFactory sessionFactory;

    static {
        sessionFactory = new SqlSessionFactoryBuilder().build(MybaitsDbUtil.class.getClassLoader().getResourceAsStream(mybatConfig));
    }

    /**
     * 获取数据库连接
     * @return
     */
    public static SqlSession getSession() {
        return sessionFactory.openSession(true);
    }

    /**
     * 获取数据库连接
     * @param isAutoCommit 是否自动提交事务
     * @return
     */
    public static SqlSession getSession(boolean isAutoCommit) {
        return sessionFactory.openSession(isAutoCommit);
    }
}
