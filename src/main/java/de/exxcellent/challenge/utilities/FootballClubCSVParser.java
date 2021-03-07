package de.exxcellent.challenge.utilities;

import de.exxcellent.challenge.data_basic.FootballClub;
import de.exxcellent.challenge.data_container.FootballClubContainer;


public class FootballClubCSVParser extends CSVParser<FootballClub>{

    public FootballClubCSVParser(String filename) {
    	super(filename, FootballClub.class);
    }
    
    public FootballClubContainer toContainer() {
    	FootballClubContainer cWeatherDay = new FootballClubContainer(super.toArrayList());
        return cWeatherDay; 
    }

}