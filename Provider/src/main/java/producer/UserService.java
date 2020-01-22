package producer;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    public User findUser(String userId) {
        return User.builder()
                .name("Paco")
                .city("Madrid")
                .age(22)
                .build();
    }
}
