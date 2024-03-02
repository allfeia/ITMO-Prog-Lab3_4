package Exceptions;
//unchecked exception
public class BadClothesException extends RuntimeException{
    @Override
    public String getMessage(){
        return "POLICEMAN_IN_BAD_CLOTHES: why policeman looks like your grandmom?";
    }

}
