package domain;


 /**
 * The class Leopard extends predator
 */ 
public class Leopard extends Predator {
    
    private String kind;
    

/** 
 *
 * Leopard
 *
 * @param name  the name
 * @param weight  the weight
 * @param kind  the kind
 */
    public Leopard(String name, int weight, String kind){ 

        this.name=name;
        this.weight=weight;
        this.kind=kind;
    }
    

/** 
 *
 * Leopard
 *
 */
    public Leopard(){ 

        this("Fluffy", 7, "just a leopard");
    }


/** 
 *
 * Leopard
 *
 * @param name  the name
 */
    public Leopard(String name) { 

        this(name, 7, "just a leopard");
    }
    

/** 
 *
 * Play
 *
 */
    public void play(){ 

        System.out.println("Loepard is playing...");
    }

    @Override

/** 
 *
 * Hunt
 *
 */
    public void hunt() { 

        System.out.println("Leopard hunting for a cat");
    }

    @Override

/** 
 *
 * To string
 *
 * @return String
 */
    public String toString() { 

        return super.toString()+"\nKind:\t"+this.kind+"\n\nThis is Leoprad!";
    }

    @Override

/** 
 *
 * Speak
 *
 */
    public void speak() { 

        System.out.println("Meow! Meow!");
    }

    @Override

/** 
 *
 * Eat
 *
 */
    public void eat() { 

        System.out.println("Leopard eats meat...");
    }
    
    
}
