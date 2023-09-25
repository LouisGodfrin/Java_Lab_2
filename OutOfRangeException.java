
public class OutOfRangeException extends Exception
{

    public OutOfRangeException()
    {
        this("Except a number between 1 and 10");
    }

    public OutOfRangeException(String message)
    {
        super(message);
    }

}