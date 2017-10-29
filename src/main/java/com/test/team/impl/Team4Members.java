package com.test.team.impl;

import com.test.character.Man;
import com.test.team.Team;

import java.util.ArrayList;
import java.util.List;

public class Team4Members implements Team {

    private final String name;
    private final List<Man> members = new ArrayList<Man>(4);

    public Team4Members(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addMember(Man man) {
        if (members.size()>=4)
            throw new RuntimeException("Can't add more members to team: " + name);
        members.add(man);

    }

    public void removeMember(Man man) {

    }

    public int memberCount() {
        return members.size();
    }

    public List<Man> getMembers() {
        return null;
    }
}
