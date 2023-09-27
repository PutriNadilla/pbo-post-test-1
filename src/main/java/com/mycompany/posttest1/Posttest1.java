/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.posttest1;
import java.util.ArrayList;
/**
 *
 * @author ASUS
 */
public class Posttest1 {

    public static void main(String[] args) {
        ArrayList<Motor> mtr = new ArrayList<>();

        mtr.add(new Motor("Scoopy", "20,48 JT"));
        mtr.add(new Motor("Vario", "24,56 JT"));
        mtr.add(new Motor("Beat", "15,63 JT"));
        mtr.add(new Motor("NMAX", "28,54 JT"));
        mtr.add(new Motor("CBR 150", "35,3 JT"));

        for (Motor mt : mtr) {
            System.out.println("Merk Motor " + mt.merk + " dengan harga " + mt.harga + ".");
        }
    }
}
