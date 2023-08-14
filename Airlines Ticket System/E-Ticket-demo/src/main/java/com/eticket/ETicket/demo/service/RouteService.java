package com.eticket.ETicket.demo.service;

import java.util.List;

import com.eticket.ETicket.demo.dto.CreateRouteRequest;
import com.eticket.ETicket.demo.dto.SearchRouteRequest;
import com.eticket.ETicket.demo.model.Routes;

public interface RouteService {
	
	void addRoute(CreateRouteRequest createRouteRequest);
	List<Routes> searchRoute(SearchRouteRequest searchRouteRequest);

}
