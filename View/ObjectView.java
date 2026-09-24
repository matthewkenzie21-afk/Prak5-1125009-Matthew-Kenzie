package View;

import Controller.ObjectController;
import Util.InputUtil;

public class ObjectView {
    public static void main(String[] args) {
        ObjectController controller = new ObjectController();

        int input = -1;
        while(input != 0) {
            System.out.println();
            System.out.println("Smart Home");
            System.out.println();
            System.out.println("1. Tambah Perangkat");
            System.out.println("2. Print Semua Perangkat");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            input = InputUtil.readInt();
            InputUtil.readLine();

            if (input == 1) controller.tambahPerangkat();
            else if (input == 2) controller.printPerangkat();
            else if (input == 0) System.out.println("Selesai.");
            else System.out.println("Pilihan tidak tersedia.");
        }
    }
}