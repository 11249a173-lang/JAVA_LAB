class InvalidAgeException extends Exception
{
    InvalidAgeException(String message)
    {
        super(message);
    }
}

public class UserDefinedException
{
    public static void main(String[] args)
    {
        int age = 25;

        try
        {
            if(age < 18)
            {
                throw new InvalidAgeException("Age is less than 18. Not eligible to vote.");
            }
            else
            {
                System.out.println("Eligible to vote.");
            }
        }
        catch(InvalidAgeException e)
        {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
