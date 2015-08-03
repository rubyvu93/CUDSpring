package oop.controller;

import java.util.Map;

import oop.model.CoffeeType;
import oop.service.CoffeeTypeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CoffeeTypeController {
	@Autowired
	private CoffeeTypeService coffeeTypeService;
	private CoffeeType CoffResult = new CoffeeType();
	@RequestMapping("/index")
	public String setupForm(Map<String, Object> map) {
		CoffeeType coffeeType = new CoffeeType();
		map.put("coffeeType", coffeeType);
		map.put("coffeelist", coffeeTypeService.getAllCoffee());
		//System.out.println("SIZE:"+map.get("coffeelist").toString());
		//map.put("total", coffeeTypeService.getTotal(coffeeType));
		return "coffeeType";
	}
		
	@RequestMapping("/addcoffee")
    public String addingTeam(@ModelAttribute CoffeeType coffee) {
     
         
        return "addcoffee";
    }

	/*@RequestMapping("/indexA")
	public String setupFormA(Map<String, Object> map) {
		CoffeeType coffeeType = new CoffeeType();
		coffeeTypeService.getTest();
		return "index";
	}*/
	
	@RequestMapping(value = "/coffeetype.do", method = RequestMethod.POST)
	public String doActions(@ModelAttribute CoffeeType coffeeType,
			BindingResult result, @RequestParam String action, Map<String, Object> map) {
		
		switch (action.toLowerCase()) {
		case "add":
			coffeeTypeService.add(coffeeType);
			CoffResult=coffeeType;
			break;
		case "edit":
			coffeeTypeService.edit(coffeeType);
			CoffResult=coffeeType;
			break;
		case "delete":
			coffeeTypeService.delete(coffeeType.getId());
			CoffResult=coffeeType;
			break;

		case "search":
			CoffeeType searchcoffee=coffeeTypeService.getCoffeeType(coffeeType.getId());
			CoffResult=searchcoffee!=null ? searchcoffee :new CoffeeType();
			break;
		}
		map.put("coffeeType",CoffResult);
		map.put("coffeelist", coffeeTypeService.getAllCoffee());
		return "coffeeType";
	}
	
	
	
	
}
