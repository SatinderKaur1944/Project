/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermreviewcodeforpartc;

/**
 * @author satin
 * 
 *
 * PasswordValidator class is responsible for validating passwords
 * based on specific rules. This design follows the Single Responsibility
 * Principle, ensuring that the validation logic is encapsulated in its own
 * class. This makes it easy to update or add new validation rules without
 * changing the main application logic.
 */
public class PasswordValidator {

    /**
     * Validate the given password based on the following rules:
     * 1. The password must be at least length 8.
     * 2. The password must contain at least one special character.
     * 
     * @param password the password to validate
     * @return true if the password is valid, false otherwise
     */
    public static boolean validate(String password) {
        if (password.length() < 10) {
            return false;
        }
        int specialCharCount = 0;
        for (int i = 0; i < password.length(); i++) {
            if (!Character.isLetterOrDigit(password.charAt(i))) {
                specialCharCount++;
            }
        }
        return specialCharCount > 1;
    }
}

