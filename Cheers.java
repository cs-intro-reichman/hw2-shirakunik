// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    // input a string and int number 
             String name = args [0];
             int n = Integer.parseInt(args [1]); 
             name = name.toUpperCase ();

             // make the loops
         for ( int i = 0; i<name.length(); i++) {
             char ch = name.charAt(i);
         if ( "EFHILMNORSX".indexOf(ch) >=0 ) {
                  System.out.println( "Give me an " + ch + ": " + ch + "!");
           } else { 
                System.out.println( "Give me a " + ch + ": " + ch + "!");
           } 
        } 
         System.out.println( "What does that spell?");

         for (int j = 0; j<n; j++){
                System.out.println(  "name!!!");
         }
           }
        }