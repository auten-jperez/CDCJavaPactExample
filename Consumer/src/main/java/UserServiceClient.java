import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.client.RestTemplate;

public class UserServiceClient {

    private final RestTemplate restTemplate;

    public UserServiceClient(@Value("${user-service.base-url}") String baseUrl) {
        this.restTemplate = new RestTemplateBuilder().rootUri(baseUrl).build();
    }

    public User getUser(String id) {
        return restTemplate.getForObject("/users/" + id, User.class);
    }

}