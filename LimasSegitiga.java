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
public class LimasSegitiga {
     double la, tl;

    double volume() {
        double volume = 1.0 / 3.0 * la * tl;
        System.out.println("Volume Limas Segitiga : " + volume + "cm3");
        return volume;
    }
}
