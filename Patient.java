/**
 * Lab 9 Inheritance & 10
 * TKRB
 * 
 * Task: A class Patient that extends Person9
 * The Patient class should add a feature 'social security number' to Person.
 * The 'social security number' must have a format ddd-dd-dddd
 * where each 'd' stands for a digit.
 * (You don't have to check for the format.)
 * 
 * Implement all methods in documentation
 * Hint: Don't forget to use super
 * 
 * in lab 9 & 10-1 'return false' is used
 * in lab 10-2 changed to 'throw exception'
 * 
 */

public class Patient extends Person9 {

    private String ssn;

    // Person: public String getName()                  // Inheritance
    // Person: public void setName(String newName)      // Inheritance

    /**
     * Default constructor
     */
    public Patient() {
        super(); // Inheritate setName
        setSsn("No SSN yet");                   // ???("000-00-0000")
    }

    /**
     * Create a Patient with name aName and
     * the default social security number '000-00-0000'
     * 
     * @param aName - the name of the Patient
     */
    public Patient(String aName) {
        super.setName(aName);                          // why setName not getName??? // Jessica directly super(aName)
        this.setSsn("000-00-0000");             // Correct???
    }

    /**
     * Create a Patient with name aName and
     * the social security number aSsn
     * 
     * @param aName - Patient's name
     * @param aSsn  - Patient's ssn
     */
    public Patient(String aName, String aSsn) {
        super.setName(aName);           // Jessica super(aName)
        // add exception
        if(!isValidSsn(aSsn)){
            throw new SSNFormatException("Wrong SSN format.");
        }
        setSsn(aSsn);
    }

    /**
     * Set the social security number of this Patient to newSsn
     * 
     * @param newSsn
     */
    public void setSsn(String newSsn) {
        ssn = newSsn;
    }

    /**
     * Get the social security number of this Patient.
     * 
     * @return the social security number of this Patient
     */
    public String getSsn() {
        return ssn;
    }

    /**
     * Get a string represenation of this Patient
     * 
     * @return a string representation of this Patient.
     */
    @Override
    public String toString() {                          // Override
        return super.toString() + "\nSSN: " + ssn;      // Jessica getSsn();
    }

    /**
     * Determine if this Patient is equal to otherObj
     * 
     * @param otherObj - the object to determine equality with
     * @return true if this Patient is equal to otherObj
     */
    @Override
    public boolean equals(Object otherObj) {             // Override
        if (otherObj == null) {
            throw new IllegalArgumentException("Input object must not be null");
        }

        if (getClass() != otherObj.getClass()) {         // check if same type
            // (ie. the objects are of the same class)
            return false;
        }
        // if same class, then type cast
        Patient otherPatient = (Patient) otherObj;       // Type cast, from Object to Patient Type.
        return super.equals(otherObj) && ssn.equals(otherPatient.ssn);  // Jessica this.ssn
    }

    /**
     * Lab 10
     * Add a static boolean method isValidSsn(String aSsn)
     * This method must check
     * whether aSsn conforms to the template 'ddd-dd-dddd',
     * where every 'd' in the template stands for
     * a digit and the '-' for a '-' character.
     * Create a class PatientTest and add tests for your new method
     */

    // !!! with static, the method could be called directly...
    // ..without the new: ExampleClass instance = new ExampleClass();
    // see the according JUnit test for details
    public static boolean isValidSsn(String aSsn) {
        if (aSsn == null) {
            return false;
        } else if (aSsn.length() != 11){
            return false;
        }

        // Create an array
        char[] ssnArray = new char[aSsn.length()];
        for (int i = 0; i < aSsn.length(); i++){
            ssnArray[i] = aSsn.charAt(i);
        }
        
        for(int i = 0; i < ssnArray.length; i++){
            if (i == 3 || i == 6){
                if (ssnArray[i] != '-') {
                    return false;
                }
            } else {
                if (!Character.isDigit(ssnArray[i])){    // Character class method
                    return false;
                }
            }
        }
        return true;
    }
}
