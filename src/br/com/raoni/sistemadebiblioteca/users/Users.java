package br.com.raoni.sistemadebiblioteca.users;
import br.com.raoni.sistemadebiblioteca.books.Books;
import java.util.ArrayList;

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

    public static void createUser(){
        System.out.println("");
    }




}
