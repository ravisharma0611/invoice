package com.invoice.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.apache.struts2.ServletActionContext;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;

@SuppressWarnings("serial")
public class FileDownloadAction extends BaseServiceAction{

	private FileInputStream fileInputStream;
	private String fileName;
	//private int invoiceNo;
	public String fileDownloadMethod(){
		try {
		    
		    String jasperPath = ServletActionContext.getServletContext().getRealPath("reports");
		    String rpt = "fireservices_tax_invoice";
		    String pdfName = "Sample File";
		    //JasperReport reporte = (JasperReport) JRLoader.loadObject(getServletContext().getRealPath("/reports/fireservices_tax_invoice_updated07072013.jasper"));
		    
		    JasperCompileManager.compileReportToFile(ServletActionContext.getServletContext().getRealPath("reports/" + rpt + ".jrxml"),
		    		ServletActionContext.getServletContext().getRealPath("reports/" + rpt + ".jasper"));
		    
		    //JasperReport reporte = (JasperReport) JRLoader.loadObject(new File(jasperPath + "/" + rpt));
		    
		    File reportFile = new File( request.getSession().getServletContext().getRealPath("reports/" + rpt + ".jasper"));
		    
		    JasperReport reporte = (JasperReport) JRLoader.loadObjectFromFile(reportFile.getPath());
		    
		    //JasperReport reporte = JasperCompileManager.compileReport(jasperPath + "/" + rpt);
			HashMap<String, Object> parameters = new HashMap<String, Object>();
			if(request.getParameter("invoiceNo")!=null && !request.getParameter("invoiceNo").isEmpty()){
				Integer invoiceNo = Integer.parseInt(request.getParameter("invoiceNo"));
				parameters.put("invoice_param", invoiceNo);
				fileName = "Invoice_"+String.valueOf(invoiceNo)+".pdf";
				pdfName = "Invoice_"+String.valueOf(invoiceNo);
			}
			
			JasperPrint jasperPrint = JasperFillManager.fillReport(reporte, parameters, getConnection());
			JasperExportManager.exportReportToPdfFile(jasperPrint, jasperPath + pdfName + ".pdf");
			System.out.println("pdf created");
			
			fileInputStream = new FileInputStream(new File(jasperPath + pdfName + ".pdf"));
			
			return SUCCESS;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return INPUT;
		} catch (JRException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
	private DataSource dataSource;
	
	public Connection getConnection(){
		Connection connection = null;
		try {
			String jndiPathForJasper = getText("jndiPathForJasper");
			InitialContext initialContext = new InitialContext();
			dataSource = (DataSource) initialContext.lookup(jndiPathForJasper);
			connection = dataSource.getConnection();
			System.out.println("DB connection Success...");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
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

	/*public int getInvoiceNo() {
		return invoiceNo;
	}

	public void setInvoiceNo(int invoiceNo) {
		this.invoiceNo = invoiceNo;
	}*/
	
}
