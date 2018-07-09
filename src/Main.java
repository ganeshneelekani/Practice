
 class Singleton
{
    // static variable single_instance of type Singleton
    private static Singleton single_instance = null;
 
    // variable of type String
    public String s;
    public String atr;
 
    // private constructor restricted to this class itself
    private Singleton()
    {
        s = "Hello I am a string part of Singleton class";
    }
    
     public Singleton(String str)
    {
    	 atr =str;
    }
 
    // static method to create instance of Singleton class
    public static Singleton getInstance()
    {
        if (single_instance == null)
            single_instance = new Singleton("abcd");
 
        return single_instance;
    }
}
 
// Driver Class
class Main
{
    public static void main(String args[])
    {
        // instantiating Singleton class with variable x
        Singleton x = Singleton.getInstance();
 
        // instantiating Singleton class with variable y
        Singleton y = Singleton.getInstance();
 
        // instantiating Singleton class with variable z
        Singleton z = Singleton.getInstance();
 
        // changing variable of instance x
        x.atr = (x.atr).toUpperCase();
 
        System.out.println("String from x is " + x.atr);
        System.out.println("String from y is " + y.atr);
        System.out.println("String from z is " + z.atr);
        System.out.println("\n");
 
        // changing variable of instance z
        z.atr = (z.atr).toLowerCase();
 
        System.out.println("String from x is " + x.atr);
        System.out.println("String from y is " + y.atr);
        System.out.println("String from z is " + z.atr);
    }
}