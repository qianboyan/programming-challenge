package de.exxcellent.challenge.utilities;


import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.charset.StandardCharsets;
import java.io.IOException;
import java.util.Iterator;
import java.util.ArrayList;


import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;


public class CSVParser<T>{
    private CsvToBean<T> csv_data;

    /**
     * Used to read csv to class data.
     * @filename is the file path to csv.
     * @type is class such as FootballClub or WeatherDay.
     * see "http://opencsv.sourceforge.net/"
     */
    public CSVParser(String filename, Class<T> type) {
        try {
            Reader reader = Files.newBufferedReader(Paths.get(filename), StandardCharsets.UTF_8);
            this.csv_data = new CsvToBeanBuilder<T>(reader).withType(type).build();
        } catch(IOException e) {
            System.out.println(e);
        }
    }

    /**
     * Used to convert cvs_data to ArrayList, which will be used to create container.
     * All subclasses will inherit this method.
     * @return a ArrayList.
     */
    public ArrayList<T> toArrayList() {
        Iterator<T> iter = this.csv_data.iterator();
        ArrayList<T> list = new ArrayList<T>(); 
        iter.forEachRemaining(list::add); 
  
        return list; 
    }

}