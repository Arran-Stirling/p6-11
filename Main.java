package mvcexample;


/**
 *
 * @author savi
 */
// Launcher for application

public class Main {
	
	//here come dat boi
   
	//testing testing...
	
    public static void main(String args[]) {
     
        Model model = new Model();               					  // Create shared database
        Controller1 c1 = new Controller1(model, "Window 1", 40, 40);  // Create first controller
        Controller2 c2 = new Controller2(model, "Window 2", 40, 200); // Create second controller
        Controller2 c3 = new Controller2(model, "Window 3", 40, 360);
        
    } // main
  
} // Main
