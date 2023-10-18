package Percabangan;

import java.util.Scanner;
public class if_else {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String password = prompt("Enter Password :" );
        String validPassword = "password";

        if (password.equals(validPassword)){
            System.out.println("selamat datang bos!");
        } else {
            System.out.println("Password salah, Silahkan coba lagi!");
        }
        System.out.println("Terima kasih sudah menggunakan aplikasi kami");
    }

    public static String prompt(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextLine();
    }
}
