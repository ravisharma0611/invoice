package com.invoice.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class FileDownloadAction extends BaseServiceAction{

	private FileInputStream fileInputStream;
	private String fileName;
	
	public String fileDownloadMethod(){
		try {
			String downloadPath = getText("fileDownloadPath");
			File fileDownload = new File("E:\\eCertificate.pdf");
			fileInputStream = new FileInputStream(fileDownload);
			fileName = fileDownload.getName();
			System.out.println("fileName : "+fileName);
			return SUCCESS;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return INPUT;
		}
		
	}
	
	
	public FileInputStream getFileInputStream() {
		return fileInputStream;
	}


	public void setFileInputStream(FileInputStream fileInputStream) {
		this.fileInputStream = fileInputStream;
	}


	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
}
