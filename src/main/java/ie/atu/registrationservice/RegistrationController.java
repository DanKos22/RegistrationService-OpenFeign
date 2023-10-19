package ie.atu.registrationservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {

    private NotificationServiceClient notificationServiceClient;

    @Autowired
    public RegistrationController(NotificationServiceClient notificationServiceClient){
        this.notificationServiceClient = notificationServiceClient;
    }

    // Define a Registration Endpoint
    @PostMapping("/confirm")

    // Method to handle user registration requests
    public String confirmDetails(@RequestBody UserDetails user){
        String ConfirmationMessage = String.format("Received details for %s with email %s", user.getName(), user.getEmail());
        return ConfirmationMessage;
    }

    //@PostMapping("/confirm")
    public String notify(@RequestBody UserDetails user){

        String notify = notificationServiceClient.SomeDetails(user);
        return notify;
    }
}
