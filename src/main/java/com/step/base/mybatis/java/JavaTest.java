package com.step.base.mybatis.java;

import org.apache.ibatis.session.SqlSession;

/***
 * 通过接口
 * */
public class JavaTest {

    public static void main(String[] args) {
        SqlSession session = JavaMybatisFactory.getFactory().openSession();
        try {
            //通过接口
            UserMapper userMapper = session.getMapper(UserMapper.class);
            User user = userMapper.selectUser(101);
            System.err.println(user);
        } catch (Exception e)
        {
            e.printStackTrace();
        }finally {
            session.close();
        }
    }
}
