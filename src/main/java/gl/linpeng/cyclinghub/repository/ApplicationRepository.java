package gl.linpeng.cyclinghub.repository;

import gl.linpeng.cyclinghub.model.Application;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Application repository
 */
public interface ApplicationRepository extends JpaRepository<Application, Long> {

    /**
     * find all application by active value
     *
     * @param active is application active
     * @return collections of application
     */
    List<Application> findAllByActive(Boolean active);
}
