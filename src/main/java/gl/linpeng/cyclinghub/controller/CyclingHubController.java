package gl.linpeng.cyclinghub.controller;

import gl.linpeng.cyclinghub.model.Application;
import gl.linpeng.cyclinghub.repository.ApplicationRepository;
import gl.linpeng.cyclinghub.util.HttpUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cycling")
public class CyclingHubController {

    private static final Log logger = LogFactory.getLog(CyclingHubController.class);

    @Autowired
    ApplicationRepository applicationRepository;

    @GetMapping(value = "/check")
    public Boolean checkNetwork() {
        // get all application
        List<Application> applications = applicationRepository.findAll();
        // for each url
        try {
            for (Application application : applications) {
                String url = application.getUrl();
                // ping url
                logger.info("PING " + url);
                HttpUtils.ping(url);
            }
        } catch (Exception e) {
            logger.error(e.getMessage());
            return false;
        }
        return true;
    }

    @GetMapping("/sync")
    public Boolean sync() {
        // get all account active = true
        // get all activity record of account by application-adapter

        // download fit file to local

        // upload to `STATISTIC` platform by application-adapter

        return true;
    }

}
