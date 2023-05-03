package com.loanmanagment.webapp.pdfgenerator;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfWriter;
import com.loanmanagment.webapp.entities.LoanDetails;

public class LoanApplicationPdf {
	public static void createPdf(LoanDetails loan) throws DocumentException, MalformedURLException, IOException {
		Document doc=new Document();
		PdfWriter.getInstance(doc,new FileOutputStream("D:/LoanManagement/webapp/src/main/resources/LoanPdf/"+loan.getFirstname()+"_"+loan.getLastname()+"_Loan_Application.pdf"));
		doc.open();
		Font f=FontFactory.getFont(FontFactory.COURIER,18,BaseColor.BLACK);
		Chunk c1=new Chunk("Loan Application\n",f);
		doc.add(c1);
		Image img=Image.getInstance("/LoanManagement/webapp/src/main/resources/"+loan.getImage());
		Chunk ic1=new Chunk(img,0,0);
		Chunk c2=new Chunk("First Name: "+loan.getFirstname()+"\nMiddle Name: "+loan.getMiddlename()+"\nLast Name: "+loan.getLastname(),f);
		Phrase ph1=new Phrase();
		ph1.add(ic1);
		ph1.add(c2);
		doc.add(ph1);
		doc.close();
	}
	public static void main(String[] args) throws DocumentException, MalformedURLException, IOException {
		Document doc=new Document();
		PdfWriter.getInstance(doc,new FileOutputStream("D:/LoanManagement/webapp/src/main/resources/LoanPdf/_Loan_Application.pdf"));
		doc.open();
		Font f=FontFactory.getFont(FontFactory.COURIER,18,BaseColor.BLACK);
		Chunk c1=new Chunk("Loan Application\n",f);
		doc.add(c1);
		Image img=Image.getInstance("D:/LoanManagement/webapp/src/main/resources/LoanFiles/LOCATE.png");
		Chunk ic1=new Chunk(img,10,0);
		Chunk c2=new Chunk("First Name: "+"\nMiddle Name: "+"\nLast Name: ",f);
		Phrase ph1=new Phrase();
		ph1.add(ic1);
		ph1.add(c2);
		doc.add(ph1);
		doc.close();
	}
}
