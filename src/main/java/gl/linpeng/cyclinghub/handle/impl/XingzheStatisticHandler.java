package gl.linpeng.cyclinghub.handle.impl;

import gl.linpeng.cyclinghub.handle.StatisticHandler;

/**
 * xingzhe app statistic handler
 */
public class XingzheStatisticHandler implements StatisticHandler {

    /**
     * POST
     * multipart/form-data;
     * http://www.imxingzhe.com/api/v4/upload_fits
     * Form Data -:\
     * title: xx
     * device: xx
     * sport: xx
     * upload_file_name: xx
     *
     * @return
     */
    @Override
    public Boolean uploadFitFile() {
        return null;
    }
}
