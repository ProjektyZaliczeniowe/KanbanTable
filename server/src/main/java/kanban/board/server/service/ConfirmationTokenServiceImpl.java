package kanban.board.server.service;

import kanban.board.server.model.ConfirmationToken;
import kanban.board.server.repository.ConfirmationTokenRepository;
import kanban.board.server.service.interfaces.ConfirmationTokenService;
import org.springframework.beans.factory.annotation.Autowired;

public class ConfirmationTokenServiceImpl implements ConfirmationTokenService {

    @Autowired
    private ConfirmationTokenRepository confirmationTokenRepository;

    @Override
    public ConfirmationToken save(ConfirmationToken confirmationToken) {
        return confirmationTokenRepository.save(confirmationToken);
    }

    @Override
    public ConfirmationToken getByTokenCode(String code) {
        return confirmationTokenRepository.findByTokenCode(code);
    }
}
