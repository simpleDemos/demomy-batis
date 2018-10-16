package com.step.base.mybatis.anno;

import com.step.base.mybatis.commom.MyBatisFactoryUtils;
import org.apache.ibatis.session.SqlSession;

public class AnnoTest {

    public static void main(String[] args) {
        SqlSession session = MyBatisFactoryUtils.getFactory("mybatis-config-anno.xml").openSession();
        try {
            //通过注解,少一个 *Mapper.xml文件
            AnnoUserMapper userMapper = session.getMapper(AnnoUserMapper.class);
            AnnoUser user = userMapper.selectUser(101);
            System.err.println(user);
        } catch (Exception e)
        {
            e.printStackTrace();
        }finally {
            session.close();
        }
    }
}
