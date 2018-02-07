package oop_lob9;


public class myPersonApp {
    public static void main(String[] args) {
        Person person = new Person("1111111111111",
                "Puriwat Lertkrai",
                new Address("109 M.2", "Nakorn",
                        "80110"),
                new Job("Teacher", 20000));

        System.out.println(person.toString());





    }   //main



}//class