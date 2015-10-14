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
        System.out.println(person.getZipCode());
    }
}
package com;
 
public interface IPerson {
 
    void setHouse(IHouse house);
 
    IHouse getHouse();
 
    String getZipCode();
 
}

package com;
 
public class Person implements IPerson {
     
    private IHouse house;
 
    @Override
    public void setHouse(IHouse house) {
        this.house = house;
    }
 
    @Override
    public IHouse getHouse() {
        return house;
    }
 
    @Override
    public String getZipCode() {
        return house.getZipCode();
    }
}

package com;
 
public interface IHouse {
 
    void setAddress(IAddress address);
 
    IAddress getAddress();
 
    String getZipCode();
 
}

package com;
 
public class House implements IHouse {
 
    private IAddress address;
 
    @Override
    public void setAddress(IAddress address) {
        this.address = address;
    }
 
    @Override
    public IAddress getAddress() {
        return address;
    }
 
    @Override
    public String getZipCode() {
        return address.getZipCode();
    }
}

package com;
 
public interface IAddress {
 
    void setName(String string);
 
    void setZipCode(String string);
 
    String getZipCode();
 
    public abstract String getName();
 
}

package com;
 
public class Address implements IAddress {
 
    private String name;
    private String zipCode;
 
    @Override
    public void setName(String name) {
        this.name = name;
    }
 
    @Override
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
 
    @Override
    public String getName() {
        return name;
    }
 
    @Override
    public String getZipCode() {
        return zipCode;
    }
}