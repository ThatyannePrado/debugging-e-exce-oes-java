package com.dio.exceptions;

import javax.swing.*;
import java.util.Iterator;

public class UncheckedException {
    public static void main(String[] args) {

        boolean continueLooping = true;
        do {

            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");
            try {
                int resultado = dividir(Integer.parseInt(a),Integer.parseInt(b));
                System.out.println("Resultado: "+resultado);
                continueLooping = false;
            } catch (NumberFormatException e) {
//            throw new RuntimeException(e);
                e.printStackTrace();
                JOptionPane.showMessageDialog(null,"Entrada inválida.Informe um número inteiro: "+
                        e.getMessage());
            } catch (ArithmeticException e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(null,"Denominador não pode ser igual a zero.Informe outro denominador inteiro: "+
                        e.getMessage());
            }
            finally {
                System.out.println("Chegou no Finally");
            }
        }while (continueLooping==true);
        System.out.println("Continua...");
    }

    public static int dividir(int a, int b){return a/b;}
}
