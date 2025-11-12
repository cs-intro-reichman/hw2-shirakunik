public class TimeCalc {
    public static void main(String[] args) {
        // input a hour + number of minutes to add 
        String time = args [0];
        int min = Integer.parseInt (args [1]);

       // casting to integers and hours and minutes 
       int hour = Integer.parseInt (time.substring (0,2));
       int minutes = Integer.parseInt (time.substring (3,5));
       
        // compute the new hours and minutes 
        int totalmin = ((hour * 60) + minutes + min); 
        int newhour = ((totalmin/60) % 24);
        int newmin = (totalmin % 60);
        
        // make it a new time 
         String hourStr;
        if (newhour < 10) {
           hourStr = "0" + newhour;
         } else {
             hourStr = "" + newhour;
         }   

         String minStr;
         if (newmin < 10) {
         minStr = "0" + newmin;
         } else {
         minStr = "" + newmin;
         }
         System.out.println(hourStr + ":" + minStr);

         }
       }
