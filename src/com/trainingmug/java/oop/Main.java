package com.trainingmug.java.oop;

public class Main {
    public static void main(String[] args) {
        //object
        Customer customer; // reference variable
        int x; // normal variable
        x = 100;
        System.out.println(x);
        customer = new Customer(); // new Customer Object will be created on Heap
        System.out.println("Id : " + customer.id);
        System.out.println("Name : " + customer.name);
        System.out.println("E-mail : " + customer.email);
        System.out.println("Contact No : " + customer.contactNo);
        System.out.println("Salary : " + customer.salary);

        customer.id = 111;
        customer.name = "Customer1";
        customer.email = "customer1@gmail.com";
        customer.contactNo = "+91-987987342";
        customer.salary = 2342342;

        System.out.println("Id : " + customer.id);
        System.out.println("Name : " + customer.name);
        System.out.println("E-mail : " + customer.email);
        System.out.println("Contact No : " + customer.contactNo);
        System.out.println("Salary : " + customer.salary);

        Customer customer2;
        customer2 = new Customer();
        customer2.id = 222;
        customer2.name = "Customer2";
        customer2.email = "customer2@gmail.com";
        customer2.contactNo = "+91-868768686";
        customer2.salary = 868768;

        System.out.println("Id : " + customer2.id);
        System.out.println("Name : " + customer2.name);
        System.out.println("E-mail : " + customer2.email);
        System.out.println("Contact No : " + customer2.contactNo);
        System.out.println("Salary : " + customer2.salary);
        System.out.println(new Customer().email);
        Customer customer3;
        customer3 = customer2;
        customer3.name = "Customer3";
        System.out.println(customer2.name);
        System.out.println(customer3.name);

    }
}
