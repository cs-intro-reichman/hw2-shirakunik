// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
  int N = Integer.parseInt(args[0]);  
        double sum = 0.0;                  
        double sign = 1.0;                

        //  loop
        for (int i = 0; i < N; i++) {

           
            double denominator = 2 * i + 1;

            
            sum += sign * (1.0 / denominator);

          
            sign = -sign;
        }

       
        double approxPi = 4 * sum;

        
        System.out.println("pi according to Java: " + Math.PI);
        System.out.println("pi, approximated:     " + approxPi);
    }
}