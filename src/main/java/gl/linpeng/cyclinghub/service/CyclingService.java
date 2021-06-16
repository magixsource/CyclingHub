package gl.linpeng.cyclinghub.service;

import java.util.List;

/**
 * Cycling handler interface
 */
public interface CyclingService {


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
