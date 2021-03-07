package de.exxcellent.challenge.data_container;

import java.util.Iterator;
import java.util.ArrayList;


public class ItemCSVContainer<T>{
    private ArrayList<T> data;
    
    public ItemCSVContainer(ArrayList<T> data) {
        this.data = data;
    }

    public void getSize() {
    	System.out.println(this.data.size());
    	
	}
    
    public void printAll() {
    	Iterator<T> iter = this.data.iterator();
        while (iter.hasNext()) {
        	T nextObj = iter.next();
        	System.out.println(nextObj.toString());
        }
    	
    	
	}
}