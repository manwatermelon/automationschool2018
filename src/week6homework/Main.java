package week6homework;

import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        
        NotebookImpl notebook = new NotebookImpl();
        Contact contact1 = new Contact("A","B","7973340");
        Contact contact2 = new Contact("C", "B", "123456");
        Contact contact3 = new Contact("D", "C", "654321");
        Contact contact4 = new Contact("D", "C", "");

        notebook.addNewContact(null);
        //we should not add null to contacts
        assert (notebook.getSizeOfNotebook() == 0);

        notebook.addNewContact(contact1);
        //there should be 1 element contact1
        assert (notebook.findByLastname("B").contains(contact1));

        notebook.addNewContact(contact1);
        //there should be 1 element contact1
        assert (notebook.findByFirstname("A").size() == 1);
        
        notebook.addNewContact(contact2);
        notebook.addNewContact(contact3);
        notebook.addNewContact(contact4);
        //there should be 4 elements in the notebookimpl
        assert (notebook.getSizeOfNotebook() == 4);

        Collection byPhoneNumberPart = notebook.findByPhoneNumberPart("686");
        //there should be 0 elements by such criteria
        assert (byPhoneNumberPart.size() == 0);

        Collection byPhoneNumberPart1 = notebook.findByPhoneNumberPart("34");
        //there should be 3 elements by such criteria: contact1, contact2
        assert (byPhoneNumberPart1.size() == 2);

        Collection byPhoneNumberPart2 = notebook.findByPhoneNumberPart("4");
        //there should be two records contact1, contact2, contact3
        assert (byPhoneNumberPart2.size() == 3);

        Collection byPhoneNumberPart3 = notebook.findByPhoneNumberPart("");
        //assume that by passing empty string as parameter we should receive the whole notebook contents
        assert (byPhoneNumberPart3.size() == 4);


        notebook.deleteContact(contact1);
        //there should be no elements with firstname "A"
        assert (notebook.findByFirstname("A").size() == 0);
        
    }
}
