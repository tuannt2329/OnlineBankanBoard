package rubikteam.kanban.service;

import rubikteam.kanban.model.User;

import java.util.List;

public interface LoginService {
    public List<User> getAccount(String username, String password);

    public List<User> getAccount2(String username, String password);

}
