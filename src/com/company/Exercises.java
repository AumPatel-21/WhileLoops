package com.company;

public class Exercises {

    public static int addOdds(int x){
        int i=1;
        while(i < x){
            System.out.print(i +" ");
            i = i+ 2;
        }
        return i;
    }

    public static int howManyYears(double startpop, double endpop){
        int years = 0;

        while(startpop < endpop){

            startpop = startpop * 1.0113;
            years++;

        }
        return years;
    }
    public static int printSum(int number){
        int num = 0;
        int i = 1;
        while(i <= number){
            num = num + i;
            i++;
        }
        return num;
    }
      public static boolean isPerfectSquare(int n){
       int x = 1;
       int y = 1;
       while(x <= n){
           y = y + 2;
           x = x + y;
           if( x == n){
               return true;
           }
       }
       return false;
     }


    public static int sumDigits(int n){
        int sum = 0;
        while (n > 0){
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }


    public static void main(String[] args) {



        //addOdds
        System.out.println("addOdds");
        System.out.print(addOdds(12) + "\n");
        System.out.print(addOdds(9) + "\n");
        System.out.print(addOdds(23) + "\n");
        System.out.print("\n");

       //howManyYears
        System.out.println("howManyYears");
        System.out.println(howManyYears(111.2,120) + " years.");
        System.out.println(howManyYears(111.2,150) + " years.\n");

        // printSum
        System.out.println("printSum");
        System.out.print(printSum(5) + "\n");
        System.out.print(printSum(6) + "\n");
        System.out.print(printSum(2) + "\n");
        System.out.print("\n");
        // sumDigits
        System.out.println("sumDigits");
        System.out.println(sumDigits(234));
        System.out.println(sumDigits(333));
        System.out.println(sumDigits(628));
        System.out.print("\n");
        //isPerfectSquare
        System.out.println("isPerfectSquare");
        System.out.println(isPerfectSquare(25));
        System.out.println(isPerfectSquare(5));
        System.out.println(isPerfectSquare(81));

    }
}






