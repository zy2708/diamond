import java.util.Scanner;

public class diamond{
    public static void main (String[]args){
        System.out.println("Please choose a program.");
        System.out.println("1. First 100 odd numbers");
        System.out.println("2. First 100 even numbers");
        System.out.println("3. Diamond shape");
        Scanner scanner=new Scanner(System.in);
        int sc=scanner.nextInt();
        if(sc==1){
            int a=1;
            int b=0;
            do{
                System.out.println(a);
                a+=2;
                b++;

            }while(b<100);
        }
        else if (sc==2){
            int c=0;
            int d=0;
            do{
                System.out.println(c);
                c+=2;
                d++;
            }while(d<100);
        }
        else if (sc==3){
            for(int row=1;row<=5;row++){
                for(int column=1;column<=5;column++){
                    int x=column-row;
                    int y=(3-row)-Math.abs(Math.abs(row-3)-2);
                    int z=(3-row)+Math.abs(Math.abs(row-3)-2);
                    if(y<=x&&x<=z){
                        System.out.print("*");
                    }
                    else System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
}

