package ac.id.mercubuana.javafundamental.basic;

import ac.id.mercubuana.javafundamental.basic.kendaraan.Kereta;
import ac.id.mercubuana.javafundamental.basic.kendaraan.Mobil;
import ac.id.mercubuana.javafundamental.basic.kendaraan.Motor;
import ac.id.mercubuana.javafundamental.basic.musik.Gitar;
import org.apache.commons.lang3.time.DateUtils;

import java.util.Date;

public class Main {
    public static void main (String[] args){
        System.out.println("Hello World!");

        Gitar.bunyi();
        Mobil.jumlahBan();
        Motor.jumlahBan();
        Kereta.jumlahBan();

        Date today = new Date();
        System.out.println("Hari ini = " + today);
        Date tomorrow = DateUtils.addDays(today, 1);
        System.out.println("Besok = " + tomorrow);
    }
}
