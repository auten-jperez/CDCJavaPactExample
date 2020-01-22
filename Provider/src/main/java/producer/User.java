package producer;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {
    private String name;
    private String city;
    private int age;
}