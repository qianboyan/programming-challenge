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

    public WeatherDay findObjWithMinDiffTemp() {
    	Iterator<WeatherDay> iter = this.data.iterator();
    	WeatherDay ObjWithMinDiff = iter.next();
        while (iter.hasNext()) {
        	WeatherDay nextObj = iter.next();
            if (nextObj.cmpDiffTemp(ObjWithMinDiff))
            	ObjWithMinDiff = nextObj;
        }

        return ObjWithMinDiff;        
	}
    
    
}