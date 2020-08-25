package com.appdynamic.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URISyntaxException;
import java.util.Base64;

import com.appdynamic.adapterImpl.JSONAdapter;
import com.appdynamic.adapterImpl.XMLAdapter;
import com.appdynamics.adapter.AdapterRun;
import com.appdynamics.adapter.AdapterType;

public class APIService{

	private static final String USER_NAME = "marilyn202008210451392@marilyn202008210451392";
	
	private static final String PASSWORD = "e6oq55cnk38u";
	
	private static final String URL = "https://marilyn202008210451392.saas.appdynamics.com";
	
	public static String app_name = "";
	
	//URL to access all the Business Applications
	public String applications_url = "/controller/rest/applications";
	
	// Retrieve All Business Transactions in a Business Application
	public String application_businesst_url = "/controller/rest/applications/"+app_name+"/business-transactions";

	// Retrieve All Tiers in a Business Application
	public String application_tiers_url = "/controller/rest/applications/"+app_name+"/tiers";

	//Retrieve All Registered Backends in a Business Application With Their Properties
	public String application_backend_url = "/controller/rest/applications/"+app_name+"/backends";

	//Retrieve Node Information for All Nodes in a Business Application
	public String application_nodes_url = "/controller/rest/applications/"+app_name+"/nodes";


	private static String sb = URL;
	
	
	
	public static void getControllerData() {
		
			}


	public void getData(String type,String path) {
		
		
		String xml = "XML";
		String json = "JSON";
		
		
		
		try {
			
			if(xml.equalsIgnoreCase(type)==true) {
				
				path = "/controller/rest/applications?output";
				
				sb = URL + path;
				URL obj = new URL(sb.toString());
	            String encoding = Base64.getEncoder().encodeToString((USER_NAME+":"+PASSWORD).getBytes("UTF-8"));
	            HttpURLConnection connection = (HttpURLConnection) obj.openConnection();
	            connection.setRequestMethod("GET");
	            connection.setDoOutput(true);
	            connection.setRequestProperty  ("Authorization", "Basic " + encoding);
	            InputStream content = (InputStream)connection.getInputStream();
	            BufferedReader in   =  new BufferedReader (new InputStreamReader (content));
	          

	            String line;
	            while ((line = in.readLine()) != null) {
	                System.out.println(line);
	            }
	               
			}
			else if(json.equalsIgnoreCase(type)==true) {
				path = path + "?output=JSON";
				
				sb = URL + path;
				URL obj = new URL(sb.toString());
	            String encoding = Base64.getEncoder().encodeToString((USER_NAME+":"+PASSWORD).getBytes("UTF-8"));
	            HttpURLConnection connection = (HttpURLConnection) obj.openConnection();
	            connection.setRequestMethod("GET");
	            connection.setRequestProperty("Accept", "application/json");
	           
	            connection.setRequestProperty  ("Authorization", "Basic " + encoding);

	            if (connection.getResponseCode() != 200) {
	    			System.out.println("Connection error : "+connection.getResponseCode());
	    		}
	            InputStream content = (InputStream)connection.getInputStream();
	            BufferedReader in   =  new BufferedReader (new InputStreamReader (content));
				
	            String line;
	            while ((line = in.readLine()) != null) {
	                System.out.println(line);
	            }
	               
				
			}
			
			
           
		} catch (IOException e) {
			
			System.out.println(e.getMessage());	
		}

	}
	
}
