/*
	Pontifícia Universidade Católica de Góias
	Goiânia, ** de ** de 2025
	Matéria: Laboratório de Programação
	Curso: Análise e Desenvolvimento de Sistemas
	Aluno: Matheus Souza Santos
	Matrícula: 2025.2.0120.0035-8
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int primeiroPar, segundoPar, num;
        double provaCaracteristica;
        String mensagem;

        System.out.println("Digite um número de 4 dígitos (ex: 1234)");
        num = sc.nextInt();

        if (num >= 1000 && num <= 9999) {
            primeiroPar = num / 100;
            segundoPar = num % 100;

            // provando caracteristica
            provaCaracteristica = primeiroPar + segundoPar;
            provaCaracteristica = Math.pow(provaCaracteristica, 2);

            if (provaCaracteristica == num) {
                mensagem = "O número possui a característica";
            }
            else {
                mensagem = "O número não possui a característica";
            }

            System.out.println(mensagem);
        }
        else {
            System.out.println("O número não atende aos requisitos");
        }
    }
}