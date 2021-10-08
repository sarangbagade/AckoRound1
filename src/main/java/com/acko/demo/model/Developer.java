package com.acko.demo.model;

@Data
public class Developer {

    private String name;
    private String phoneNumber;
    private int teamId;

    public Developer(String name, String phoneNumber, int teamId) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.teamId = teamId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }
}
