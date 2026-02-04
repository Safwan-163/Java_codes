import java.util.Scanner;

public class lab_practice_01
{
    public static void main(String[] args){
        Scanner sc = new Scanner (System . in );
        int a = sc.nextInt();
        int sq=a * a;
        System.out.println(sq);

        Scanner sc_1=new Scanner(System.in);
        int b=sc.nextInt();
         if(b%2==0){
            System.out.println("even");

        }
         else if(b==0){
             System.out.println("Zero");
         }
         else{
             System.out.println("Odd");
         }


         //problem_03 starts from here
        Scanner sc_2=new Scanner(System.in);
         int c=sc_2.nextInt();
         int count=0;
         for(int i= 2;i*i <=c; i++){
             if(c  % i==0){
                 count=count+1;
                 break;
             }
         }
         if(count==0){
             System.out.println(" Prime");
         }
         else {
             System.out.println("Not Prime");
         }
        Scanner sc_3=new Scanner(System.in);
         int d=sc_3.nextInt();
         int r=d%7;
         if(r==0){
             System.out.println("SUNDAY");
         }
         else if(r==1){
             System.out.println("Monday");
         }
         else if(r==2){
             System.out.println("Tuesday");
         }
         else if(r==3){
             System.out.println("Wednesday");
         }
         else if(r==4){
             System.out.println("Thursday");
         }

         else if(r==5){
             System.out.println("Friday");
         }

         else if(r==6){
             System.out.println("Monday");
         }
         else{
             System.out.println("Day not found");
         }



    }
}
