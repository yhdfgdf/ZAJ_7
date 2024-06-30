import java.util.Scanner;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static int[] numbers = new int[10];

    public static void main(String[] args) {

        fillArray();

    }

    public static int readNumber() throws NegativeNumberException {
        Scanner n = new Scanner(System.in);
        int liczba = n.nextInt();
        if(liczba < 0){
            throw new NegativeNumberException("Negative numbers are not allowed");
        }
        return n.nextInt();
    }

    public static void fillArray(){
        try{
            numbers.add(readNumber());
        }catch (Exception e){
            numbers.add(0);
            e.println("Negative numbers are not allowed");
        }
    }
}