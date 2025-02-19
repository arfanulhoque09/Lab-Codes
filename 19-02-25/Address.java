class Address {
    String city, state, country;

    public Address(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }
}

class Emp {
    int id;
    String name;
    Address address;

    public Emp(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void display() {
        System.out.println(id + " " + name);
        System.out.println(address.city + " " + address.state + " " + address.country);
    }
}

class Bank {
    Emp emp;
    String name;


    public Bank(Emp emp,String name) {
        this.emp = emp;
        this.name= name;
    }

    void display() {
        System.out.println("Employee is: " + emp.name + " Id: " + emp.id);
        System.out.println("this.name: NRBC");
        emp.display();
    }
}

 class PERSON{
    public static void main(String[] args) {
        Address address1 = new Address("changao", "Ashulia", "Dhaka");
        Address address2 = new Address("Khagan", "DSC", "Dhaka");

        Emp e = new Emp(157, "opu", address1);
        Emp e2 = new Emp(148, "Rafi", address2);

        e.display();
        e2.display();

        Bank bank = new Bank(e,"NRBC");
        bank.display();
    }

}


