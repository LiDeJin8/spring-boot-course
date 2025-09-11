package top.ldj.boot.config.model;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@Slf4j
class TeamTest {
    @Resource
    private Team team;
    @Test
    void testTeam1(){
        log.info("team: {}", team);
        assertEquals("ldj", team.getLeader());

        assertEquals(team.getPhone().matches("^[0-9]{11}$"), true);

        assertEquals(team.getAge() >= 1 && team.getAge() <= 5, true);

        assertEquals(team.getCreateTime().isBefore(LocalDate.now()), true);
    }

}