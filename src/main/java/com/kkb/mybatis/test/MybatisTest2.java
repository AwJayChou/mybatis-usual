package com.kkb.mybatis.test;

import java.io.InputStream;

import org.junit.Test;

import com.kkb.mybatis.framework.builder.Configuration;
import com.kkb.mybatis.framework.builder.XmlConfigBuilder;


public class MybatisTest2 {

	/**
	 * 测试加载全局配置文件
	 * @throws Exception
	 */
	@Test
	public void test() throws Exception {
		//1.根据配置文件路径，读取配置文件（InputStream流）
		String resource = "SqlMapConfig.xml";
		InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream(resource);
		
		XmlConfigBuilder xmlConfigBuilder = new XmlConfigBuilder(inputStream);
		Configuration configuration=xmlConfigBuilder.parse();
		System.out.println(configuration);
	}

	/*@Test
	public void test1() throws Exception {
		// 指定全局配置文件的类路径
		String resource = "SqlMapConfig.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);

		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

		SqlSession sqlSession = sqlSessionFactory.openSqlSession();

		User user = sqlSession.selectOne("findUserById", 1);

		System.out.println(user);
	}*/
}
