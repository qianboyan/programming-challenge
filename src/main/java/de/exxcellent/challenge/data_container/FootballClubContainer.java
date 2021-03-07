package de.exxcellent.challenge.data_container;

import java.util.Iterator;
import java.util.ArrayList;

import de.exxcellent.challenge.data_basic.FootballClub;


public class FootballClubContainer extends ItemCSVContainer<FootballClub>{
    private ArrayList<FootballClub> data;

    public FootballClubContainer(ArrayList<FootballClub> data) {
    	super(data);
        this.data = data;
    }

    public FootballClub findObjWithMinDiffGoals() {
    	Iterator<FootballClub> iter = this.data.iterator();
    	FootballClub ObjWithMinDiff = iter.next();
        while (iter.hasNext()) {
        	FootballClub nextObj = iter.next();
            if (nextObj.cmpDiffGoals(ObjWithMinDiff))
            	ObjWithMinDiff = nextObj;
        }

        return ObjWithMinDiff;        
	}
}