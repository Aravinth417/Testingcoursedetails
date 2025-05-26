package org.singleinheritance;

//single inheritance parent class

public class Desktop extends Computer {
	
	private void desktopsize() {
		
		System.out.println("desktopsbackground");
		
		
	}
	  public static void main(String[] args) {
		  
		  Desktop d = new Desktop();
		  
		  d.desktopsize();
		  d.computermodel();
		  System.out.println("Working on prabhakar branch");
		
	}

}
