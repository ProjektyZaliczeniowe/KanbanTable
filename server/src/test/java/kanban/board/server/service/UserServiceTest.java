package kanban.board.server.service;

import kanban.board.server.model.User;
import kanban.board.server.service.interfaces.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void shouldSaveUser() {
        User user = userService.registerUser(new User("User1a", "email@email.com", "haslo"));
        assertNotNull(user);
        assertNotNull(user.getId());
    }
}
