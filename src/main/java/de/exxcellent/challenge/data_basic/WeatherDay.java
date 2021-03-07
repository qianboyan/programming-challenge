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
    	String output = String.format("The %d Day with MinTemperatur %.2f °F and MaxTemperatur %.2f °F", this.day, this.mnT, this.mxT);
    	System.out.println(output);
    }
    
    /**
     * Used to calculate the temp difference of 2 weather days,
     * can be extended to calculate such as difference of minT and averageT
     * @a refers to first float number.
     * @b refers to second float number.
     * @return true if the temp difference object in param greater than current obj.
     */
    public boolean cmpDiff(Float a, Float b) {
        Float this_diff = this.mxT - this.mnT;
        Float current_diff = a - b;
        if (this_diff < current_diff)
            return true;
        else
            return false;
    }
    
    /**
     * Used to compare the temperature difference of 2 weather days.
     * @oWeatherDay refers to another object of weather day.
     * @return true if the temp difference object in param greater than current obj.
     */
    public boolean cmpDiffTempWith(WeatherDay oWeatherDay) {
    	return cmpDiff(oWeatherDay.getMxT(), oWeatherDay.getMnT());
    }
    
    
}