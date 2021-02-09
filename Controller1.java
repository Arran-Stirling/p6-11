package mvcexample;

/**
 *
 * @author savi
 */
// Controller 1: displays views 1 and 2 
//               (displaying A and B components of the model)
// Offers three buttons: clear views, increment A in the model 
// and quit - see below

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

Hola Amigos!!! -- Mick

public class Controller1 extends JFrame
                         implements ActionListener {
  
    private Model model;
    private int iN; // instance number of controller
    private View1 view1;
    private View2 view2;
    private JButton clearViews;  // For direct message to views
    private JButton incA;        // To prompt the model to "modify" itself (A component)
    private JButton incB;
    private JButton quit;        // As it says
    
    // Constructor
    public Controller1(Model model, int instance, int xC, int yC) {
        
        // Record reference to the model
        this.model = model;
        iN = instance;

        // Configure the window
        setTitle("Controller1 :" + iN);
        setLocation(xC,yC);
        setSize(350,150);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());     // The default is that JFrame uses BorderLayout
        
        // Set up input GUI
        clearViews = new JButton("Clear views");
        window.add(clearViews);
        clearViews.addActionListener(this);
        incA = new JButton("Inc A");
        window.add(incA);
        incA.addActionListener(this);
        incB = new JButton("Inc B");
        window.add(incB);
        incB.addActionListener(this);
        quit = new JButton("Quit");
        window.add(quit);
        quit.addActionListener(this);
        // Create views
        view1 = new View1(this, model);
        window.add(view1);
        view2 = new View2(this, model);
        window.add(view2);
        
        // Display the frame
        setVisible(true);
      
    } // constructor
  
    // Button click handling:
    public void actionPerformed(ActionEvent e) {
      
        if (e.getSource() == clearViews) {
            view1.clear();
            view2.clear();
        }
        else if (e.getSource() == incA) 
            model.modifyA();     // The model will trigger the views to update themselves
        else if (e.getSource() == incB) 
            model.modifyB();     // The model will trigger the views to update themselves
        else if (e.getSource() == quit)
            System.exit(0);
          
  } // actionPerformed
  
} // class Controller1

