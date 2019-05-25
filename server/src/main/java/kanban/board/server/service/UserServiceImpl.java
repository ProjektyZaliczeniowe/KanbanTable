package kanban.board.server.service;

import kanban.board.server.model.User;
import kanban.board.server.repository.UserRepository;
import kanban.board.server.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User getUserById(String id) {
        return userRepository.findById(id).isPresent() ? userRepository.findById(id).get() : null ;
    }

    @Override
    public User registerUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUserByLogin(String login) {
        return userRepository.findByLogin(login);
    }

    @Override
    public User getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public void deleteUser(User user){
        userRepository.delete(user);
    }

}
