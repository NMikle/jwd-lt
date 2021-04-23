package com.epam.jwd.lt.rectangle.pojo;

public final class Human {

    private final String name;
    private final int age;
    private final Address address;

    public Human(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public static void main(String[] args) {
        final Address address = new Address("Awesome st.", 13, 14);
        final Human bob = new Human("Bob", 12, address);
        System.out.println(bob);
//        printToUser(bob);
        final Human mary = bob.setName("Mary");
        bob.getAddress().setBuilding(1);
        System.out.println(bob);
    }

    public String getName() {
        return name;
    }

    public Human setName(String name) {
        return new Human(name, age, address);
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
//        return address;
        return new Address(
                address.getStreet(),
                address.getBuilding(),
                address.getFlat()
        );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Human human = (Human) o;

        if (age != human.age) return false;
        if (name != null ? !name.equals(human.name) : human.name != null) return false;
        return address != null ? address.equals(human.address) : human.address == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + (address != null ? address.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }
}
