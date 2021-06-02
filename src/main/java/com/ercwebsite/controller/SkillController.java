package com.ercwebsite.controller;


import com.ercwebsite.dto.Skill;
import com.ercwebsite.service.SkillServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/skills")
public class SkillController {

    @Autowired
    private final SkillServiceImpl skillServiceImpl;

    public SkillController(SkillServiceImpl skillServiceImpl) {
        this.skillServiceImpl = skillServiceImpl;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Skill>> getAllSkills() {
        return new ResponseEntity<>(skillServiceImpl.getAllSkills(), HttpStatus.OK);
    }
}
