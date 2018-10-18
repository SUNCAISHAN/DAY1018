package com.iss.demo;

import java.io.File;
import java.io.FileOutputStream;

public class Main2 {

	public static void main(String[] args) {
	File file= new File("D:\\","a.txt");
	try {
		FileOutputStream out= new FileOutputStream(file);
		byte buy[]="helloworld".getBytes();
		out.write(buy);
		out.close();
	}catch (Exception e) {
		e.printStackTrace();
	}
	}

}
