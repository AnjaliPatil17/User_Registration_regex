import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void firstNameValid() {
        try {
            String validTest = Main.firstName("Anjali");
            assertEquals(validTest, "Validate Successfully");
        }
        catch (InvalidUserException e){
            System.out.println("Exception Occurs" +e);
        }
    }

    @Test
    void lastNameValid() {
        try {
            assertEquals(Main.lastName("patil"), "Validate Successfully");
        }
        catch (InvalidUserException e){
            System.out.println("Exception Occurs" +e);
        }
    }

    @Test
    void emailIdvalid() {
        try {
            assertEquals(Main.emailId("anju1227@gmail.com"), "Validate Successfully");
        } catch (InvalidUserException e) {
            System.out.println("Exception Occurs" + e);
        }
    }

    @Test
    void phoneNovalid() {
        try {
            assertEquals(Main.phoneNo("91 9995810567"), "Validate Successfully");
        } catch (InvalidUserException e) {
            System.out.println("Exception Occurs" + e);
        }
    }

    @Test
    void Passwordvalid() {
        try {
            assertEquals(Main.Password("Sanvi123#"), "Validate Successfully");
        } catch (InvalidUserException e) {
            System.out.println("Exception Occurs" + e);
        }
    }

    @ParameterizedTest
    @ValueSource(strings = {"abc@yahoo.com", "abc-100@yahoo.com","abc.100@yahoo.com","abc111@abc.com","abc-100@abc.net","abc.100@abc.com.au","abc@1.com","abc@gmail.com.com","abc100@gmail.com"})
    void emailMultipleEntry(String emailId){
        try{
            assertEquals(Main.emailId(emailId),"Validate Successfully");
        }
        catch (InvalidUserException e) {
            System.out.println("Exception Occurs" + e);
        }
    }


}



