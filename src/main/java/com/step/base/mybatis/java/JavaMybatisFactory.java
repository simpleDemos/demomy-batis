package com.step.base.mybatis.java;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class JavaMybatisFactory {

    public static SqlSessionFactory getFactory(){
        try {
            return new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config-java.xml"));
        } catch (Exception e){
            e.printStackTrace();
        }
        return null;

    }
}
