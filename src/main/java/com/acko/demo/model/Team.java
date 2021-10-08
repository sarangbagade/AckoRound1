package com.acko.demo.model;

import java.util.List;

public class Team {

    private int teamId;
    private String name;

    private List<Developer> developerList;

    public Team(int teamId, String name, List<Developer> developerList) {
        this.teamId = teamId;
        this.name = name;
        this.developerList = developerList;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Developer> getDeveloperList() {
        return developerList;
    }

    public void setDeveloperList(List<Developer> developerList) {
        this.developerList = developerList;
    }
}
