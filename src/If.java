public class If {
    public static void main(String[] args) {

        // Using loops with "break":
        int loop = 0;

        while(true) {
            System.out.println("Looping: " + loop);

            if(loop == 3) {
                break;
            }

            loop++;

            System.out.println("Running");
        }
    }
}
