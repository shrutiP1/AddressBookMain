package com.bridgelab.addressbook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook
{
    private final String name;
    List<ContactData> contacts=new ArrayList<>();
    Scanner input=new Scanner(System.in);

    public AddressBook(String name)
    {
        this.name=name;
    }

    @Override
    public String toString() {
        return "AddressBook{" +
                "name='" + name + '\'' +
                ", contacts=" + contacts +
                '}';
    }

    public void addContact()
    {
        System.out.println("Enter firstName");
        String firstName=input.nextLine();
        System.out.println("Enter Last Name: ");
        String lastName = input.nextLine();
        System.out.println("Enter Address: ");
        String address = input.nextLine();
        System.out.println("Enter City: ");
        String city = input.nextLine();
        System.out.println("Enter State: ");
        String state = input.nextLine();
        System.out.println("Enter Pin Code: ");
        String zip = input.nextLine();
        System.out.println("Enter Phone Number: ");
        String phone = input.nextLine();
        System.out.println("Enter Email ID: ");
        String email = input.nextLine();
        contacts.add(new ContactData(firstName,lastName,address,city,state,zip,phone,email));
    }
}
