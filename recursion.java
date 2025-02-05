import java.util.Scanner;
public class recursion {
public static void printNumb(int n){
    if(n==6) //if n =0
    {
        return;
    }
    System.out.println(n);
    printNumb(n+1); //if n-1 the it will print 5 4 3 2 1
    
}
public static void main(String[] args) {
    int n = 1;
    printNumb(n);
}
}
