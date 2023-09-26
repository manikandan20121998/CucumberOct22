package org.base;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
	//dependencies......
	
	public static void generateReport(String json) {

		File loc=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports\\JVMReport");
		
		Configuration con=new Configuration(loc, "TriganaAirline");
		con.addClassifications("Platfoem", "Windows");
		con.addClassifications("Browser", "chrome");
		con.addClassifications("WinVersion", "10");
		con.addClassifications("Sprint", "20");
		con.addClassifications("Environment", "QA");
		
		List<String> li=new LinkedList<String>();
		li.add(json);
		
		ReportBuilder rb=new ReportBuilder(li, con);
		rb.generateReports();
	}

}
