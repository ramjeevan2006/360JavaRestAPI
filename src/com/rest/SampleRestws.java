package com.rest;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.CacheControl;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.core.Response.Status;

import org.codehaus.jackson.map.ObjectMapper;

import com.bean.Activity;
import com.bean.Customer;
import com.google.gson.Gson;


@Path("UserInfoService")
public class SampleRestws {

    @Context
    private ServletContext sc;
    
	private Map<Integer, Activity> dataSourceMap;
	List<Activity> activityList = new ArrayList<Activity>();
	
	@GET
	@Path("/data")
	@Produces(MediaType.APPLICATION_JSON)
	public String userName() {
		
		System.out.println("user name method....");
		String[] thisIsAStringArray = {"Show all", "Person", "Organisation", "Policy", "Authorisation","Claim","Incident"};
		Customer cust=new Customer("Aali Hussain", "Male", "06.12.1978 / 38 years","UAE","101-1234567",987-8347-8484-5,"",thisIsAStringArray,true);
		Activity activity = new Activity(1,"Interact wit Contact", "Interact wit Contact(inbound/initial)", "Finance","Person 1","2 Medium"," 03.10.2016","Opened","Activity opened");
		Gson gson = new Gson();
		String jsonInString = gson.toJson(cust);
		System.out.println("get json object : "+jsonInString);
		return jsonInString;
	}
	
	@GET
	@Path("/listData")
	@Produces(MediaType.APPLICATION_JSON)
	public String getListValues(){
		System.out.println("getting dropdown values");
		List<Customer> customers = new ArrayList<Customer>();
		String[] thisIsAStringArray = {"Show all", "Person", "Organisation", "Policy", "Authorisation","Claim","Incident"};
		customers.add(new Customer("Aali Hussain1", "Male", "06.12.1978 / 38 years","UAE","101-1234567",987-8347-8484-5,"",thisIsAStringArray,true));
		customers.add(new Customer("Aali Hussain2", "Male", "06.12.1978 / 38 years","UAE","101-1234567",987-8347-8484-5,"",thisIsAStringArray,true));
		customers.add(new Customer("Aali Hussain3", "Male", "06.12.1978 / 38 years","UAE","101-1234567",987-8347-8484-5,"",thisIsAStringArray,true));
		Gson gson = new Gson();
		String jsonStr=gson.toJson(customers);
		//return "{'List': ['Show all', 'Person', 'Organisation', 'Policy', 'Authorisation','Claim','Incident']}";
		return jsonStr;
	}
	
	@POST
	@Path("/addActivity")
	@Consumes(MediaType.TEXT_PLAIN)
	public Response  getJsonData(String jsonstr) {
		System.out.println("consuming data...");
		System.out.println("GET DATA "+jsonstr);
		String result = jsonstr;
		Activity newActivity;
		try {
			newActivity = new ObjectMapper().readValue(jsonstr, Activity.class);
			System.out.println("get activity object"+newActivity.getId());

			dataSourceMap = (Map<Integer, Activity>)sc.getAttribute("activityDataSource");
			if(newActivity.getId() == null)
				newActivity.setId(dataSourceMap.size()+1);
			else if(newActivity.getId().equals("null"))
				newActivity.setId(dataSourceMap.size()+1);
			dataSourceMap.put(newActivity.getId(),newActivity);
		} catch (Exception e) {
			e.printStackTrace();
		}	
		
		CacheControl cc = new CacheControl();
        cc.setNoCache( true );
        cc.setMaxAge( -1 );
        cc.setMustRevalidate( true );
		Response r =  Response.status(201).entity(result).cacheControl( cc ).build();

	 return r;
	}
	
	@GET
	@Path("/listAcitivity")
	@Produces(MediaType.APPLICATION_JSON)
	public String getActivityList(){
		dataSourceMap = (Map<Integer, Activity>)sc.getAttribute("activityDataSource");
		System.out.println("getting dropdown values");
		Gson gson = new Gson();
		String jsonStr=gson.toJson(dataSourceMap.values());
		return jsonStr;
	}
	
	protected ResponseBuilder getNoCacheResponseBuilder( Status status ) {
        CacheControl cc = new CacheControl();
        cc.setNoCache( true );
        cc.setMaxAge( -1 );
        cc.setMustRevalidate( true );
 
        return Response.status( status ).cacheControl( cc );
    }
	 
}
