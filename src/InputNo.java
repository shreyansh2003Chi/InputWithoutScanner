import java.util.Scanner;

import javax.swing.JOptionPane;

public class InputNo {
    public static void main(String[] args) throws Exception {
       String s= SystemInput.in1.input("Enter your name : ");
       System.out.println("Hello "+s+" your name is : "+s);
       JOptionPane.showMessageDialog(null,"Hello and Wlcome "+s+" !!!!!");
    }
}

class SystemInput {
    public static TakeInput in1;
    static {
        in1= new GUI(); // if you have to take input through the console just need to change object new CUI(); instead of new GUI(); HAPPY CODING.....
    }                       // we maintain a proper implementation of Abstraction by using Interface.....
}
    interface TakeInput {
        public  String input(String str);
    }
class GUI implements TakeInput {
    public String input(String str) {

        String n1 = JOptionPane.showInputDialog(str);
        return n1;
    }
}
class CUI implements TakeInput{

    public  String input(String str) {
        Scanner s=new Scanner(System.in);
        System.out.println(str);
        String name =s.nextLine();
        return name;
    }
}