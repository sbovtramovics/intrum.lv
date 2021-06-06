package util;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import java.io.FileReader;
import java.util.List;

public class CsvParser {
    public static List<String[]> readAllDataAtOnce()
    {
        try {
            FileReader filereader = new FileReader("src/test/resources/data/TestData.csv");
            CSVReader csvReader = new CSVReaderBuilder(filereader)
                    .withSkipLines(1)
                    .build();
            List<String[]> allData = csvReader.readAll();
            return allData;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
