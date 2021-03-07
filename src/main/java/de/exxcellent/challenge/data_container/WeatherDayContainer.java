package de.exxcellent.challenge.data_container;

import java.util.Iterator;
import java.util.ArrayList;

import de.exxcellent.challenge.data_basic.WeatherDay;


public class WeatherDayContainer extends ItemCSVContainer<WeatherDay>{
    private ArrayList<WeatherDay> data;

    public WeatherDayContainer(ArrayList<WeatherDay> data) {
    	super(data);
        this.data = data;
    }

    /**
     * Used to find the day with min temperature difference.
     * @return weatherday object.
     */
    public WeatherDay findObjWithMinDiffTemp() {
    	Iterator<WeatherDay> iter = this.data.iterator();
    	WeatherDay ObjWithMinDiff = iter.next();
        while (iter.hasNext()) {
        	WeatherDay nextObj = iter.next();
            if (nextObj.cmpDiffTempWith(ObjWithMinDiff))
            	ObjWithMinDiff = nextObj;
        }
        return ObjWithMinDiff;        
	}
    
    
}