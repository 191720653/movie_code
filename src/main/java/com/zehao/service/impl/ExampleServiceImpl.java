package com.zehao.service.impl;

import com.zehao.dao.IExampleDao;
import com.zehao.model.Example;
import com.zehao.service.IBaseService;

public class ExampleServiceImpl extends BaseServiceImpl<Example> implements IBaseService<Example> {
	
	private IExampleDao iExampleDao;

	public void setUserDao(IExampleDao iExampleDao) {
		this.iExampleDao = iExampleDao;
		super.setDao(iExampleDao);
	}
	
}
