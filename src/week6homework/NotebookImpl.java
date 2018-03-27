package week6homework;

import java.util.ArrayList;
import java.util.Collection;

public class NotebookImpl implements Notebook {

    private ArrayList<Contact> myNotebook;

    public NotebookImpl() {
        this.myNotebook = new ArrayList<>();
    }

    @Override
    public void addNewContact(Contact contact) {
        if (isValidContact(contact)) {
            this.myNotebook.add(contact);
        }
    }

    @Override
    public void deleteContact(Contact contact) {
        if (isValidContact(contact)) {
            //needs to remove all elements based on criteria.
            this.myNotebook.remove(contact);
        }
    }

    @Override
    public int getSizeOfNotebook() {
        return this.myNotebook.size();
    }

    @Override
    public Collection findByFirstname(String firstName) {
        if (isInvalidString(firstName)) {
            return null;
        }
        ArrayList<Contact> tempArray = new ArrayList<>();
        for (Contact contact : this.myNotebook) {
            if (contact.getFirstName().equals(firstName)) {
                tempArray.add(contact);
            }
        }
        return tempArray;
    }

    @Override
    public Collection findByLastname(String lastName) {
        if (isInvalidString(lastName)) {
            return null;
        }
        ArrayList<Contact> tempArray = new ArrayList<>();
        for (Contact contact : this.myNotebook) {
            if (contact.getLastName().equals(lastName)) {
                tempArray.add(contact);
            }
        }
        return tempArray;
    }

    @Override
    public Collection findByPhoneNumberPart(String phoneNumberSearchString) {
        if (isInvalidString(phoneNumberSearchString)) {
            return null;
        }
        ArrayList<Contact> tempArray = new ArrayList<>();
        for (Contact contact : this.myNotebook) {
            if (contact.getPhoneNumber().equals(phoneNumberSearchString)) {
                tempArray.add(contact);
            }
        }
        return tempArray;
    }

    private boolean isValidContact(Contact contact) {
        return contact != null;
    }

    private boolean isInvalidString(String stringToCheck) {
        return stringToCheck == null;
    }
}
