package br.com.raoni.sistemadebiblioteca.users;
import br.com.raoni.sistemadebiblioteca.books.Books;
import java.util.ArrayList;
import java.util.Objects;

public class Users {
    private String name;
    private final int CPF;
    private int age;
    private int numberOfBooks = 0;
    private boolean blocked = false;
    private ArrayList<Books> booksOfUser = new ArrayList<>();
    private static ArrayList<Users> arrayOfUsers = new ArrayList<>();

    public Users(String name, int CPF, int age) {
        this.name = name;
        this.CPF = CPF;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    void borrowABook(Books book){
        numberOfBooks++;
        booksOfUser.add(book);
    }

    void returnABorroweBook(Books book){
        numberOfBooks--;
        booksOfUser.remove(book);
    }


    public static boolean verifyUser(Users user){
        boolean userExists = false;
        for( Users u : arrayOfUsers){
            userExists = Objects.equals(u.getName(), user.getName());
        }
        return userExists;
    }

    public static void toBorrow(Books book, Users user){

    }

}
