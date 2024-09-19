/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matematikaa;

/**
 *
 * @author akriz
 */
public class MatematikaaInheritance {
    public static void main(String [] args){
        Matematikaa mtk = new Matematikaa();
        System.out.println("Pertambahan : 27 + 90 = "+ mtk.pertambahan(27, 90));
        System.out.println("Pengurangan : 16 - 13 = "+ mtk.pengurangan(16, 13));
        System.out.println("Pertkalian : 15 + 9 = "+ mtk.perkalian(15, 9));
        System.out.println("Pembagian : 500 / 6 = "+ mtk.pembagian(500, 6));
    }
}
