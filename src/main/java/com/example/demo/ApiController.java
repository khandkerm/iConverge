package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class ApiController {
	@Autowired
	ICONVDaoRafi iconvDao;
	
	@GetMapping("/circle/{id}")
	public List<IC_CIRCLE_MST_R> getCircle(@PathVariable("id") String id) {
		
		ArrayList<IC_CIRCLE_MST_R> circleList = new ArrayList<>();
		circleList = iconvDao.getCircleList(MainControllerIC.officeCode, id);
		
		
		return circleList;
		
		
	}

	@GetMapping("/div/{id}")
	public List<IC_DIST_DIV_MST> getDiv(@PathVariable("id") String id) {
		
		ArrayList<IC_DIST_DIV_MST> divList = new ArrayList<>();
		divList = iconvDao.getdivList(MainControllerIC.officeCode, id);
		
		
		return divList;
		
		
	}
	
	@GetMapping("/loc/{id}/{div}")
	public List<IC_LOCATION_MASTER> getDiv(@PathVariable("id") String id,@PathVariable("div") String div) {
		
		ArrayList<IC_LOCATION_MASTER> locList = new ArrayList<>();
		locList = iconvDao.getlocList(MainControllerIC.officeCode, id,div);
		
		
		return locList;
		
		
	}
	
	
}
