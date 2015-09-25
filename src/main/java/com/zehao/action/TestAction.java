package com.zehao.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;

/**
 * 测试Action类
 * @author zehao
 *
 */

@ParentPackage("basePackage")
@Action(value = "test")
@Namespace("/")

public class TestAction {

	public void execute() {
		System.out.println("Come here for struts2 test!");
	}
	
}