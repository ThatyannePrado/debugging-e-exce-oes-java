package com.dio.exceptions;

import javax.swing.*;
import java.io.*;

public class CheckedExceptions {
    public static void main(String[] args){
        String nomeDoArquivo = "romances.txt";
        try {
            imprimirArquivoNoConsole(nomeDoArquivo);
        } catch (FileNotFoundException e){
            JOptionPane.showMessageDialog(null,
                    "Revise o nome do arquivo que você quer imprimir!");
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,
                    "Ocorreu erro inesperado. Entre em contato com o suporte!");
        }
        System.out.println("Apesar da exception ou não, o programa continua...");

    }

    public static void imprimirArquivoNoConsole(String nomeDoArquivo) throws IOException {
        File file = new File(nomeDoArquivo);

        BufferedReader br = new BufferedReader(new FileReader(file.getName()));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do {
            bw.write(line);
            bw.newLine();
            line=br.readLine();

        }while (line != null);
        bw.flush();
        br.close();
    }
}


