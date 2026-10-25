package in.strikes.profileDemo;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("prod")
public class NotificationServiceImpl implements NotificationService{

    @Override
    public String send() {
//        Real notification is sent (Email/SMS)
        return "Here is a notification.";
    }
}
