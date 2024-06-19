/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

/**
 * MidTerm-Exam
 * @author srinivsi
 */

public class StatusUser {
    public void statusDetail(UserStatus status) {
        switch (status) {
            case ZERO:
                System.out.println("User status: Rejected");
                break;
            case ONE:
                System.out.println("User status: Pending");
                break;
            case TWO:
                System.out.println("User status: Processing");
                break;
            case THREE:
                System.out.println("User status: Approved");
                break;
            default:
                System.out.println("NOT VALID CODE");
            break;
        }
    }
    
}