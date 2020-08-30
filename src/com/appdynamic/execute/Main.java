package com.appdynamic.execute;

import com.appdynamic.service.APIService;

public class Main {

	public static void main(String [] args) {
		
		/*String jsonString = "{\"name\":\"aaa\",\"agx\":\"aaa\"}";
		System.out.println(jsonString);*/
		APIService.app_name = "5916";
		APIService api = new APIService();
		
		System.out.println("Application details");
		api.getData("JSON", api.applications_url);
		System.out.println("*******************************************************************************");
		System.out.println("Application business transactions");
		api.getData("JSON", api.application_businesst_url);
		System.out.println("*******************************************************************************");
		System.out.println("Application tiers");
		api.getData("JSON", api.application_tiers_url);
		System.out.println("*******************************************************************************");
		System.out.println("Application backend");
		api.getData("JSON", api.application_backend_url);


	}
}
