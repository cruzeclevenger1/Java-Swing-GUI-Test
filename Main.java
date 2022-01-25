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
    boolean winopen = false;

    System.out.println("Type commands here. Type 'help' for list of commands.");


    while (done == false) {

      System.out.print("Console > > >  ");  

      String coninput = input.nextLine();

      if (coninput.equals("window open")) {
        System.out.println("Opening Window...");
        System.out.println("Done!");

        winopen = true;

        myframe.setVisible(true);
      }

      if (coninput.equals("window close")) {
        System.out.println("Closing Window...");

        winopen = false;

        myframe.setVisible(false);
        System.out.println("Done!");
      }

      if (coninput.equals("exit")) {
        System.out.println("Exiting...");
        myframe.dispose();
        done = true;
        System.out.println("Done!");
      }

      if (coninput.equals("help")) {
        System.out.println("Commands: ");
        System.out.println("window open: opens a window");
        System.out.println("window close: closes the open window");
        System.out.println("exit: shuts down the program");
        System.out.println("help: lists commands");
        //System.out.println("");
        //System.out.println("");
        //System.out.println("");
      }

      if (coninput.equals("change text") && winopen == true) {
        System.out.print("What do you want the text to say > > > ");
        JLabel text1 = new JLabel(input.nextLine());
        System.out.println("Adding...");
        myframe.add(text1);
      }



      if (coninput.equals("change text") && winopen == false) {
        System.out.print("You have to have a window open.");
      }
    }
  }
}