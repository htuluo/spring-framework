package com.llm.framework.entity;

import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: luolm
 * @createTime： 2020/7/25
 * @version: v1.0.0
 * @history: (版本) 作者 时间 注释
 */
//@Component
public class Animal {
	private String name;

	public Animal() {
		System.out.println("【Animal】is inited");
	}
}
