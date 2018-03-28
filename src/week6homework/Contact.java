package week6homework;

import java.util.Objects;

class Contact {
    private final String firstName;
    private final String lastName;
    private final String phoneNumber;

    Contact(String firstName, String lastName, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    String getFirstName() {
        return this.firstName;
    }

    String getLastName() {
        return this.lastName;
    }

    String getPhoneNumber() {
        return this.phoneNumber;
    }

    public String toString () {
        return this.firstName + " " + this.lastName + " " + phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(firstName, contact.firstName) &&
                Objects.equals(lastName, contact.lastName) &&
                Objects.equals(phoneNumber, contact.phoneNumber);
    }

    @Override
    public int hashCode() {

        return Objects.hash(firstName, lastName, phoneNumber);
    }
}
