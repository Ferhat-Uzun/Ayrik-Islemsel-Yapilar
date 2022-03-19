package com.ferhat;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int heat;
        int light;
        int humidity;
        boolean ariza;
        boolean sistem;

        Scanner s = new Scanner(System.in);

        System.out.println("Isı değerini giriniz");
        heat =s.nextInt();

        System.out.println("Işık değerini giriniz");
        light =s.nextInt();

        System.out.println("Nem değerini giriniz");
        humidity =s.nextInt();


        System.out.println("Sistem çalısıyor mu? (true, false)");
        sistem =s.nextBoolean();

        System.out.println("Arıza var mı? (true, false)");
        ariza =s.nextBoolean();


        if (heat > 15 && heat< 20 && light>10 && light<15 && humidity>5 && humidity<12){
            System.out.println("Sistem çalışır");
        }
        if (heat > 15 && heat< 20 && light>10 && light<15 && humidity<5 && ariza && sistem){
            System.out.println("Alarım çalısır");
        }
        if (heat > 15 && heat< 20 && light>10 && light<15 && humidity<5 && !ariza && sistem){
            System.out.println("Nem seviyesi arttırılmalı");
        }
        if (heat < 15 && light>10 && light<15 && humidity<5 && !ariza && sistem){
            System.out.println("Isı seviyesi arttırılmalı");
        }
        if (heat<15 && light>10 && light<15 && humidity<5 && ariza && sistem){
            System.out.println("Alarım çalısır");
        }
        if (heat > 20 && light>10 && light<15 && humidity<5 && ariza && sistem){
            System.out.println("Alarım çalısır");
        }
        if (heat > 20 && light>10 && light<15 && humidity<5 && !ariza && sistem){
            System.out.println("Isı azaltılmalı");
        }
        if (heat>15 && heat<20 && light>0 && light<9 && humidity>5 && humidity<12 && sistem){
            System.out.println("Işık seviyesi arttır");
        }
        if (heat>15 && heat<20 && light>0 && light<9 && humidity>5 && humidity<12 && !sistem){
            System.out.println("Alarımı çalıştır");
        }
    }
}
