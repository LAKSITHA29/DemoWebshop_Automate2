package com.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.*;

public class ExcelUtils {

    private static Workbook workbook;
    private static Sheet sheet;

    // Load Excel file and sheet
    public static void setExcelFile(String excelPath, String sheetName) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\ADMIN\\workspace-db-mvn\\Automate_DemoWebShop2\\src\\test\\resources\\Email_excel.xlsx");
        workbook = WorkbookFactory.create(fis);
        sheet = workbook.getSheet(sheetName);
    }

    // Get data from Excel (by row and column)
    public static String getCellData(int rowNum, int colNum) {
        Row row = sheet.getRow(rowNum);
        Cell cell = row.getCell(colNum);
        DataFormatter formatter = new DataFormatter();
        return formatter.formatCellValue(cell);
    }

    // Get row count
    public static int getRowCount() {
        return sheet.getLastRowNum() + 1;
    }
}
