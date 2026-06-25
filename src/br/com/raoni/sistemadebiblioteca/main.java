package br.com.raoni.sistemadebiblioteca;

import java.util.Scanner;
import static br.com.raoni.sistemadebiblioteca.books.Books.createBook;


public class main {
    public static void main() {
        Scanner scanner = new Scanner(System.in);

        String text = """
                Escolha uma opção:
                1-adicionar um livro
                2-emprestrar um livro
                3-ver livros disponíveis
                4-sair
                """;
        int x = 0;
        while(x != 4){
            System.out.println(text);
            x = scanner.nextInt();
            switch (x){
                case 1:
                    createBook();
                    break;
                case 2:


            }
        }

    }
}
