package br.com.raoni.sistemadebiblioteca.books;

public class Books {
    private String name;
    private final int ID;
    private boolean borrowed = false;

    public Books(int id, String name) {
        ID = id;
        this.name = name;
    }

    void toLoan(){
        borrowed = true;
    }
}
