package rubikteam.kanban.reponsitory;

import org.springframework.data.repository.CrudRepository;
import rubikteam.kanban.model.User;

public interface UserRepo extends CrudRepository<User, Integer> {

}
