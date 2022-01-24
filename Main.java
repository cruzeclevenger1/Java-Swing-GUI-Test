import java.util.*;
import javax.swing.*;


class Main {

  public static void main(String[] args) {

    //prepare all imports

    Random rand = new Random();

    Scanner input = new Scanner(System.in);

    JFrame myframe = new JFrame();

    
    myframe.setSize(300, 300);
    myframe.setTitle("Blank Window");
    myframe.setResizable(false);
    myframe.setLocation(300,300);


    //*******************************************

    boolean done = false;


    while (done == false) {

      System.out.print("Console > > >  ");  

      String coninput = input.nextLine();

      if (coninput.equals("window open")) {
        System.out.println("Opening Window...");
        System.out.println("Done!");

        myframe.setVisible(true);
      }

      if (coninput.equals("window close")) {
        System.out.println("Closing Window...");

        myframe.setVisible(false);
        System.out.println("Done!");
      }

      if (coninput.equals("exit")) {
        System.out.println("Exiting...");
        myframe.dispose();
        done = true;
        System.out.println("Done!");
      }

    }


  }
}