package com.ercwebsite.service;

import com.ercwebsite.dto.Skill;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SkillService {

    Skill createSkill(Skill skill);

    List<Skill> getAllSkills();

    Skill updateSkill(Skill skill);

    void deleteSkill(String id);


}
