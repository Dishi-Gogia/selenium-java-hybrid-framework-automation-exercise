package utilities;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * Utility class for reading test data from Excel files.
 * Supports DataProvider integration with TestNG.
 */
public class ExcelUtils {

    /**
     * Reads data from Excel sheet and returns it as a 2D Object array.
     * First row is treated as header and skipped.
     *
     * @param filePath  Excel file path
     * @param sheetName Sheet name
     * @return Object[][] containing test data
     * @throws Exception if file or sheet is not found
     */
    public static Object[][] getExcelData(String filePath,
                                          String sheetName) throws Exception {

        try (FileInputStream fis = new FileInputStream(filePath);
             Workbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheet(sheetName);

            int rowCount = sheet.getPhysicalNumberOfRows();
            int colCount = sheet.getRow(0).getPhysicalNumberOfCells();

            Object[][] data = new Object[rowCount - 1][colCount];

            DataFormatter formatter = new DataFormatter();

            for (int i = 1; i < rowCount; i++) {

                for (int j = 0; j < colCount; j++) {

                    data[i - 1][j] = formatter.formatCellValue(
                            sheet.getRow(i).getCell(j));
                }
            }

            return data;
        }
    }
}