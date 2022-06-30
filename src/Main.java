public class Main {
    public static void main(String[] args) throws Exception {
        String input = Canculator.readFromInputStream("input.txt");
        String[] delimiters = new String[]{"'"};
        System.out.println(Canculator.canculate(input,delimiters));
    }
}
