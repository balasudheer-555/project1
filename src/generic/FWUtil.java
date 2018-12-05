package generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class FWUtil {
	public static String getXLData(String path,String sheet,int r,int c){
		String v = "";
		try {
		Workbook wb = WorkbookFactory.create(new FileInputStream(path));
		v= wb.getSheet(sheet).getRow(r).getCell(c).toString();
	}
		catch(Exception e) {
			e.printStackTrace();
		}
		return v;
	}
	public static int getXLRowCount(String path,String sheet) {
		int count = 0;
		try {
			Workbook wb = WorkbookFactory.create(new FileInputStream(path));
			count = wb.getSheet(sheet).getLastRowNum();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return count;
	}
	public static void setXLData(String path,String sheet,int r,int c,int v) {
		try {
			Workbook wb = WorkbookFactory.create(new FileInputStream(path));
			wb.getSheet(sheet).getRow(r).getCell(c).setCellValue(v);
			wb.write(new FileOutputStream(path));
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void getphoto(WebDriver driver,String path) {
		try {
			TakesScreenshot t = (TakesScreenshot)driver;
			File srcFile = t.getScreenshotAs(OutputType.FILE);
			File destFile = new File(path);
			FileUtils.copyFile(srcFile, destFile);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	}







