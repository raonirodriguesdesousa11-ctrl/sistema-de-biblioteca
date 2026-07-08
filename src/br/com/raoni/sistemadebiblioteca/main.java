package br.com.raoni.sistemadebiblioteca;

import java.util.Scanner;

import static br.com.raoni.sistemadebiblioteca.books.Books.*;
import static br.com.raoni.sistemadebiblioteca.users.Users.createUser;

public class main {
    public static void main() {
        Scanner scanner = new Scanner(System.in);

        String text = """
                Escolha uma opção:
                1-adicionar um livro
                2-adicionar usuário
                3-ver livros disponíveis
                4-emprestrar um livro
                5-sair
                """;
        int x = 0;
        while(x != 5){
            System.out.println(text);
            x = scanner.nextInt();
            switch (x){
                case 1:
                    createBook();
                    break;
                case 2:
                    createUser();
                    break;
                case 3:
                    test();
                    System.out.println(getArrayBooks());

            }
        }

    }
}
