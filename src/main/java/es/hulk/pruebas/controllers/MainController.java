package es.hulk.pruebas.controllers;

import es.hulk.pruebas.model.User;
import es.hulk.pruebas.repository.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MainController {

    private final UserRepository userRepository;

    public MainController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RequestMapping("/helloworld")
    public ResponseEntity<String> helloworld() {
        userRepository.save(new User(1L, "Hello", "World"));
        return ResponseEntity.ok("a");
    }

}
