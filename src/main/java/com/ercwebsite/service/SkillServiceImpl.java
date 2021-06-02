package com.ercwebsite.service;

import com.ercwebsite.dto.Skill;
import com.ercwebsite.repository.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillServiceImpl implements SkillService {

    @Autowired
    private final SkillRepository skillRepository;

    public SkillServiceImpl(SkillRepository skillRepository) {
        this.skillRepository = skillRepository;
    }

    @Override
    public Skill createSkill(Skill skill) {
        return skillRepository.insert(skill);
    }

    @Override
    public List<Skill> getAllSkills() {
        return skillRepository.findAll(Sort.by("name").ascending());
    }

    @Override
    public Skill updateSkill(Skill skill) {
        return skillRepository.save(skill);
    }

    @Override
    public void deleteSkill(String id) {
        skillRepository.deleteById(id);
    }
}
