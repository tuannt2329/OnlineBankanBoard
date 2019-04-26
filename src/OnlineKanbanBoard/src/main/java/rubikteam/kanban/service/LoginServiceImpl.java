package rubikteam.kanban.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import rubikteam.kanban.model.User;
import rubikteam.kanban.reponsitory.UserRepo;

import java.util.List;


@Service
@Transactional
public class LoginServiceImpl implements LoginService {
    @Autowired
    UserRepo loginRepository;

    @Override
    public List<User> getAccount(String username, String password) {

        return (List<User>) loginRepository.findAll();
    }

    @Override
    public List<User> getAccount2(String username, String password) {

        return loginRepository.find(username,password);
    }
}
