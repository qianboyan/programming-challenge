package de.exxcellent.challenge;

import de.exxcellent.challenge.data_basic.FootballClub;
import de.exxcellent.challenge.data_basic.WeatherDay;
import de.exxcellent.challenge.data_container.WeatherDayContainer;
import de.exxcellent.challenge.data_container.FootballClubContainer;

import de.exxcellent.challenge.utilities.WeatherDayCSVParser;
import de.exxcellent.challenge.utilities.FootballClubCSVParser;


/**
 * The entry class for your solution. This class is only aimed as starting point and not intended as baseline for your software
 * design. Read: create your own classes and packages as appropriate.
 *
 * @author Benjamin Schmid <benjamin.schmid@exxcellent.de>
 */
public final class App {
    private static String sWeatherCSVPath = "src/main/resources/de/exxcellent/challenge/weather.csv";
    private static String sFootballCSVPath = "src/main/resources/de/exxcellent/challenge/football.csv";
    /**
     * This is the main entry method of your program.
     * @param args The CLI arguments passed
     */
    public static void main(String... args) {    
    	WeatherDayCSVParser hWeatherDay = new WeatherDayCSVParser(sWeatherCSVPath);
        WeatherDayContainer cWeatherDay = hWeatherDay.toContainer();
        WeatherDay oWeatherDay = cWeatherDay.findObjWithMinDiffTemp();
        System.out.println("Day with smallest temperature spread : " + oWeatherDay.getDay());
        
        FootballClubCSVParser hFootballClub = new FootballClubCSVParser(sFootballCSVPath);
        FootballClubContainer cFootballClub = hFootballClub.toContainer();
        FootballClub oFootballClub = cFootballClub.findObjWithMinDiffGoals();
        System.out.println("Team with smallest goal spread       : " + oFootballClub.getTeam());
        
        cWeatherDay.getSize();
        oWeatherDay.printItem();
        oFootballClub.printItem();
        
        
    }
}



