import java.util.Scanner;
import java.util.Random;
public class Main{
    public static void main(String args[]){

        Scanner scannerObject1=new Scanner(System.in);  //GETTING USER INPUT
        System.out.println("Enter min number:");
        int input1=scannerObject1.nextInt();

        Scanner scannerObject2=new Scanner(System.in);    //GETTING USER INPUT
        System.out.println("Enter max number:");
        int input2=scannerObject2.nextInt();

        Scanner scannerObject3=new Scanner(System.in);
        System.out.println("Enter number of tries:");   //GETTING USER INPUT
        int input3=scannerObject3.nextInt();

        Random randomObject=new Random();
        int storage[]=new int[input2+1+input1];

        for(int counter=1; counter<=input3; counter++){
            storage[input1+randomObject.nextInt(input2)]+=1;

        }

        System.out.println("NUMBER \t FREQUENCY");

        for(int counter=1; counter<storage.length; counter++){
            if(counter<=input2 && storage[counter]!=0){
                System.out.println(counter +"\t" +storage[counter]);
            }

        }









    }
}