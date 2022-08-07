/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boxoyunu;

/**
 *
 * @author Samsung
 */
public class BoxOyunu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Fighter marc = new Fighter("Marc", 25, 100, 90, 40);
        Fighter alex = new Fighter("Alex", 25, 95, 100, 30);
        Match match = new Match(marc, alex, 90, 100);
        match.run();
    }

}
