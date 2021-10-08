package com.acko.demo.Controller;

import com.acko.demo.Service.DeveloperService;

public class DeveloperController {

    private DeveloperService developerService;

    @PostMapping("/alert")
    public ResponseEntity<> alert(@RequestParam @NotNull int teamId)
    {
        try {
            developerService.alertDeveloper(teamId);
            //return success response
        } catch(Exception e) {
            log.error("error in alerting the developer");
            // return failure response
        }
    }
}
