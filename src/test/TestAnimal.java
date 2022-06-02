package test;

import domain.Leopard;


 /**
 * The class Test animal
 */ 
public class TestAnimal {
    

/** 
 *
 * Main
 *
 * @param args  the args
 */
    public static void main(String[] args){ 

        Leopard leopard = new Leopard("Thomas");
        System.out.println(leopard);
        leopard.hunt();
        leopard.eat();
        leopard.speak();
        leopard.play();
    }
}
