package br.com.raoni.sistemadebiblioteca.books;

import java.util.ArrayList;
import java.util.Scanner;


public class Books {
    private String name;
    private final int ID;
    private boolean borrowed = false;
    private int quantity;
    private static ArrayList<Books> arrayOfbooks = new ArrayList<Books>();

    static Scanner scanner = new Scanner(System.in);

    public Books(int id, String name) {
        ID = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    void toLoan(){
        borrowed = true;
    }


    public static void createBook(){
        System.out.println("digite o ID do livro e o nome dele");
        int idOfBookCreated = scanner.nextInt();
        scanner.nextLine();
        String nameOfBookCreated = scanner.nextLine();

        Books bookCreated = new Books(idOfBookCreated, nameOfBookCreated);
        arrayOfbooks.add(bookCreated);

        System.out.println("livro criado");
    }

}
