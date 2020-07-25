package com.llm.framework.entity;

import org.springframework.beans.factory.annotation.Value;

/**
 * @description:
 * @author: luolm
 * @createTime： 2020/7/25
 * @version: v1.0.0
 * @history: (版本) 作者 时间 注释
 */

public class User {
	@Value("userName")
	private String userName;

	public User() {
		System.out.println("【User】初始化");
	}
}
