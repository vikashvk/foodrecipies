package com.restrobilling.restroSys.service;

import java.util.List;

import org.springframework.validation.BindingResult;

import com.restrobilling.restroSys.bean.Menu;
import com.restrobilling.restroSys.dao.IRestroDao;
import com.restrobilling.restroSys.dao.RestroDaoImpl;

public class RestroServiceImpl implements IRestroService{
	
IRestroDao restroDao;


	public RestroServiceImpl(IRestroDao restroDao) {
	super();
	this.restroDao = restroDao;
}

	
	@Override
	public String newRecord(Menu m, BindingResult result) {
		if(result.hasErrors()) {
			return "ERROR";
		}
		restroDao.save(m);
		return "SUCCESS";
	}


	@Override
	public Menu deleteRecord(int foodId) {
		Menu m= restroDao.delete(foodId);
		return m;
	}


	@Override
	public List<Menu> fetchAll() {
		List<Menu> foodList = restroDao.findAll();
		return foodList;
	}


	@Override
	public void updateFood(Menu m) {
		restroDao.update(m);
	}



	}