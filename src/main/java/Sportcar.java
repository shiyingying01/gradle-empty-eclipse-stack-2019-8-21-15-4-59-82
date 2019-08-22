
public class Sportcar {
	String engine;
	String wheels;
	String lights;
   public Sportcar(String lights,String engine, String wheels){
      System.out.println( lights + " are shining, "+engine + " is on and " + wheels + " are Running");
      System.out.println(engine + " is overload and " + wheels + " are super running!");
   }
   public static void main(String[] args){
	   Sportcar myCar = new Sportcar("lights", "v8","Michelin" );
   }
}
