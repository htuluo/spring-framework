package com.llm.framework.config;

import com.llm.framework.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description:
 * @author: luolm
 * @createTime： 2020/7/25
 * @version: v1.0.0
 * @history: (版本) 作者 时间 注释
 */
//@Configuration
public class MyConfiguration {
	public MyConfiguration() {
		System.out.println("【MyConfiguration】初始化");
	}

	@Bean
	public User getUser() {
		return new User();
	}
}
