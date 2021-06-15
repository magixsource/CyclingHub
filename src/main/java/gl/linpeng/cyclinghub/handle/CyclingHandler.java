package gl.linpeng.cyclinghub.handle;

import java.util.List;

/**
 * Cycling handler interface
 */
public interface CyclingHandler {


    /**
     * Get all activities by account and application
     *
     * @return activities
     */
    List getAllActivities();

    /**
     * Download fit file
     *
     * @return fit file
     */
    Object downloadFitFile();

}
