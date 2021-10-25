package Perulangan;

import javax.swing.*;
import java.util.Random;

public class Tebak {
    public static void main(String[] args) {

        Random rand = new Random();

        boolean running = true;
        int jawaban_rahasia = rand.nextInt(10);
        int jawaban_anda;
        int batas = 5;
        String keluar;


        while (running){
            jawaban_anda = Integer.parseInt(JOptionPane.showInputDialog("Masukan Jawaban Anda: "));

            // buat kondisi untuk mengecek apakah jawaban yg di inputkan sama dengan soal
            if(jawaban_anda == jawaban_rahasia){
                JOptionPane.showMessageDialog(null,"Jawaban Anda Benar");
                break;
            }else{
                JOptionPane.showMessageDialog(null,"Jawaban Anda Salah");
                 batas--;
                 if(batas == 0) break;
                }
            keluar = JOptionPane.showInputDialog("Apakah Anda Ingin Keluar(y/n)");
            running = keluar.equalsIgnoreCase("n");

        }
    }
}
