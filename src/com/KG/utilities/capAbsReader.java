package com.KG.utilities;

import java.io.BufferedReader;
import java.io.FileReader;

import org.openqa.selenium.remote.DesiredCapabilities;

public class capAbsReader {

	public capAbsReader(){	
	}
	
	public DesiredCapabilities getCapabilities(){
		DesiredCapabilities capAbs = new DesiredCapabilities();
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(System.getProperty("user.dir")+"\\capabilities&files\\android.txt"));
			String line = reader.readLine();
			while(line != null){
			   System.out.println(line);
			   String[] cap = line.split("=");
			   capAbs.setCapability(cap[0], cap[1]);
			   line = reader.readLine();
			}
			reader.close();
		} catch (Exception e) {
                e.printStackTrace();
		}
		return capAbs;
			}
	public static void main(String[] args) {
	capAbsReader cap = new capAbsReader();
	cap.getCapabilities();
	}
}
