package com.acko.demo.Controller;

import com.acko.demo.DTO.AddTeamRequest;
import com.acko.demo.Exception.InvalidRequestException;
import com.acko.demo.Service.TeamService;


public class TeamsController {

    @Autowired
    private TeamService teamService;

    @PostMapping("/teams")
    public void addTeam(@RequestBody AddTeamRequest addTeamRequest)
    {
        try {
            teamService.createTeam(addTeamRequest);
        } catch(InvalidRequestException e) {
            log.error("error in creating teams. invalid request");
            return
        } catch(Exception e) {
            log.error("error in creating teams.");
        }
    }
}
