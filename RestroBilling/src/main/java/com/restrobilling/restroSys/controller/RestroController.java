package com.restrobilling.restroSys.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.restrobilling.restroSys.bean.Credentials;
import com.restrobilling.restroSys.bean.Menu;
import com.restrobilling.restroSys.service.IRestroService;

@Controller
public class RestroController {

	@Autowired
	IRestroService resImp;

	@RequestMapping(method = RequestMethod.GET, path = "/")
	public String say1() {
		System.out.println("say t1()");
		return "index";
	}

	@RequestMapping(method = RequestMethod.GET, path = "/adminLogin")
	public String adminLogin(@ModelAttribute("admin") Credentials admin) {
		System.out.println("say t2()");
		return "adminLogin";
	}

	@RequestMapping(path = "/adminVerification", method = RequestMethod.POST)
	private ModelAndView adminLogin1(@ModelAttribute("admin") Credentials admin) {

		ModelAndView mv = new ModelAndView();

		mv.setViewName("adminLogin");

		System.out.println("after login set");

		if (admin.getUserName().equals("abc")) {
			if (admin.getPassword().equals("abc")) {
				System.out.println("in adminLogin methd");
				mv.setViewName("adminIndex");
				return mv;

			}
		}
		return mv;
	}

	@RequestMapping(method = RequestMethod.GET, path = "/addFood")
	public String addFood(@ModelAttribute("f") Menu f) {
		return "addFood";
	}

	@RequestMapping(path = "/added", method = RequestMethod.POST)
	public ModelAndView addFood1(@ModelAttribute("f") @Valid Menu f, BindingResult result) {

		ModelAndView mv = new ModelAndView();
		mv.setViewName("addFood");
		String name = resImp.newRecord(f, result);
		if (result.hasErrors())
			return mv;
		mv.setViewName("added");
		mv.addObject("key", f.getFoodId());
		return mv;
	}

	@RequestMapping(method = RequestMethod.GET, path = "/updateFood")
	public String updateFood(@ModelAttribute("m") Menu m) {
		return "updateFood";
	}

	@RequestMapping(method = RequestMethod.GET, path = "/deleteFood")
	public String deleteFood(@ModelAttribute("m") Menu m) {
		return "deleteFood";
	}

	@RequestMapping(path = "/deleted", method = RequestMethod.POST)
	public ModelAndView deleteFood1(@ModelAttribute("m") Menu m) {

		ModelAndView mv = new ModelAndView();
		mv.setViewName("deleteFood");
		Menu m1 = resImp.deleteRecord(m.getFoodId());

		mv.setViewName("deleted");/*
								 * System.out.println(m1.getFoodId()); mv.addObject("key", m1.getFoodName());
								 * mv.addObject("key1", m1.getFoodId()); mv.addObject("key2", m1.getCategory());
								 * mv.addObject("key3", m1.getUnitPrice());
								 */

		return mv;
	}

	/*
	 * @RequestMapping(path = "/updated", method = RequestMethod.POST) public
	 * ModelAndView updateFood1(@ModelAttribute("m") Menu m) { //
	 * System.out.println("in deleteEmpController"+t.getI());
	 * 
	 * ModelAndView mv = new ModelAndView(); mv.setViewName("updateFood");
	 * resImp.updateFood(m.getFoodId()); System.out.println(m1.getFoodId());
	 * mv.addObject("key", m1.getFoodName()); mv.addObject("key1", m1.getFoodId());
	 * mv.addObject("key2", m1.getCategory()); mv.addObject("key3",
	 * m1.getUnitPrice());
	 * 
	 * return mv; }
	 */

	@RequestMapping(method = RequestMethod.GET, path = "/readAll")
	public ModelAndView retrieveAll(@ModelAttribute("m") Menu m, Model model) {

		ModelAndView mv = new ModelAndView();
		List<Menu> list = resImp.fetchAll();
		model.addAttribute("Menu", m);
		mv.addObject("tlist", list);
//		mv.addObject("m", new Menu());
		mv.setViewName("menuInfo");
		return mv;
	}

	@RequestMapping(method = RequestMethod.GET, path = "/userLogin")
	public String userLogin(@ModelAttribute("user") Credentials user) {
		System.out.println("say t2()");
		return "userLogin";
	}

	@RequestMapping(path = "/userVerification", method = RequestMethod.POST)
	private ModelAndView userLogin1(@ModelAttribute("user") Credentials user) {

		ModelAndView mv = new ModelAndView();

		mv.setViewName("userLogin");

		System.out.println("after login set");

		if (user.getUserName().equals("abc")) {
			if (user.getPassword().equals("abc")) {
				System.out.println("in userLogin methd");
				mv.setViewName("userIndex");
				return mv;

			}
		}
		return mv;
	}

	@RequestMapping(method = RequestMethod.GET, path = "/placeOrder")
	public ModelAndView retrieveAllMenu(@ModelAttribute("m") Menu m, Model model) {

		ModelAndView mv = new ModelAndView();
		List<Menu> list = resImp.fetchAll();
		model.addAttribute("Menu", m);
		mv.addObject("tlist", list);
//		mv.addObject("m", new Menu());
		mv.setViewName("menuInfo");
		return mv;
	}

	/*
	 * @RequestMapping (path="/index",method= RequestMethod.POST) private
	 * ModelAndView login(@ModelAttribute("m")Menu m) {
	 * 
	 * ModelAndView mv= new ModelAndView();
	 * 
	 * //mv.setViewName("login");
	 * 
	 * System.out.println("after login set");
	 * 
	 * mv.setViewName("create"); return mv; }
	 */

	@RequestMapping(path = "/index2", method = RequestMethod.GET)
	public String createData(@ModelAttribute("m") Menu m) {
		return "create";
	}

	// @RequestMapping(path="/create",method=RequestMethod.GET)

}
