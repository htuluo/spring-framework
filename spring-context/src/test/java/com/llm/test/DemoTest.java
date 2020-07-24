package com.llm.test;

import com.llm.framework.Person;
import com.llm.framework.config.Appconfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @description:
 * @author: luolm
 * @createTime： 2020/7/24
 * @version: v1.0.0
 * @history: (版本) 作者 时间 注释
 */
public class DemoTest {
	@Test
	public void testSpring(){
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Appconfig.class);
		Person person = context.getBean(Person.class);
		person.setName("aaa");
		context.registerShutdownHook();

	}
}
