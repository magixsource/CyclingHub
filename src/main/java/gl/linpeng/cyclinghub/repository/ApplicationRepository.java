package gl.linpeng.cyclinghub.repository;

import gl.linpeng.cyclinghub.model.Application;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Application repository
 */
public interface ApplicationRepository extends JpaRepository<Application, Long> {
}
