import java.util.Scanner;
class Example{
    public static void main(String a[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int x = sc.nextInt();
        System.out.println("Enter other number");
        int y = sc.nextInt();
        System.out.println(x+y);
    }
}
/*
Just like int  : nextInt() 
for boolean    : nextBoolean()
for float      : nextFloat()
for String     : next()      (no space string)
               : nextLine()  (with space string)
*/