package com.acko.demo.Service;

import com.acko.demo.DTO.AddTeamRequest;
import com.acko.demo.Repository.TeamRepository;
import com.acko.demo.model.Developer;
import com.acko.demo.model.Team;
import com.acko.demo.persistence.DeveloperDao;
import com.acko.demo.persistence.TeamDao;

import java.util.ArrayList;
import java.util.List;

@Component(scope = )
public class TeamStorageService {

    private TeamDao teamDao;
    private DeveloperDao developerDao;
    private TeamRepository teamRepository;

    @Transactional
    public void storeTeamInfoInDB(AddTeamRequest addTeamRequest)
    {
        final int teamId = teamDao.addTeam(addTeamRequest.getTeam());
        List<Developer> developerList = new ArrayList<Developer>();
        addTeamRequest.getDevelopers().forEach(d -> developerList.add(new Developer(d.getName(), d.getPhoneNumber(), teamId)));
        developerDao.addDevelopers(developerList);

        Team team = new Team(teamId, addTeamRequest.getTeam().getName(), developerList);
        teamRepository.getTeamMap().put(teamId, team);
    }
}
