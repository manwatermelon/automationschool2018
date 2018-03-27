package week6homework;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        NotebookImpl notebook = new NotebookImpl();
        Contact c = new Contact("A","B","1");
        notebook.addNewContact(c);
        notebook.addNewContact(c);
        System.out.println(c);
        notebook.deleteContact(c);
        System.out.println(notebook);
    }
}
