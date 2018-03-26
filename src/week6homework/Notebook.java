package week6homework;

import java.util.*;

public interface Notebook {

    void addNewContact(Contact contact);

    void deleteContact(Contact contact);

    int getSizeOfNotebook();

    Collection findByFirstname(String firstName);

    Collection findByLastname(String lastName);

    Collection findByPhoneNumberPart(String phoneNumberSearchString);

}
