package oop.controller;

import java.util.Map;

import javax.naming.Binding;

import oop.model.Condiments;
import oop.service.CondimentsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class CondimentsController {
	
	@Autowired
	private CondimentsService conService;

	@RequestMapping("/indexXYZ")
	public String setupForm(Map<String, Object> map) {
		Condiments conn = new Condiments();
		map.put("conn", conn);
		map.put("conlist", conService.getAllCondiments());
//		con=conService.getCondiments(1);
//		System.out.println(con.getName()+con.getPrice());
		return "condiments";
	}

	@RequestMapping(value = "/con.do", method = RequestMethod.POST)
	public String doActions(@ModelAttribute Condiments conn,
			BindingResult result, @RequestParam String action, Map<String, Object> map) {
		Condiments ConResult = new Condiments();
		switch (action.toLowerCase()) {
		case "add":
			conService.add(conn);
			ConResult=conn;
			break;
		case "edit":
			conService.edit(conn);
			ConResult=conn;
			break;
		case "delete":
			conService.delete(conn.getId());
			ConResult=conn;
			break;

		case "search":
			Condiments searchcon=conService.getCondiments(conn.getId());
			ConResult=searchcon!=null ? searchcon :new Condiments();
			break;
		}
		map.put("conn",ConResult);
		map.put("conlist", conService.getAllCondiments());
		return "condiments";
	}
}
