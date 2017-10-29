package com.test.team.impl;

import com.test.character.Man;
import com.test.team.Team;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class Team4MembersTest {

    @Test
    public void testGetName() {
        Team testTeam = new Team4Members("XYZ");
        assertEquals("XYZ", testTeam.getName());
    }

    @Test
    public void testAdd4Members() {
        Team testTeam = new Team4Members("Falki");
        for (int i = 0; i < 4; i++) {
            testTeam.addMember(Mockito.mock(Man.class));
        }
        assertEquals(4,testTeam.memberCount());
    }

    @Test(expected = RuntimeException.class)
    public void testExceptionOnAddMoreThen4(){
        Team testTeam = new Team4Members("Puszek");
        for (int i = 0; i < 10; i++) {
            testTeam.addMember(Mockito.mock(Man.class));
        }

    }
}
