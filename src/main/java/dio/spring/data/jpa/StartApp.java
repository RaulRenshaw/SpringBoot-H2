package dio.spring.data.jpa;

import dio.spring.data.jpa.model.User;
import dio.spring.data.jpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;
    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setName("Raul");
        user.setUserName("vitor");
        user.setPassword("brito");

        userRepository.save(user);

        for (User u : userRepository.findAll()){
            System.out.println(u);
        }
    }
}
