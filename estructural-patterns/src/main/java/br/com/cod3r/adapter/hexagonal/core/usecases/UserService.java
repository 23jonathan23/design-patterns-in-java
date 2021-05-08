package br.com.cod3r.adapter.hexagonal.core.usecases;

import java.util.List;

import br.com.cod3r.adapter.hexagonal.core.model.User;
import br.com.cod3r.adapter.hexagonal.core.ports.UserRepository;

public class UserService {
	private UserRepository _userRepository;

    public UserService(UserRepository userRepository) {
        _userRepository = userRepository;
    }

    public void saveUser(User user) {
        boolean alreadyUsedEmail = _userRepository.getAll().stream()
            .anyMatch(userDb -> userDb.getEmail().equalsIgnoreCase(user.getEmail()));

        if(alreadyUsedEmail) throw new RuntimeException("Email address already exists!");
        _userRepository.save(user);
    }

    public List<User> getUsers() {
        return _userRepository.getAll();
    }
}
