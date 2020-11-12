
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nicole
 */
public class FirstBank {
    public static void main(String[] args) {
        
       Scanner scan = new Scanner(System.in);
       Account nicole = new Account("Nicole dos Anjos Aragao", "FJ073244");
       Account fabio = new Account("Fabio de Souza Faria", "000-xxx");
       UserInterface novo = new UserInterface(fabio, scan);
       
       novo.showMenu();
    }
}
