package br.com.raoni.sistemadebiblioteca.books;

import java.util.ArrayList;
import java.util.Scanner;


public class Books {
    private String name;
    private boolean borrowed = false;
    private int quantity;
    private static ArrayList<Books> arrayBooks = new ArrayList<>();

    static Books bookTest = new Books("Raoni Gostoso");

    public static void test(){
        arrayBooks.add(bookTest);
    }

    public static ArrayList<Books> getArrayBooks() {
        return arrayBooks;
    }

    static Scanner scanner = new Scanner(System.in);

    public Books(String name) {this.name = name;}

    @Override
    public String toString(){
        return name + "- autor desconhecido \n";
    }

    public String getName() {
        return name;
    }

    public static void createBook(){
        System.out.println("diga o nome do livro:");
        String nameOfBookCreated = scanner.nextLine();

        try {
            saveBook(nameOfBookCreated);
            System.out.println("livro criado!!!\n");
        }catch (IllegalArgumentException e){
            System.out.println("[ERRO]: " + e.getMessage());
        }

    }

    public static void saveBook(String name){
        if (name == null || name.trim().isEmpty()){
            throw new IllegalArgumentException("o nome não pode ser vazio");
        }

        Books bookCreated = new Books(name);
        arrayBooks.add(bookCreated);
    }

}
