package com.appdynamics.adapter;

import java.io.BufferedReader;
import java.io.IOException;

public interface AdapterType {

	public void JsonToString(BufferedReader br) throws IOException;
	
	public void XmlToString(BufferedReader br) throws IOException;
}
