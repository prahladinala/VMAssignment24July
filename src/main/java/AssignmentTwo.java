import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
public class AssignmentTwo {
    public static void main(String[] args) {
        try{
            File src = new File("D:\\Java Projects\\Assignment24July\\src\\main\\java\\ReadSheet.xlsx");

            FileInputStream fis = new FileInputStream(src);

            XSSFWorkbook wb = new XSSFWorkbook(fis);
            XSSFSheet sh = wb.getSheetAt(0);
            System.out.println(sh.getRow(0).getCell(0).getStringCellValue());
            System.out.println(sh.getRow(0).getCell(1).getNumericCellValue());
            System.out.println(sh.getRow(0).getCell(2).getRichStringCellValue());
            System.out.println(sh.getRow(0).getCell(3).getRawValue());
            System.out.println(sh.getRow(0).getCell(4).getRichStringCellValue());
            System.out.println(sh.getRow(1).getCell(0).getStringCellValue());
            System.out.println(sh.getRow(1).getCell(1).getNumericCellValue());
            System.out.println(sh.getRow(1).getCell(2).getRichStringCellValue());
            System.out.println(sh.getRow(1).getCell(3).getRawValue());
            System.out.println(sh.getRow(1).getCell(4).getRichStringCellValue());
            wb.close();
        }catch (Exception e){
            System.out.println("ERROR");
            System.out.println(e.getMessage());
        }
    }
}
