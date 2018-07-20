public class BoardGameClient
{

 public static void main (String []args)
 {
 
 BoardGame bg1 = new BoardGame("Monopoly",10, true);
 BoardGame bg2 = new BoardGame("Trouble",15,true);
 
 System.out.println(bg1);
 System.out.println(bg2);
 
 if(bg1.equals(bg2))
 System.out.println("bg1 and bg2 are  equal");
 else
 System.out.println("bg1 and bg2 are not equal");

bg2.setDescription("Monopoly");
System.out.println("Description for bg2 has changed");

if(bg1.equals(bg2))
 System.out.println("bg1 and bg2 are  equal");
 else
 System.out.println("bg1 and bg2 are not equal");
 
  System.out.println();
 System.out.println("Coded by Juan Aguirre");

}
}
 