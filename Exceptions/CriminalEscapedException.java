package Exceptions;

public class CriminalEscapedException extends Exception{
    @Override
    public String getMessage(){
        return "NO_CRIMINAL_WITH_POLICEMAN: The criminal escaped!!";
    }
}
