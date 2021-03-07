package de.exxcellent.challenge.data_container;

import java.util.Iterator;
import java.util.ArrayList;


public class ItemCSVContainer<T>{
    private ArrayList<T> data;
    
    public ItemCSVContainer(ArrayList<T> data) {
        this.data = data;
    }

    /**
     * Although ArrayList has own size() function.
     * Here can we define some generic functionalities for all subclasses.
     */
    public void getSize() {
    	System.out.println(this.data.size());
    	
	}
    
    /**
     * Used to print the whole container.
     * The functionality is always the same in all subclasses.
     */
    public void printAll() {
    	Iterator<T> iter = this.data.iterator();
        while (iter.hasNext()) {
        	T nextObj = iter.next();
        	System.out.println(nextObj.toString());
        }
	}
}