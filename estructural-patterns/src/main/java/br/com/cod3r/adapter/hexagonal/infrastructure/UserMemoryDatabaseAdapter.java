package br.com.cod3r.adapter.hexagonal.infrastructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.cod3r.adapter.hexagonal.core.ports.UserRepository;
import br.com.cod3r.adapter.hexagonal.core.model.User;

public class UserMemoryDatabaseAdapter implements UserRepository {
	
    private Map<String, User> _memoryUsers = new HashMap<String, User>();
	
    @Override
    public void save(User user) {
        _memoryUsers.put(user.getEmail(), user);
    }

    @Override
    public List<User> getAll() {
        return new ArrayList<User>(_memoryUsers.values());
    }
}
