package gl.linpeng.cyclinghub.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/cycling")
public class CyclingHubController {

    @GetMapping("/check")
    public Boolean checkNetwork() {
        // get all application
        // for each url
        // ping url
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
