package de.exxcellent.challenge.utilities;

import de.exxcellent.challenge.data_basic.WeatherDay;
import de.exxcellent.challenge.data_container.WeatherDayContainer;


public class WeatherDayCSVParser extends CSVParser<WeatherDay>{

    public WeatherDayCSVParser(String filename) {
    	super(filename, WeatherDay.class);
    }
    
    /**
     * Used to create data container.
     * @return data container.
     */
    public WeatherDayContainer toContainer() {
    	WeatherDayContainer cWeatherDay = new WeatherDayContainer(super.toArrayList());
        return cWeatherDay; 
    }

}