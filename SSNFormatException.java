/**
 * Lab 10-2
 * 
 * Create an exception class SSNFormatException which extends Exception. 
 * Your Patient class should throw an SSNFormatException 
 * whenever an invalid social security number is assigned to a Patient. 
 * Please change your Patient class accordingly.
 * 
 */

public class SSNFormatException extends Exception{
    
    public SSNFormatException(String errorMSG){
        super(errorMSG);
    }

}