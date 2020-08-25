package com.appdynamic.adapterImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONObject;

import com.appdynamics.adapter.AdapterType;

public class JSONAdapter implements AdapterType {

	

	@Override
	public void JsonToString(BufferedReader br) throws IOException{
		
		String line = "";
		StringBuffer sb = new StringBuffer();
		List<String> jsonItems = new ArrayList<String>();
		
		while((line=br.readLine())!=null) {
			if(line.equalsIgnoreCase("[") || line.equalsIgnoreCase("]") || line.equalsIgnoreCase("{") || line.equalsIgnoreCase("}")) {
				
			}
			else {
				sb.append(line);
				System.out.println(line);
				line.replace("{", "");
				line.replace("}", "");

				jsonItems.add(line);
			}
		}
		//System.out.println(jsonItems.get(0));
		System.out.println(sb.toString());
		
	/*	String jsonString = sb.toString();
		jsonString.replace("[", "");
		jsonString.replace("]", "");
	
		System.out.println(jsonString);
		

		String [] itemList = jsonString.split(",");
		
		for(String str:itemList) {
			
			String [] strList = str.split(":");
			System.out.println(strList[0]+" "+strList[1]);
		}
		*/
		/*JSONObject jo = new JSONObject(sb.toString());
		System.out.println(jo.getString("name"));*/
	}

	@Override
	public void XmlToString(BufferedReader br) throws IOException{
		// TODO Auto-generated method stub
		
	}

}
