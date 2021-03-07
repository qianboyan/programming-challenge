package de.exxcellent.challenge.data_basic;

import com.opencsv.bean.CsvBindByName;


public class FootballClub extends ItemCSV<FootballClub> {
    @CsvBindByName(column = "Team")
    private String team;
    @CsvBindByName(column = "Goals")
    private Integer goals;
    @CsvBindByName(column = "Goals Allowed")
    private Integer goals_allowed;

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public Integer getGoals() {
        return goals;
    }

    public void setGoals(Integer goals) {
        this.goals = goals;
    }

    public Integer getGoals_allowed() {
        return goals_allowed;
    }

    public void setGoals_allowed(Integer goals_allowed) {
        this.goals_allowed = goals_allowed;
    }
    
    @Override
    public void printItem() {
    	String output = String.format("Club %s with Goals %d and Goals allowed %d", this.team, this.goals, this.goals_allowed);
    	System.out.println(output);
    }
    
    /**
     * Used to calculate the goal difference of the 2 clubs,
     * can be extended to calculate such as difference of winning games and losing games
     * @a refers to first integer number.
     * @b refers to second integer number.
     * @return true if the temp difference object in param greater than current obj.
     */
    public boolean cmpDiff(Integer a, Integer b) {
        Integer this_diff = Math.abs(this.goals - this.goals_allowed);
        Integer current_diff = Math.abs(a - b);
        if (this_diff < current_diff)
            return true;
        else
            return false;
    }
    
    /**
     * Used to compare the goals difference of 2 clubs.
     * @oFootballClub refers to another object of weather day.
     * @return true if the goal difference object in param greater than current obj.
     */
    public boolean cmpDiffGoals(FootballClub oFootballClub) {
    	return cmpDiff(oFootballClub.getGoals(), oFootballClub.getGoals_allowed());
    }
}