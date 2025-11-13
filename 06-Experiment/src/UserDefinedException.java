/*
6.      IMPLEMENT EXCEPTION HANDLING AND CREATION OF  USER DEFINED EXCEPTIONS
*/

//Built in Exceptions
class Error{
    void ArithmeticDivision(){
        try{
            int a=10;
            int b=0;
            int result=a/b;
            System.out.println("Result : "+result);
        }

        catch (ArithmeticException e){
            System.out.println("Error : "+e.getMessage());
        }

        catch(Exception e){
            System.out.println("Some Error Occur");
        }

        finally {
            System.out.println("Finally Block Executed");
        }
        System.out.println("try-catch-finally block executed");
    }
}


//User defined Exception
class InvalidAge extends Exception{
    public InvalidAge(String msg){
        super(msg);
    }
}

public class UserDefinedException{
    static void ageValid(int age) throws InvalidAge{
        if(age<18){
            throw new InvalidAge("your age is less than 18");
        }

        else{
            System.out.println("you are elligible to vote");
        }
    }

    public static void main(String[] args) {
        Error e= new Error();
        e.ArithmeticDivision();

        try{
            ageValid(18);
        } catch (InvalidAge ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("Program executed successfully");
    }
}
