package com.roamingtails;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.roamingtails.mapper.AddressMapper;
import com.roamingtails.model.Restaurants;
import com.roamingtails.model.response.RestaurantResponse;
import com.roamingtails.service.IRestaurantService;


@RestController
@RequestMapping("/restaurant")
public class RestaurantsController {
	
	@Autowired
	IRestaurantService rest;
		
	@RequestMapping(method = RequestMethod.GET, path="/findAll")
	  public List<Restaurants> getRestaurantsList(){				 
		return rest.findAll();
	  }
	
	@RequestMapping(method = RequestMethod.GET,value="/getrestDetails/{restId}")
	  public RestaurantResponse getSpecificRestaurantsList(@PathVariable("restId") String restId){				 
		AddressMapper mapper = new AddressMapper();
		Restaurants restret = new Restaurants();
		restret =rest.findOne(restId);
		String address = mapper.constructAddress(restret);
		return (mapper.getLongitudeLatitude(address, restret));
	  }
	
	@RequestMapping(method = RequestMethod.GET, value="/listRestaurants/{zipCode}")
	  public List<RestaurantResponse> getRestDetails(@PathVariable int zipCode){	
		List<RestaurantResponse> loc = new ArrayList<RestaurantResponse>();
		AddressMapper mapper = new AddressMapper();		
		List<Restaurants> restLocated = rest.findByzipCodeIn(zipCode);			
			
			for(int i=0; i < restLocated.size(); i++)
			{
				String address = mapper.constructAddress(restLocated.get(i));
				loc.add(mapper.getLongitudeLatitude(address, restLocated.get(i)));
			}
		
		return loc;
	  }

}
