/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fraction;

/**
 *
 * @author JaVa
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fraction ps1=new Fraction(4);
        Fraction ps2=new Fraction(2, 2);
        System.out.println(ps1+" + "+ps2+" = "+ ps1.add(ps2));
        System.out.println(ps1+" - "+ps2+" = "+ ps1.sub(ps2));
    }
}
