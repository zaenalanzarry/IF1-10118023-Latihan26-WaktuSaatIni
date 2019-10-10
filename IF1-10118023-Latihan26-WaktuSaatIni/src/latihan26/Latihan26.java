/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latihan26;

import java.util.Date;
import java.text.SimpleDateFormat;

/**
 * @author Zaenal PC
 * NAMA              : Zaenal Anzarry
 * KELAS             : IF-01
 * NIM               : 10118023
 * Deskripsi Program : Waktu Saat Ini
 */

public class Latihan26 {

    public static void main(String[] args) {
        String hari;
        
        Date dKini = new Date( );
        SimpleDateFormat day = new SimpleDateFormat ("EEEE");
        if(day.equals("Sunday")){
            hari = "Minggu";
        }
        else if(day.equals("Monday")){
            hari = "Senin";
        }
        else if(day.equals("Tuesday")){
            hari = "Selasa";
        }
        else if(day.equals("Wednesday")){
            hari = "Rabu";
        }
        else if (day.equals("Thursday")){
            hari = "Kamis";
        }
        else if (day.equals("Friday")){
            hari = "Jumat";
        }
        else {
            hari = "Sabtu";
        }
        
        SimpleDateFormat today = new SimpleDateFormat (", dd MMM yyyy h:mm:ss");
        System.out.println("Hari ini adalah hari : "+ hari  + today.format(dKini));
    }
    
}
