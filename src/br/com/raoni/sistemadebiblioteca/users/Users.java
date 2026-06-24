package br.com.raoni.sistemadebiblioteca.users;

public class Users {
    private String name;
    private final int CPF;
    private int age;
    private int numberOfBooks = 0;
    private boolean blocked = false;

    public Users(String name, int CPF, int age) {
        this.name = name;
        this.CPF = CPF;
        this.age = age;
    }
}
