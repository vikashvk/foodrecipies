package com.restrobilling.restroSys.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.restrobilling.restroSys.bean.Menu;

public class RestroDaoImpl implements IRestroDao {

	@PersistenceContext
	EntityManager em;

	@Override
	public void save(Menu m) {
		em.persist(m);
	}

	@Override
	public Menu read(int foodId) {
		Menu m = em.find(Menu.class, foodId);
		return m;
	}

	@Override
	public Menu delete(int foodId) {
		System.out.println("In deleteDao");
		Menu m = em.find(Menu.class, foodId);
		System.out.println(m);
		em.remove(m);
		return m;
	}

	@Override
	public List<Menu> findAll() {
		List<Menu> foodList = em.createQuery("SELECT m FROM Menu m").getResultList();
		if (foodList == null) {
//			System.out.println("No dishes in Menu..");
		}

		return foodList;

	}

	@Override
	public void update(Menu m) {
		Menu m1 = em.find(Menu.class, m.getFoodId());
		m1.setFoodName(m.getFoodName());
		m1.setUnitPrice(m.getUnitPrice());
		m1.setCategory(m.getCategory());
		em.persist(m1);
	}

}
