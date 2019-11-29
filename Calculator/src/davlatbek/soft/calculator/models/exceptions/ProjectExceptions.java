package davlatbek.soft.calculator.models.exceptions;

import davlatbek.soft.calculator.models.enums.Exceptions;

public class ProjectExceptions extends Exception{
    Exceptions typeOfExceptions = null;
    String message = "null";

    public ProjectExceptions (Exceptions typeOfExceptions, String message){
        super(message);
        setMessage(message);
        setTypeOfExceptions(typeOfExceptions);
    }

    public String getMessage() {
        return message;
    }

    private void setMessage(String message) {
        this.message = message;
    }

    private Exceptions getTypeOfExceptions() {
        return typeOfExceptions;
    }

    private void setTypeOfExceptions(Exceptions typeOfExceptions) {
        this.typeOfExceptions = typeOfExceptions;
    }

    public void print(){
        System.out.println(getMessage());
    }

    @Override
    public String toString() {
        return "typeOfException = " + getTypeOfExceptions() + "\n\r" +
                "message = \"" + getMessage() + "\"";
    }
}
