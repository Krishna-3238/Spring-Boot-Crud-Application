package com.cg.service;


import com.cg.exception.SkillAlreadyExistsException;
import com.cg.exception.SkillNotFoundException;
import com.cg.model.Skill;
import com.cg.repository.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillServiceImpl implements SkillService {

    @Autowired
    private SkillRepository skillRepository;

    @Override
    public List<Skill> getAllSkills() {
        return skillRepository.findAll();
    }

    @Override
    public Skill getSkillById(Long id) {
        return skillRepository.findById(id)
                .orElseThrow(() -> new SkillNotFoundException("Skill not found with id: " + id));
    }

    @Override
    public Skill addSkill(Skill skill) {
        if (skillRepository.existsByName(skill.getName())) {
            throw new SkillAlreadyExistsException("Skill '" + skill.getName() + "' already exists!");
        }
        return skillRepository.save(skill);
    }

    @Override
    public Skill updateSkill(Long id, Skill updatedSkill) {
        Skill existingSkill = getSkillById(id);
        existingSkill.setName(updatedSkill.getName());
        existingSkill.setLevel(updatedSkill.getLevel());
        existingSkill.setCategory(updatedSkill.getCategory());
        return skillRepository.save(existingSkill);
    }

    @Override
    public void deleteSkill(Long id) {
        skillRepository.deleteById(id);
    }
}

