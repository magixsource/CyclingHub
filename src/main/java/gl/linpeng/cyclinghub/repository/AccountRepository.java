package gl.linpeng.cyclinghub.repository;

import gl.linpeng.cyclinghub.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Account repository
 */
public interface AccountRepository extends JpaRepository<Account, Long> {

    /**
     * Find all account that active value is `active`
     *
     * @param active is account active
     * @return collections of account
     */
    List<Account> findAllByActive(Boolean active);

}
