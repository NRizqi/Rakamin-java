package Percabangan;

import java.util.Scanner;
public class whileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Are You Ready ? ");
        String ulangi = scanner.nextLine();
        System.out.println("start");
        int counter = 0;

        while (ulangi.equals("i") || ulangi.equalsIgnoreCase("Yes")) {
            System.out.println("Apakah anda mau mengulang? (yes/no) : ");
            String jawab = scanner.nextLine();
            counter++;

            if (!jawab.equalsIgnoreCase("Yes")) {
                ulangi = "0";
            }

            System.out.println(("Pengulangan ke-" + counter));
        }
    }

}
