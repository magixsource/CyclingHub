package gl.linpeng.cyclinghub.service;

/**
 * Application auth handler
 */
public interface AuthService {

    /**
     * Login to application
     *
     * @return true if success
     */
    Object login();

    /**
     * Logout from application
     *
     * @return true if success
     */
    Object logout();
}
