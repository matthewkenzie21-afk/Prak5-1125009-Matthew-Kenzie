package Controller;

import java.util.ArrayList;
import Util.InputUtil;
import Model.ConnectionType;
import Model.SmartDevice;
import Model.SmartDoorLock;
import Model.SmartSpeaker;
import Model.SmartTV;

public class ObjectController {
    private ArrayList<SmartDevice> device = new ArrayList<>();

    public void tambahPerangkat() {
        System.out.println();
        System.out.println("Tambah Perangkat");
        System.out.println();

        System.out.println("1. Smart TV");
        System.out.println("2. Smart Speaker");
        System.out.println("3. Smart Door Lock");
        System.out.print("Pilih: ");
        int pilihPerangkat = InputUtil.readInt();

        System.out.print("ID: ");
        String id = InputUtil.readLine();
        InputUtil.readLine();
        System.out.print("Nama: ");
        String nama = InputUtil.readLine();
        System.out.print("Daya: ");
        double daya = InputUtil.readDouble();
        InputUtil.readLine();

        if (pilihPerangkat == 1) {
            System.out.print("Channel: ");
            int channel = InputUtil.readInt();
            System.out.print("Volume: ");
            int volume = InputUtil.readInt();
            InputUtil.readLine();

            System.out.println();
            System.out.println("1. WIFI");
            System.out.println("2. BLUETOOTH");
            System.out.println("3. NONE");
            System.out.print("Pilih koneksi: ");
            int pilihKoneksi = InputUtil.readInt();
            InputUtil.readLine();

            ConnectionType connectionType;

            if (pilihKoneksi == 1) connectionType = ConnectionType.WIFI;
            else if (pilihKoneksi == 2) connectionType = ConnectionType.BLUETOOTH;
            else connectionType = ConnectionType.NONE;

            SmartTV tv = new SmartTV(id, nama, daya, "Mati", channel, volume, connectionType);

            System.out.println();
            System.out.println("1. Menyala");
            System.out.println("2. Mati");
            System.out.print("Pilih status perangkat: ");
            int pilihStatus = InputUtil.readInt();
            InputUtil.readLine();

            if (pilihStatus == 1) tv.turnOn();
            else tv.turnOff();

            device.add(tv);
            System.out.println();
            System.out.println("Smart TV berhasil ditambahkan.");
        } else if (pilihPerangkat == 2) {
            System.out.print("Volume: ");
            int volume = InputUtil.readInt();
            InputUtil.readLine();

            System.out.println();
            System.out.println("1. WIFI");
            System.out.println("2. BLUETOOTH");
            System.out.println("3. NONE");
            System.out.print("Pilih koneksi: ");
            int pilihKoneksi = InputUtil.readInt();
            InputUtil.readLine();

            ConnectionType connectionType;

            if (pilihKoneksi == 1) connectionType = ConnectionType.WIFI;
            else if (pilihKoneksi == 2) connectionType = ConnectionType.BLUETOOTH;
            else connectionType = ConnectionType.NONE;

            SmartSpeaker speaker = new SmartSpeaker(id, nama, daya, "Mati", volume, connectionType);

            System.out.println();
            System.out.println("1. Menyala");
            System.out.println("2. Mati");
            System.out.print("Pilih status perangkat: ");
            int pilihStatus = InputUtil.readInt();
            InputUtil.readLine();

            if (pilihStatus == 1) speaker.turnOn();
            else speaker.turnOff();

            device.add(speaker);
            System.out.println();
            System.out.println("Smart Speaker berhasil ditambahkan.");
        } else if (pilihPerangkat == 3) {
            System.out.print("PIN: ");
            String pin = InputUtil.readLine();

            SmartDoorLock doorLock = new SmartDoorLock(id, nama, daya, "Terbuka", pin);

            System.out.println();
            System.out.println("1. Terkunci");
            System.out.println("2. Terbuka");
            System.out.print("Pilih status pernagkat: ");
            int statusPerangkat = InputUtil.readInt();
            InputUtil.readLine();

            if (statusPerangkat == 1) doorLock.lock();
            else doorLock.unlock();

            device.add(doorLock);
            System.out.println();
            System.out.println("Smart Door Lock berhasil ditambahkan.");
        } else {
            System.out.println();
            System.out.println("Pilihan perangkat tidak tersedia.");
        }
    }

    public void printPerangkat() {
        System.out.println();
        System.out.println("Semua Perangkat");
        System.out.println();

        if (device.isEmpty()) System.out.println("Belum ada perangkat.");
        else {
            for (SmartDevice d : device) {
                d.print();
                System.out.println();
            }
        }
    }
}