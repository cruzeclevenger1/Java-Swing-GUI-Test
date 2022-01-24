import java.util.*;
import javax.swing.*;


class Main {

  public static void main(String[] args) {

    Random rand = new Random();

    System.out.println(rand.nextInt(10));

    Scanner input = new Scanner(System.in);

    String inputtest = input.nextLine();

    if (inputtest.equals("testing")) {
      System.out.println(
        "Testing Successful"
      );
    }
    else {
      System.out.println("Testing unsuccessful");
    }

    JFrame myframe = new JFrame();

    myframe.setVisible(true);
    myframe.setSize(300, 300);
    myframe.setTitle("Blank Window");
    myframe.setResizable(false);


  }
}