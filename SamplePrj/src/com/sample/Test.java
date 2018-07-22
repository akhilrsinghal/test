package com.sample;

import net.sourceforge.tess4j.*;
import java.io.*;

import com.aspose.ocr.ImageStream;
import com.aspose.ocr.OcrEngine;



public class Test {

	public String getImgText(String imageLocation) {
	      ITesseract instance = new Tesseract();
	      try 
	      {
	         String imgText = instance.doOCR(new File(imageLocation));
	         return imgText;
	      } 
	      catch (TesseractException e) 
	      {
	         e.getMessage();
	         return "Error while reading image";
	      }
	   }
	
	public static void main(String[] args) {
		Test t = new Test();
		String fileName = "E:\\freelancer\\1\\original\\DATAFILE1.jpg";
		//System.out.println(t.getImgText(fileName));
		
		String imagePath = "E:\\freelancer\\1\\original\\DATAFILE1.jpg";
		//String imagePath = "G:\\craft\\cards design\\card design downloaded\\sample.jpeg";
        OcrEngine ocrEngine = new OcrEngine();
      //Set the Image property by loading the image from file path location
      ocrEngine.setImage(ImageStream.fromFile(imagePath));
        try {
            //Process the image
            if (ocrEngine.process())
            {
                //Display the recognized text
                System.out.println(ocrEngine.getText());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
		
	}

}
