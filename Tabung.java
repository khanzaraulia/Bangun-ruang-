/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangun.ruang;

/**
 *
 * @author Khanza
 */
public class Tabung {
    double r, t;

    double volume() {
        double volume = 22.0 / 7.0 * r * r * t;
        System.out.println("Volume Tabung : " + volume + "cm3");
        return volume;
    }
}
