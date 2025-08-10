public class WrapperExample2 {
    public static void main(String[] args) {
        //Autoboxing and Unboxing
//Autoboxing(primitive to object automatically)
int x = 5;
Integer y = x;

//Unboxing(boject to primitive automatically)
Integer z = 20;
int w = z;

System.out.println("Autoboxed integer: " + y);
System.out.println("Unboxed int: " + w);

// No need to write .valueOf() or .intValue() — Java does it for you.
    }
}
