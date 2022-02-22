package activities;

public class Activity8 {
    public static void main(String[] args) {

        try{
            Activity8.exceptionTest("Will print to console");
            Activity8.exceptionTest(null);

            //this will not be executed as the catch block is already reached
            Activity8.exceptionTest("Won't execute");
        }
        catch(CustomException e){
            System.out.println("Inside catch block: " + e.getMessage());
        }
    }

    public static void exceptionTest(String value) throws CustomException {

        if (value == null) {
            throw new CustomException("String value is null");
        } else {
            System.out.println("Entered String: " + value);
        }
    }
}

class CustomException extends Exception{
    private String message;

    public CustomException(String message){
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

}
