package daos;

import com.sun.xml.internal.bind.v2.TODO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ToDo extends JpaRepository<ToDo, Integer> {

    List<TODO> findByfkUser(String email);
}
