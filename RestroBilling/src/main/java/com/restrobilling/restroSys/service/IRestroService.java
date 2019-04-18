package com.restrobilling.restroSys.service;


import java.util.List;

import org.springframework.validation.BindingResult;

import com.restrobilling.restroSys.bean.Menu;


public interface IRestroService {


	public String newRecord(Menu m, BindingResult result);
	public Menu deleteRecord(int foodId);
	public List<Menu> fetchAll();
	public void updateFood(Menu m);

}
