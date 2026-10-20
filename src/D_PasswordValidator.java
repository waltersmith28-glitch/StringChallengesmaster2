/***
 * Problem: You are creating a password validation system.
 * A valid password must meet the following requirements:
 * It must contain at least one uppercase letter,
 * It must contain at least one number,
 * It must not contain the word "password" (case insensitive).
 * Write a function that checks if a password is valid and prints "Valid password"
 * or "Invalid password" based on the rules.
 * Expected output: Valid password: false
 */

public class D_PasswordValidator {

    public static void main(String[] args) {
        D_PasswordValidator d = new D_PasswordValidator();
    }

    public D_PasswordValidator() {
        String password = "MyPassw0rd";
        System.out.println("Vaalid password: " + isValidPassword(password));  // Output: Invalid password (false)
    }

    public boolean isValidPassword(String password) {
        /* TODO: your code goes here */
        boolean upper = false;
        boolean number = false;

        for(int x = 0; x < password.length(); x++){
            char c = password.charAt(x);
            if(c >= 'A' && c <= 'Z'){
                upper = true;
            }
            if(c >= '0' && c <= '9'){
                number = true;
            }
        }
        boolean haspassword = true;
        if (password.contains("password") || password.contains("pa55word") || password.contains("pa55w0rd")
                || password.contains("Pa55word") || password.contains("Pa5sword") || password.contains("Pas5word")
                ||password.contains("Pa55w0rd") || password.contains("pas5word") || password.contains("passw0rd") ||
                password.contains("Passw0rd") || password.contains("pa5sword") || password.contains("Password")){
            haspassword = false;
        }
        return upper && number && haspassword;



        //return true; // this is a temporary return to avoid errors
    }

}
