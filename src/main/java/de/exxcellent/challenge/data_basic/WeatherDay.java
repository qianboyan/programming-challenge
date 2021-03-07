package de.exxcellent.challenge.data_basic;

import com.opencsv.bean.CsvBindByName;


public class WeatherDay extends ItemCSV<WeatherDay> {
    @CsvBindByName(column = "Day")
    private Integer day;
    @CsvBindByName(column = "MxT")
    private Float mxT;
    @CsvBindByName(column = "MnT")
    private Float mnT;

    public Integer getDay() {
        return this.day;
    }

    public void setDay(Integer iDay) {
        this.day = iDay;
    }

    public Float getMxT() {
        return mxT;
    }

    public void setMxT(Float fMxT) {
        this.mxT = fMxT;
    }

    public Float getMnT() {
        return mnT;
    }

    public void setMnT(Float fMnT) {
        this.mnT = fMnT;
    }
    
    @Override
    public void printItem() {
    	String output = String.format("The %d Day with MinTemperatur %f and MaxTemperatur %f", this.day, this.mnT, this.mxT);
    	System.out.println(output);
    }
    
    public boolean cmpDiff(Float a, Float b) {
        Float this_diff = this.mxT - this.mnT;
        Float current_diff = a - b;
        if (this_diff < current_diff)
            return true;
        else
            return false;
    }
    
    public boolean cmpDiffTemp(WeatherDay oWeatherDay) {
    	return cmpDiff(oWeatherDay.getMxT(), oWeatherDay.getMnT());
    }
    
    
}