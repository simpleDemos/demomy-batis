package com.step.base.mybatis.xml;

import org.apache.ibatis.session.SqlSession;

/**
 * 通过配置文件
 * */
public class XmlTest {

    public static void main(String[] args) {
        SqlSession session = MybatisFactory.getFactory().openSession();
        try {
            //通过命名空间+方法名
           Blog blog = session.selectOne("Namespace.BlogMapper.selectBlog", 101);
            System.err.println(blog);

        } catch (Exception e)
        {
            e.printStackTrace();
        }finally {
            session.close();
        }
    }
}
