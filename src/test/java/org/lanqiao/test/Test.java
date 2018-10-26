package org.lanqiao.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Before;
import org.lanqiao.dao.ClasMapper;
import org.lanqiao.dao.StudentMapper;
import org.lanqiao.pojo.Clas;
import org.lanqiao.pojo.Student;
import org.lanqiao.utils.mybatisUtils;

public class Test {
    SqlSession sqlSession;
    ClasMapper clasMapper;
    StudentMapper studentMapper;

    @Before
    public void init() {
        sqlSession = mybatisUtils.getSqlSession("mybatis-config.xml");
        clasMapper = sqlSession.getMapper(ClasMapper.class);
        studentMapper = sqlSession.getMapper(StudentMapper.class);
    }

    @org.junit.Test
    //关联查询：单表查询
    public void findClsByCidTest() {
        Clas clas = clasMapper.findCidByCid(1);
        System.out.println(clas);
    }

    @org.junit.Test
    //单表查询：多对一
    public void findStuBySidsTest() {
        Student student = studentMapper.findStuBySids(2);
        System.out.println(student);
        sqlSession.close();
        Student student1 = studentMapper.findStuBySids(2);
        System.out.println(student1);

    }
}