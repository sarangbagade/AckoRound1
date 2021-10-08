package com.acko.demo.Service;

import com.acko.demo.Repository.TeamRepository;
import com.acko.demo.integration.NotificationServiceIntegration;
import com.acko.demo.model.Developer;
import com.acko.demo.model.Team;

public class DeveloperService {

    private TeamRepository teamRepository;
    private NotificationServiceIntegration notificationServiceIntegration;

    public void alertDeveloper(int teamId)
    {
        Team team = teamRepository.getTeamMap().get(teamId);
        Developer developer = team.getDeveloperList().get(0);
        notificationServiceIntegration.sendMessage(developer.getPhoneNumber(), "message");
        // message can be loaded from the config file
    }
}
