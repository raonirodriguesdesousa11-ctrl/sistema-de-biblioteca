package br.com.raoni.sistemadebiblioteca.users;
import br.com.raoni.sistemadebiblioteca.books.Books;
import java.util.ArrayList;
import java.util.Scanner;

public class Users {
    private String name;
    private final String CPF;
    private int age;
    private int numberOfBooks = 0;
    private boolean blocked = false;
    private ArrayList<Books> booksOfUser = new ArrayList<>();
    private static ArrayList<Users> arrayOfUsers = new ArrayList<>();

     static Scanner scanner = new Scanner(System.in);

    public Users(String name, String CPF, int age) {
        this.name = name;
        this.CPF = CPF;
        this.age = age;
    }

    public static void createUser(){
        System.out.println("Digite o nome do novo usuário: ");
        String name = scanner.nextLine();
        System.out.println("Digite o CPF do novo usuário (somente números): ");
        String cpf = scanner.nextLine();
        System.out.println("Digite a idade do novo usuário: ");
        int age = 0;
        age = scanner.nextInt();

        saveUser(name, cpf, age);
    }

    static void saveUser(String name, String cpf, int age) {
        String cpfClean = cpf.replaceAll("[^0-9]","");


        if (name == null || name.trim().isEmpty()){
            throw new IllegalArgumentException("o nome do usuário não pode ser vazio.");
        }
        if (cpfClean.length() != 11){
            throw new IllegalArgumentException("o CPF deve conte exatemente 11 números");
        }
        if (age == 0){
            throw new IllegalArgumentException("a idade não pode ser vazia");
        }

         Users userCreated = new Users(name, cpf, age);
        arrayOfUsers.add(userCreated);
    }




}
