package oop_lap6;

public class myStringBuffer {
    public static void main(String[] args) {
        // StingBuffer
       StringBuffer buffer = new StringBuffer();
        buffer.append("Hello");
        System.out.println(buffer);
        buffer.append(20);
        System.out.println(buffer);
        buffer.insert(5, " ");
        System.out.println(buffer);
     //  System.out.println(buffer.reverse());
        buffer.append("RMUSTV");
        System.out.println(buffer);
        buffer.delete(6, 8);
        System.out.println(buffer);









    }//main




}//class