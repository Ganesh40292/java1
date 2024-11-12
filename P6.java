class OuterClass {
    private static String outerStaticVariable = "Outer Static Variable";

    
    static class StaticNestedClass {
        void display() {
            System.out.println("Accessing from Static Nested Class: " + outerStaticVariable);
        }
    }
}

public class P6 {
    public static void main(String[] args) {
     
        OuterClass.StaticNestedClass nested = new OuterClass.StaticNestedClass();
        nested.display();
    }
}
