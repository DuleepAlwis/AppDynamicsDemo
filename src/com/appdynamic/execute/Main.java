package com.appdynamic.execute;

import com.appdynamic.service.APIService;

public class Main {

	public static void main(String [] args) {
		
		/*String jsonString = "{\"name\":\"aaa\",\"agx\":\"aaa\"}";
		System.out.println(jsonString);*/
		APIService.app_name = "5916";
		APIService api = new APIService();
		System.out.println(APIService.app_name);
		api.getData("JSON", api.applications_url);
		api.getData("JSON", api.application_businesst_url);
	}
}
