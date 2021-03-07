package de.exxcellent.challenge;

import de.exxcellent.challenge.data_basic.FootballClub;
import de.exxcellent.challenge.data_basic.WeatherDay;

import de.exxcellent.challenge.utilities.WeatherDayCSVParser;
import de.exxcellent.challenge.utilities.FootballClubCSVParser;


/**
 * The entry class for your solution. This class is only aimed as starting point and not intended as baseline for your software
 * design. Read: create your own classes and packages as appropriate.
 *
 * @author Benjamin Schmid <benjamin.schmid@exxcellent.de>
 * @version changed by Boyan Qian
 * @date 07.03.2021
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
        WeatherDay oWeatherDay = hWeatherDay.toContainer().findObjWithMinDiffTemp();
        System.out.println(String.format("Day %d in this month is with minimum temperature difference.", oWeatherDay.getDay()));
        
        FootballClubCSVParser hFootballClub = new FootballClubCSVParser(sFootballCSVPath);
        FootballClub oFootballClub = hFootballClub.toContainer().findObjWithMinDiffGoals();
        System.out.println(String.format("Team %s has the minimum goal spread.", oFootballClub.getTeam()));
        
        
        // some other functionalities can also be used.
        oWeatherDay.printItem();
        oFootballClub.printItem();
        
    }
}



