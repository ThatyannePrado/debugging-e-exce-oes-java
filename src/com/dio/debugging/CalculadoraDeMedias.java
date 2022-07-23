package com.dio.debugging;

import java.util.Scanner;

public class CalculadoraDeMedias {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] alunos = {"Ana", "Carlos", "Pedro", "Maria"};
        double media = calculaMediaDaTurma(alunos, scan);
        System.out.printf("Media da turma: %.2f", media);
    }
    public static double calculaMediaDaTurma(String[] alunos, Scanner scan){
        double soma = 0d;
        for (String aluno:alunos) {
            System.out.printf("Nota do aluno %s: ",aluno);
            double nota = scan.nextInt();
            soma += nota;
        }
        return soma/ alunos.length;
    }
}

