package gl.linpeng.cyclinghub.service.impl;

import gl.linpeng.cyclinghub.service.StatisticService;

/**
 * xingzhe app statistic handler
 */
public class XingzheStatisticService implements StatisticService {

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
