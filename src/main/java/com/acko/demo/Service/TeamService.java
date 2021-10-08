package com.acko.demo.Service;

import com.acko.demo.DTO.AddTeamRequest;
import com.acko.demo.DTO.DeveloperDTO;
import com.acko.demo.Exception.InvalidRequestException;

public class TeamService {

    @AutoWired
    private TeamStorageService teamStorageService;

    public void createTeam(AddTeamRequest addTeamRequest) throws InvalidRequestException, Exception
    {
        addTeamRequest.validate();
        teamStorageService.storeTeamInfoInDB(addTeamRequest);
    }
}
