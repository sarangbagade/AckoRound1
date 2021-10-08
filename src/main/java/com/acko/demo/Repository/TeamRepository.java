package com.acko.demo.Repository;

import com.acko.demo.model.Developer;
import com.acko.demo.model.Team;

import java.util.List;
import java.util.Map;


public class TeamRepository {

    private Map<Integer, Team> teamMap;

    public Map<Integer, Team> getTeamMap() {
        return teamMap;
    }

    public void setTeamMap(Map<Integer, Team> teamMap) {
        this.teamMap = teamMap;
    }
}
