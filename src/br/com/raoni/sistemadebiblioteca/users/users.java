package br.com.raoni.sistemadebiblioteca.users;

public class users {
    private String name;
    private int cpf;
    private int age;
    private int numberOfBooks;
    private boolean blocked = false;

    void register(String name, int cpf, int age) {
        this.name = name;
        this.cpf = cpf;
        this.age = age;
    }
}
