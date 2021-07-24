import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class AssignmentThree {
    public static void main(String[] args) {
            try{
                File src = new File("D:\\Java Projects\\Assignment24July\\src\\main\\java\\WriteSheet.xlsx");
                FileInputStream fis = new FileInputStream(src);
                XSSFWorkbook wb = new XSSFWorkbook(fis);
                XSSFSheet sh = wb.getSheet("sheet1");
                Row row = sh.createRow(0);
                Cell cell = row.createCell(0);
                cell.setCellValue(cell.getStringCellValue());
                cell.setCellValue("John");
                Cell cell1 = row.createCell(1);
                cell1.setCellValue(cell1.getStringCellValue());
                cell1.setCellValue("peter");
                Cell cell2 = row.createCell(2);
                cell2.setCellValue(cell2.getStringCellValue());
                cell2.setCellValue("sam");
                FileOutputStream fos = new FileOutputStream("C:\\Users\\prash\\Desktop\\vm training\\Act_3.xlsx");
                wb.write(fos);
                wb.close();
                fos.close();
                System.out.println("adding the contents is completed");

            }
            catch(Exception e) {
                System.out.println(e.getMessage());
            }
    }
}
