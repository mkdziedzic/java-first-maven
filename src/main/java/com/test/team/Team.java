package com.test.team;

import com.test.character.Man;

import java.util.List;

public interface Team {

    String getName();
    void addMember(Man man);
    void removeMember(Man man);
    int memberCount();
    List<Man> getMembers();
}
