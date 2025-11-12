// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
      // input N and mode
		int N = Integer.parseInt(args[0]);  
        String mode = args[1];               // "v" / "c"
        boolean verbose = mode.equals("v");  

        // seed n-1 
        for (int seed = 1; seed <= N; seed++) {

            long n = seed;   
            int terms = 1;   // counrter for the numbers 

            if (verbose) {
                System.out.print(n);  
            }

            // loop Collatz 
            while (n != 1) {
                if (n % 2 == 0) {    
                    n = n / 2;
                } else {              
                    n = 3 * n + 1;
                }

                terms++; 

                // if verbose
                if (verbose) {
                    System.out.print(" " + n);
                }
            }

  
            if (verbose) {
                System.out.println(" (" + terms + ")"); 
            }
        }

        // finish sentence
        System.out.println();
        System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
    }
}