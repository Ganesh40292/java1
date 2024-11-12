
class Animal {
    void eat() {
        System.out.println("Animal is eating.");
    }
}


interface Swimmer {
    void swim();
}


interface Flyer {
    void fly();
}


class Penguin extends Animal implements Swimmer, Flyer {
    @Override
    public void swim() {
        System.out.println("Penguin is swimming.");
    }

    @Override
    public void fly() {
        System.out.println("Penguin cannot fly.");
    }
}

public class P7 {
    public static void main(String[] args) {
  
        Penguin penguin = new Penguin();
        
       
        penguin.eat();   
        penguin.swim();   
        penguin.fly();   
    }
}
