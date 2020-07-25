package com.llm.framework.entity;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.ejb.Init;

/**
 * @description:
 * @author: luolm
 * @createTime： 2020/7/24
 * @version: v1.0.0
 * @history: (版本) 作者 时间 注释
 */
@Component
public class Person implements BeanNameAware, BeanFactoryAware, BeanFactoryPostProcessor,InitializingBean, DisposableBean {

	public Person() {
		System.out.println("【Person】 inited");
//		setName("bbb");
	}

//	@Bean(initMethod = "myinit")
//	Person getPerson(){
//		System.out.println("【@bean】调用");
//		return new Person();
//	}

	public void myinit() {
		System.out.println("【myinit】初始化");
	}

	@Value("kkk")
	private String name;

	private BeanFactory beanFactory;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("正在设置属性name");
		this.name = name;
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("【BeanNameAware】setBeanName is called,name=" + name);


	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("【BeanFactoryPostProcessor】postProcessBeanFactory for person is Called");

	}

//	@Override
//	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
//		System.out.println("【BeanPostProcessor】postProcessBeforeInitialization is Called");
//		return null;
//	}
//
//	@Override
//	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
//		System.out.println("【BeanPostProcessor】postProcessAfterInitialization is Called");
//		return null;
//	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		this.beanFactory = beanFactory;
		System.out.println("【BeanFactoryAware】setBeanFactory is called");

	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("【InitializingBean】afterPropertiesSet is called");

	}

	@Override
	public void destroy() throws Exception {
		System.out.println("【DisposableBean】destroy is called");
	}
}
