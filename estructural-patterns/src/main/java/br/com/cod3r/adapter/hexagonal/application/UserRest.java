package br.com.cod3r.adapter.hexagonal.application;

import java.util.List;
import java.util.Map;

import br.com.cod3r.adapter.hexagonal.core.model.User;
import br.com.cod3r.adapter.hexagonal.core.ports.UserRepository;
import br.com.cod3r.adapter.hexagonal.core.usecases.UserService;
import br.com.cod3r.adapter.hexagonal.infrastructure.UserMemoryDatabaseAdapter;

public class UserRest {
	private UserService _userFacade;

	public UserRest() {
		UserRepository userRepository = new UserMemoryDatabaseAdapter();
		_userFacade = new UserService(userRepository);
	}

	public Integer post(Map<String, String> values) {
		try {
			User user = new User(values.get("name"), values.get("email"), values.get("password"));
			_userFacade.saveUser(user);
		} catch(Exception e)  {
			System.out.println(e.getMessage());
			return 400;
		}

		return 200;
	}
	
	public Integer get() {
		List<User> users = _userFacade.getUsers();
		users.stream().forEach(System.out::println);
		return 200;
	}
}
