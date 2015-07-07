import java.util.Scanner;


public class name {
	public static void main(String[] args){
        System.out.print("what is your name?");
        Scanner in = new Scanner(System.in);
        String name= in.next();
        System.out.println("Hello "+name);
        in.close();
}
}
