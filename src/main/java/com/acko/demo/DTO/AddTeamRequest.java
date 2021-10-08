package com.acko.demo.DTO;

import com.acko.demo.Exception.InvalidRequestException;

import java.util.List;

@Data
public class AddTeamRequest {

    private TeamDetailsDTO team;
    private List<DeveloperDTO> developers;

    public void validate() throws InvalidRequestException
    {
        for(DeveloperDTO developerDTO : developers)
        {
            developerDTO.validate();
        }

    }

    public TeamDetailsDTO getTeam() {
        return team;
    }

    public void setTeam(TeamDetailsDTO team) {
        this.team = team;
    }

    public List<DeveloperDTO> getDevelopers() {
        return developers;
    }

    public void setDevelopers(List<DeveloperDTO> developers) {
        this.developers = developers;
    }
}
