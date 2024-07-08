package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a sua senha: ");
        String senha = scanner.next();
        int tentativas = 1;

        //Para alterar a senha "correta",
        //basta mudar na linha abaixo o termo "INSIRASUASENHAAQUI" para a senha de sua escolha.
        while(!senha.equals("INSIRASUASENHAAQUI") && tentativas <= 2) {
            System.out.println(
                    "Senha incorreta! Tente novamente. (Tentativas restantes: " + (3 - tentativas));
            tentativas++;
            senha = scanner.next();
        }

        if(senha.equals("INSIRASUASENHAAQUI")) {
            System.out.println("Acesso permitido!");
        } else {
            System.out.println("Senha incorreta, acesso Bloqueado! (Limite de tentativas excedido)");
        }
    }
}
