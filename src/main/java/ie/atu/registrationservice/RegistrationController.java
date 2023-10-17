package ie.atu.registrationservice;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {

    // Define a Registration Endpoint
    @PostMapping("/confirm")

    // Method to handle user registration requests
    public String confirmDetails(@RequestBody UserDetails user){
        String ConfirmationMessage = String.format("Received details for %s with email %s", user.getName(), user.getEmail());
        return ConfirmationMessage;
    }
}
