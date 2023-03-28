package org.base;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	public static WebDriver driver;
	
	public static void launchBrowser() {

		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
	}
	
	public static void Windowmaximize() {
	   
		driver.manage().window().maximize();
	}
	public static void launchUrl(String Url) {
		driver.get(Url);

	}
	public static String pageTitle() {
		String title = driver.getTitle();
		
		System.out.println(title);
		return title;
		
	}
	public static String pageUrl() {
	
		String url = driver.getCurrentUrl();
		System.out.println(url);
		return url;
	}
    public static void passtext(String txt,WebElement ele) {
		
    	ele.sendKeys(txt);
	}
	public static void closeEntireBrowser() {
		driver.quit();
	}
	public static void clickBtn(WebElement ele) {
		ele.click();
	}
	public static void screenshot(String imgName) throws IOException {
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File image=ts.getScreenshotAs(OutputType.FILE);
		File f=new File("imgName");
		FileUtils.copyFile(image, f);
	}
    public static	Actions a;

    public static void moveTheCursor(WebElement targetWebElement) {
    	
    a=new Actions(driver);
    a.moveToElement(targetWebElement).perform();
    
     }
    public static void dragDrop(WebElement dragWebElement,WebElement dropElement) {
    	 a=new Actions(driver);
         a.dragAndDrop(dragWebElement,dropElement).perform();
    	   
         
	} 
    public static JavascriptExecutor js;
    
    public static void scrollThePage(WebElement tarWebEle) {
	 js=(JavascriptExecutor)driver;
	 js.executeScript("arguments[0].scrollIntoView(true)", tarWebEle);
    	
    	
	}
        
    
    public static void excelRead(String sheetName,int rowNum,int cellNum) throws IOException {
		File f=new File("C:\\\\Users\\\\ramar\\\\eclipse-workspace\\\\MavenInstalation\\\\excel\\\\new.xls");
		FileInputStream fis=new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fis); 
		Sheet mysheet = wb.getSheet("");
        Row r=mysheet.getRow(rowNum);
        Cell c = r.getCell(cellNum);
        int cellType = c.getCellType();
        
        String value="";
        if (cellType==1) {
         String Value2 = c.getStringCellValue();
			
		}
        else if (DateUtil.isCellDateFormatted(c)) {
        	Date dd = c.getDateCellValue();
			SimpleDateFormat s=new SimpleDateFormat(value);
			String value1 = s.format(dd);
			
		}
        else {
			double d= c.getNumericCellValue();
			long l=(long)d;
			String valueOf = String.valueOf(l);
        
        }
    
    
    }    
    public static void createNewExcelFile(int rowNum,int cellNum,String writeData) throws IOException {
    	
    	File f=new File("C:\\Users\\ramar\\eclipse-workspace\\MavenInstalation\\excel\\\\new.xls");
    	FileInputStream fis=new FileInputStream(f);
    	Workbook w=new XSSFWorkbook();
    	Sheet newSheet=w.createSheet("Datas");
        Row newRow = newSheet.createRow(rowNum);
	    Cell newCell = newRow.createCell(cellNum);
	    newCell.setCellValue(writeData);
	    FileOutputStream fos=new FileOutputStream(f);
	    w.write(fos); 
    
    
    }
 public static void createcell(int getrow,int crecell,String newData) throws IOException {
    	
    	File f=new File("C:\\\\Users\\\\ramar\\\\eclipse-workspace\\\\MavenInstalation\\\\excel\\\\new.xls");
    	FileInputStream fis=new FileInputStream(f);
    	Workbook wb=new XSSFWorkbook(fis);
    	Sheet s=wb.createSheet("Datas");
        Row r = s.createRow(getrow);
	    Cell c = r.createCell(crecell);
	    c.setCellValue(newData);
	    FileOutputStream fos=new FileOutputStream(f);
	    wb.write(fos); 
    
    
    }
 public static void createRow(int crerow,int crecell,String newData) throws IOException {
 	
		File f = new File("C:\\\\Users\\\\ramar\\\\eclipse-workspace\\\\MavenInstalation\\\\excel\\\\new.xls");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.createSheet("Datas");
		Row r = s.createRow(crerow);
		Cell c = r.createCell(crecell);
		c.setCellValue(newData);
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
 
 }
 
 public static void upateataToparticularCell(int getTheRow,int getTheCell,String exsitingData,String writeNewData) throws IOException {
	 	
		File f = new File("C:\\\\Users\\\\ramar\\\\eclipse-workspace\\\\MavenInstalation\\\\excel\\\\new.xls");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.createSheet("Datas");
		Row r = s.createRow(getTheRow);
		Cell c = r.createCell(getTheCell);
		String str = c.getStringCellValue();
		if (str.equals(exsitingData)) {
			c.setCellValue(writeNewData);
			
		}
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
    
}
}