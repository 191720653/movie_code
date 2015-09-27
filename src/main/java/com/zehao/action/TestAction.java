package com.zehao.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.springframework.beans.factory.annotation.Autowired;

import com.zehao.model.Actor;
import com.zehao.service.IActorService;

/**
 * 测试Action类
 * @author zehao
 *
 */

@ParentPackage("basePackage")
@Action(value = "test")
@Namespace("/")

public class TestAction {
	
	@Autowired
	private IActorService iActorService;

	public void execute() {
		
		int size = iActorService.getAll(Actor.class.getName()).size();
		
		System.out.println("hibernate test, size is " + size);
		System.out.println("Come here for struts2 test!");
	}
	
}