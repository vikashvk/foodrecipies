package com.restrobilling.restroSys.dao;


import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.restrobilling.restroSys.bean.Menu;


public interface IRestroDao {

	@Transactional
	public void save(Menu m);
	@Transactional
	public Menu read(int foodId);
	@Transactional
	public Menu delete(int foodId);
	@Transactional
	public List<Menu> findAll();
	@Transactional
	public void update(Menu m);

}
