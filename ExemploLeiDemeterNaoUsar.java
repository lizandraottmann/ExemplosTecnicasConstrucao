package com;
 
public class Main {
 
    public static void main(String[] args) {
        IAddress address = new Address();
        address.setName("01");
        address.setZipCode("000001");
 
        IHouse house = new House();
        house.setAddress(address);
 
        IPerson person = new Person();
        person.setHouse(house);
 
        // Print the person zip code
        System.out.println(person.getHouse().getAddress().getZipCode());
    }
}
