/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeklaundry;

/**
 *
 * @author Lenovo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Viewdepan vd = new Viewdepan();
        vd.setVisible(true);
        vd.pack();
        vd.setDefaultCloseOperation(Viewdepan.EXIT_ON_CLOSE);
        vd.setLocationRelativeTo(null);
        vd.setTitle("Login Admin");
    }
    
}
