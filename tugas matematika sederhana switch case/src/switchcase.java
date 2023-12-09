import java.util.Scanner;

import java.util .*;

public class switchcase {

        public static void main(String[] args) {

            Scanner inputUser;
            float a,b,hasil;
            String operator;

            inputUser = new Scanner(System.in);

            System.out.print("nilai a = ");
            a = inputUser.nextFloat();
            System.out.print("operator = ");
            operator = inputUser.next();
            System.out.print("nilai b = ");
            b = inputUser.nextFloat();

            switch (operator) {
                case "+":
                    //penjumlahan
                    hasil = a + b;
                    System.out.println("hasil= " + hasil);
                    break;
                case "-":
                    //Pengurangan
                    hasil = a - b;
                    System.out.println("hasil= " + hasil);
                    break;
                case "*":
                    //perkalian
                    hasil = a * b;
                    System.out.println("hasil=  " + hasil);
                    break;
                case "/":
                    //pembagian
                    hasil = a / b;
                    System.out.println("hasil=  " + hasil);
                    break;
                case "%":
                    //Modulus
                    hasil = a % b;
                    System.out.println("hasil=  " + hasil);
                    break;
                default:
                    System.out.println("operator tidak ditemukan"+operator+"tidak ditemukan");
            }


        }
    }



