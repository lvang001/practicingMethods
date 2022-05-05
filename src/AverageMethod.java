public class AverageMethod {
    public static void main(String[] args) {
        System.out.println(Average(9,5,12));
        
    }
    
    public static double sum (double x, double y, double z) {
        double total = x + y + z;
        return total; 
    }

    public static double Average (double x, double y, double z) {
        double numTotal = sum(x, y, z);
        double avg = numTotal/3;
        return avg;

    }
}
