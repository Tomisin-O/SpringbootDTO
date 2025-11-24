package com.example.springboot_dto_tutorial;

import com.example.springboot_dto_tutorial.model.Location;
import com.example.springboot_dto_tutorial.model.User;
import com.example.springboot_dto_tutorial.repository.LocationRepository;
import com.example.springboot_dto_tutorial.repository.UserRepository;
import com.example.springboot_dto_tutorial.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootDtoTutorialApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDtoTutorialApplication.class, args);
	}

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private LocationRepository locationRepository;

    @Override
    public void run(String...args) throws Exception{

        Location location = new Location();
        location.setPlace("France");
        location.setDescription("France is in Europe");
        location.setLongitude(40.5);
        location.setLatitude(30.4);
        locationRepository.save(location);

        User user1 = new User();
        user1.setFirstName("Bob");
        user1.setLastName("Smith");
        user1.setEmail("BobSMith@gmail.com");
        user1.setPassword("Bob123");
        user1.setLocation(location);
        userRepository.save(user1);

        User user2 = new User();
        user2.setFirstName("Mary");
        user2.setLastName("Smith");
        user2.setEmail("Marysmith@gmail.com");
        user2.setPassword("Mary23");
        user2.setLocation(location);
        userRepository.save(user2);

    }
}
