package week6homework;

import java.util.Objects;

class Contact {
    private String firstName;
    private String lastName;
    private String phoneNumber;

    Contact(String firstName, String lastName, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName () {
        return this.firstName;
    }

    public String getLastName () {
        return this.firstName;
    }

    public String getPhoneNumber () {
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
