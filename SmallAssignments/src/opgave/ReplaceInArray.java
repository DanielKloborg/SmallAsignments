package opgave;

import java.util.ArrayList;

public class ReplaceInArray {

	public static void main(String[] args) {
		ArrayList<Integer> insertAL = new ArrayList<Integer>();
			insertAL.add(3);
	        insertAL.add(1);
	        insertAL.add(2);
	        insertAL.add(5);
	        insertAL.add(5);
	        insertAL.add(1);
	        insertAL.add(6);
	        insertAL.add(1);
	        insertAL.add(2);
	        insertAL.add(5);
	        insertAL.add(4);
        
        ArrayList<Integer> target = new ArrayList<Integer>();
	        target.add(1);
	        target.add(2);
	        target.add(5);
	        
	    ArrayList<Integer> replace = new ArrayList<Integer>();
	    	replace.add(3);
	    	replace.add(1);
	    	replace.add(2);
	    	
	    ArrayList<Integer> replacedAL = new ArrayList<Integer>();	
		
		for(int i = 0; i < insertAL.size(); i++) {
			if(insertAL.get(i) == target.get(0) && insertAL.get(i+1) == target.get(1) && insertAL.get(i+2) == target.get(2)) {
				replacedAL.add(replace.get(0));
				replacedAL.add(replace.get(1));
				replacedAL.add(replace.get(2));
				i++;
				i++;
			}

			else {
				replacedAL.add(insertAL.get(i));
			}
		}
		System.out.println(replacedAL);
	}
}
