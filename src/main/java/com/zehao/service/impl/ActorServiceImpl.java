package com.zehao.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.zehao.dao.IActorDao;
import com.zehao.model.Actor;
import com.zehao.service.IActorService;

public class ActorServiceImpl extends BaseServiceImpl<Actor> implements
		IActorService {

	@Autowired
	private IActorDao iActorDao;

	public void setIActorDao(IActorDao iActorDao) {
		this.iActorDao = iActorDao;
		super.setDao(iActorDao);
	}

}
