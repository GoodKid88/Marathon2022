package Day1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int a;
        int b;
        String s;


        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        s = sc.next();

        if(a > 10 && s.equals("one") || b < 10 && s.equals("two")){
            System.out.println("GOOD");
        }else{
            System.out.println("Not so good");
        }

    }
}
