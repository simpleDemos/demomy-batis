package com.step.base.mybatis.commom;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisFactoryUtils {

    public static SqlSessionFactory getFactory(String resource){
        try {
            return new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream(resource));
        } catch (Exception e){
            e.printStackTrace();
        }
        return null;

    }
}
