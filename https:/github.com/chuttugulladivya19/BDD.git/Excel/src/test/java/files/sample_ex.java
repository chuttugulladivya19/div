package files;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class sample_ex {
	public static void (String[]args)throws IOException{
		FileInputStream fis=new FileInputStream("/home/labuser/Documents.xlxs");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("Sheet1");
		System.out.println(sheet.getLastRowNum());
		if(sheet.getRow(1)!=null){
			System.out.println(sheet.getRow(1).getCell(0).getStringcellValue());
			System.out.println(sheet.getRow(1).getCell(1).getStringcellValue());
			System.out.println(sheet.getRow(1).getCell(2).getStringcellValue());
       }
	   if(sheet.getRow(5)==null) {
		   sheet.createRow(5);
	   }
	   sheet.getRow(5).createCell(2).setCellValue("Fail");
	   FileOutputStream fout = new FileOutputStream("/home/labuser/Documents.xlxs");
	   wb.write(fout);
	   //close resources
	   fout.close();
	   fis.close();
	   wb.close();
	}

}
