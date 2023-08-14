package com.eticket.ETicket.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eticket.ETicket.demo.dto.CreateRouteRequest;
import com.eticket.ETicket.demo.dto.SearchRouteRequest;
import com.eticket.ETicket.demo.model.Routes;
import com.eticket.ETicket.demo.service.RouteService;

@RestController
@RequestMapping("/routes")
public class RoutesController {
	
	private final RouteService routeService;

	public RoutesController(RouteService routeService) {
		
		this.routeService = routeService;
	}
	
	@PostMapping("/addRoute")
	public void addRoute(@RequestBody CreateRouteRequest createRouteRequest) {
		routeService.addRoute(createRouteRequest);
	}
	
	@GetMapping("/getRoutes")
	public List<Routes> searchRoutes(SearchRouteRequest searchRouteRequest){
		return routeService.searchRoute(searchRouteRequest);
		
	}
	

}
