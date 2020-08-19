package com.vidvaan.network;

public class NetworkTest {

	public static void main(String[] args) {


//		 source code changes are made every time
//	     every new keyword
//		Network idea = new IdeaNetwork();
//		idea.calls();

		// container
		VidvaanContainer container = new VidvaanContainer();
		
		
		Network network = (Network) container.getNetwork("network");
		network.calls();
		network.data();
		network.sms();

	}

}
