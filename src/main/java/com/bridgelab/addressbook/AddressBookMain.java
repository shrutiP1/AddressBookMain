package com.bridgelab.addressbook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBookMain
{
    public List<AddressBook> addressBookList=new ArrayList<AddressBook>();
    int bookNumber;
    Scanner scan=new Scanner(System.in);
    String name;
    public static void main(String[] args)
    {
        AddressBookMain addressBookMain=new AddressBookMain();
        System.out.println("Welcome to MasterBranch");
        addressBookMain.menu();
        System.out.println("Welcome to Address Book ");
    }
    private void getAddressBookName()
    {
        System.out.println("Enter AddressBook Name");
        name=scan.next();
        addressBookList.add(new AddressBook(name));
        System.out.println("New AddressBook created with "+name);
    }

    public void menu()
    {
        System.out.println("------AddressBookMenu------>");
        System.out.println("Choose Option");
        this.getAddressBookName();
        System.out.println("1.Add Contact");
        addressBookList.get(bookNumber).addContact();
    }
}
