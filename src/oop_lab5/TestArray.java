package oop_lab5;
//introduction to array in java
public class TestArray {
    public static void main(String[] args) {
   //Array
   int nuber [];
   nuber = new int[5];
   System.out.println(nuber[0]);
   System.out.println(nuber[1]);
   System.out.println(nuber[2]);
   System.out.println(nuber[3]);
   System.out.println(nuber[4]);
   nuber[1] = 10;
   System.out.println(nuber[1]);
   nuber[4] = 20;
   nuber[3] = nuber[1] + nuber[4];
   System.out.println(nuber[3]);
   System.out.println(nuber[4]);

        int total = 0;
        for (int i=0;i<nuber.length;i++) {
            System.out.println("number[" + i + "]: " + nuber[i]);
            total+= nuber[i];
        }//for
        System.out.println("Total in arry is "+total);

      //double
      double value[] = new double[5];
    for (int i=0;i<value.length;i++)
        System.out.println(value[i]);
    //Sting array
        String msg[]= new String[5];
        for (int i=0;i<value.length;i++)
            System.out.println(msg[i]);





    }//main



}//class
