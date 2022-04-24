package Day8;

public class Task1 {
    public static void main(String[] args) {
        String numbers = " ";

        long m = System.currentTimeMillis();
        for (int i = 0; i <= 20000; i++) {
            numbers += i + " ";
        }
        System.out.println((double) (System.currentTimeMillis() - m));


        StringBuilder sb = new StringBuilder();
        m = System.currentTimeMillis();
        for (int i = 0; i <= 20000; i++) {
            sb.append(i + " ");
        }
        System.out.println((double) (System.currentTimeMillis() - m));
        // System.out.println(numbers);
        //System.out.println(sb.toString());
    }
}
