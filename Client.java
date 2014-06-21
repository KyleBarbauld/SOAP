import beer.*;

public class Client {
   public static void main(String[] args) {
      BeerService service = new BeerService();
      Beer port = service.getBeerPort();
      try {
         System.out.println(port.getMethods());
        // System.out.println(port.HelloWorld());
         System.out.println(port.getCheapest());
         System.out.println(port.getCostliest());
         System.out.println(port.getPrice("Bud"));
         System.out.println(port.getPrice("Coors"));
         System.out.println(port.getPrice("Corona"));
         System.out.println(port.getPrice("Genesee"));
         System.out.println(port.getPrice("Guiness Draught"));
         System.out.println(port.getPrice("Labatt"));  
         System.out.println(port.getPrice("Sam Adams"));                
         System.out.println(port.getBeers());
         
         
      } catch(Exception e) {
      
      }
   }
}