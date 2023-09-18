package lab03;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        Music m1=new Music("Lullaby","3 minutes","melody",new Date(12,06,2003),new Person("mark","male","american",new Date(06,12,2003)));

 Music m2=new Music("the end","4 minutes","rock",new Date(12,04,2003),new Person("mark","male","korean",new Date(06,12,2003)));
        System.out.println(m1);
        System.out.println(m2);
    }

}