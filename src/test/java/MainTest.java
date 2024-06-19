import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void firstNameValid() {
        String validTest = Main.firstName("Anjali");
        assertEquals(validTest,"Happy");
    }

    @Test
    void lastNameValid() {
        assertEquals(Main.lastName("Patil"),"Happy");
    }

    @Test
    void emailIdvalid() {
        assertEquals(Main.emailId("anju1227@gmail.com"),"Happy");
    }

    @Test
    void phoneNovalid() {
        assertEquals(Main.phoneNo("91 9995810567"),"Happy");
    }

    @Test
    void Passwordvalid() {
        assertEquals(Main.Password("Sanvi123#"),"Happy");
    }

    @Test
    void firstNameInvalid() {
        String validTest = Main.firstName("12ash");
        assertEquals(validTest,"Sad");
    }

    @Test
    void lastNameInvalid() {
        assertEquals(Main.lastName("PATIl"),"Sad");
    }

    @Test
    void emailIdInvalid() {
        assertEquals(Main.emailId("anju7#@gmail.com"),"Sad");
    }

    @Test
    void phoneNoInvalid() {
        assertEquals(Main.phoneNo("91 995810567"),"Sad");
    }

    @Test
    void PasswordInvalid() {
        assertEquals(Main.Password("snvi123#"),"Sad");
    }

}