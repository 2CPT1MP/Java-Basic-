import java.util.Scanner;
public class apples{
    public static void main(String args[]){
        System.out.println("24 to 12 hour converter");
        System.out.println();
        System.out.println("Input hours mins then seconds, separate each with spaces:");
        Scanner input=new Scanner(System.in);
        int h=input.nextInt();
        int m=input.nextInt();
        int s=input.nextInt();

        tuna tunaObj=new tuna();
        tunaObj.setTime(h,m,s);
        System.out.println(tunaObj.convertTo12h());

    }







}