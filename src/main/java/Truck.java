
public class Truck {
	String payload;
	String engine;
	String wheels;
	String lights;
   public Truck(String payload,String lights,String engine, String wheels){
      System.out.println("tips, "+engine+" is on and  "+engine+" are running!");
      System.out.println(payload +" is loading goods");
   }
   public static void main(String[] args){
	   Truck myCar = new Truck("payload","lights", "v8","Michelin" );
   }
}
