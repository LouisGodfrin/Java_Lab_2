public class App {
    public static void main(String[] args) throws OutOfRangeException 
    {

        myNumber(12);
    }

    int number, chiffre;

    public static int myNumber(int number) throws OutOfRangeException {
        if (number < 1 || number > 10) {
            throw new OutOfRangeException();
        }

        System.out.println("Works !");
        return (number + 10);
    }

}
