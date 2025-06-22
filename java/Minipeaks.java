import java.util.Scanner;

public class Minipeaks{
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number of elements");
    int n =sc.nextInt();   
    int a[] = new int[n];
    System.out.println("enter the eke"); 

    for (int i=0;i<a.length-1;i++){
        a[i]= sc.nextInt();
    }
    for (int i=0;i<a.length -1 ;i++){
        if(a[i]>a[i-1]&& a[i]>a[i+1]){
            System.out.println(a[i]);
        }
    }


}
}