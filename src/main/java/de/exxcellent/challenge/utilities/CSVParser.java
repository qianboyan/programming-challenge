package de.exxcellent.challenge.utilities;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.ArrayList;


public class CSVParser<T>{
    private CsvToBean<T> csv_data;

    public CSVParser(String filename, Class<T> type) {
        try {
            Reader reader = Files.newBufferedReader(Paths.get(filename));
            this.csv_data = new CsvToBeanBuilder<T>(reader).withType(type).build();
        } catch(IOException e) {
            System.out.println(e);
        }
    }

    public ArrayList<T> toArrayList() {
        Iterator<T> iter = this.csv_data.iterator();
        ArrayList<T> list = new ArrayList<T>(); 
        iter.forEachRemaining(list::add); 
  
        return list; 
    }

}