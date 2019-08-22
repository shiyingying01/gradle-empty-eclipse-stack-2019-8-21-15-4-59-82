
public class Car{
	String engine;
	String wheels;
   public Car(String engine, String wheels){
      System.out.println( engine + " is on and " + wheels + " are Running"); 
   }
   public static void main(String[] args){
       Car myCar = new Car( "v8","Michelin" );
   }
}
