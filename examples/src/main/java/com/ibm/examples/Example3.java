package com.ibm.examples;

	import java.util.HashMap;
	import java.util.Map;
	import java.util.Set;

	class Balance {
	    double bal;

	    Balance(double b) {
	        bal = b;
	    }
	   
	    public String toString() {
	        return Double.toString(bal);
	    }
	}
	
	public class Example3 {
		public static void main(String args[]) {  
			  
		    // Use a data structure. 
		    HashMap<String, Balance> hm = new HashMap<String,Balance>();  
		      
		    // Place elements to the data structure  
		    hm.put("John Doe", new Balance(3434.34));  
		    hm.put("Tom Smith", new Balance(123.22));  
		    hm.put("Jane Baker", new Balance(1378.00));  
		    hm.put("Tod Hall", new Balance(99.22));  
		    hm.put("Ralph Smith", new Balance(-19.08));  
		  
		    // Get a set of the entries. 
		  Set<Map.Entry<String, Balance>> set = hm.entrySet();  
		 
		    // Display the set. 
		    for(Map.Entry<String, Balance> me : set) { 
		      System.out.print(me.getKey() + ": ");  
		      System.out.println(me.getValue());  
		    }  
		 
		    System.out.println();  
		  
		    // Deposit 1000 into John Doe's account. 
		    Balance balance = hm.get("John Doe");  
		   balance.bal+=1000;  
		 
		    System.out.println("John Doe's new balance: " +  
		      hm.get("John Doe"));  
		  }
	}
