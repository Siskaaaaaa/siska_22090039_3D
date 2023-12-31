/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pactive.oop;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class DuckSimulator {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("pilih yang mana : ");
        System.out.println("1. Mallard Duck :");
        System.out.println("2.Rubber Duck : ");
        System.out.println("3. Decoy Duck :");
        System.out.println("4. Model Duck: ");
        int pilih_sapi = scanner.nextInt();
        
        Duck duck = null;
  
        if(pilih_sapi == 1){
            duck = new MallardDuck();
        }else if(pilih_sapi == 2){
            duck = new RubberDuck();
        }else if(pilih_sapi == 3 ){
            duck = new DecoyDuck();
        }else if(pilih_sapi == 4){
            duck = new ModelDuck();
        }else {
            System.out.println("pilih sesuai nomer");
            return;
        }
        System.out.println("anda telah memilih"+ duck.getClass().getSimpleName());
        
        duck.performQuack();
        duck.performFly();
    }
}
