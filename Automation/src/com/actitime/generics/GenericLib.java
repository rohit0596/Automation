package com.actitime.generics;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class GenericLib {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileLib f = new FileLib();
		System.out.println(f.getPropertyValue("url"));
		System.out.println(f.getPropertyValue("userName"));
		System.out.println("password");
		f.setExcelData("createCustomer", 2, 3, "Pass");
		System.out.println(f.getExcelValue("createCustomer", 2, 3));
	}

}
