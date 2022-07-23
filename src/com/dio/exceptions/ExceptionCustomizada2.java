package com.dio.exceptions;

import javax.swing.*;

public class ExceptionCustomizada2 {
    public static void main(String[] args) {
        int[] numerador = {4, 5, 8, 10};
        int[] denominador = {2, 4, 0, 2, 8};

        for (int i = 0; i < denominador.length; i++){

            try {
                if(numerador[i]%2 != 0) {
                    throw new DivisaoNaoExataException("Divisão não exata!", numerador[i], denominador[i]);
                } else if (denominador[i] == 0) {
                      throw new DivisaoPorZeroException("Divisão por zero!", numerador[i], denominador[i]);
                } /*else if (numerador[i] == null) {
                    throw new ArrayOutBoundsException("Lista de numeradores é menor que lista de denominadores!",
                            numerador[i], denominador[i]);
                }*/


                int resultado = numerador[i]/denominador[i];
                System.out.println(resultado);

            } catch (DivisaoNaoExataException e){
                JOptionPane.showMessageDialog(null, e.getMessage());
                e.printStackTrace();
            } catch (DivisaoPorZeroException e){
                JOptionPane.showMessageDialog(null, e.getMessage());
                e.printStackTrace();
            } catch (ArrayIndexOutOfBoundsException e){
                JOptionPane.showMessageDialog(null, "Lista do numerador é menor que denominador");
                e.printStackTrace();
            }
        }
        System.out.println("Continua...");
    }
}

class DivisaoNaoExataException extends Exception{
    private int numerador;
    private int denominador;

    public DivisaoNaoExataException(String message, int numerador, int denominador) {
        super(message);
        this.numerador = numerador;
        this.denominador = denominador;
    }
}
class DivisaoPorZeroException extends Exception{
    private int numerador;
    private int denominador;

    public DivisaoPorZeroException(String message, int numerador, int denominador) {
        super(message);
        this.numerador = numerador;
        this.denominador = denominador;
    }
}