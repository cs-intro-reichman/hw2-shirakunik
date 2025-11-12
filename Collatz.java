public class Collatz {
	public static void main(String[] args) {
			int limit = Integer.parseInt(args[0]); 
			String mode = args[1];                

			for (int seed = 1; seed <= limit; seed++) {
					int n = seed;

					
					int printed = 0;
					if (mode.equals("v")) {
							System.out.print(seed + " ");
							printed = 1; 
					}

					if (seed == 1) {
							
							if (mode.equals("v")) {
									System.out.print(4 + " ");
									System.out.print(2 + " ");
									System.out.print(1 + " ");
							}
							printed = mode.equals("v") ? 4 : 0;
					} else {
							while (n != 1) {
									if (n % 2 == 0) {
											n = n / 2;
									} else {
											n = 3 * n + 1;
									}
									if (mode.equals("v")) {
											System.out.print(n + " ");
											printed++;
									}
							}
					}

					if (mode.equals("v")) {
							System.out.println("(" + printed + ")");
					}
			}

			System.out.println("Every one of the first " + limit + " hailstone sequences reached 1.");
	}
}
