package com.vidvaan.network;

import java.io.IOException;
import java.util.Properties;

public class VidvaanContainer {

	public Object getNetwork(String name) {
		Properties properties = new Properties();
		try {
			properties.load(VidvaanContainer.class.getClassLoader().getResourceAsStream("network.properties"));
			return Class.forName(properties.getProperty(name)).newInstance();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return null;
	}

}
