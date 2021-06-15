package gl.linpeng.cyclinghub.handle;

/**
 * Application auth handler
 */
public interface AuthHandler {

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
