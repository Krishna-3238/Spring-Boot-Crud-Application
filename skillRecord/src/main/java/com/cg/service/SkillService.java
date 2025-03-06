package com.cg.service;

import java.util.List;

import com.cg.model.Skill;

public interface SkillService {
	
	List<Skill> getAllSkills();
	
	Skill getSkillById(Long id);
	Skill addSkill(Skill skill);
	Skill updateSkill(Long id, Skill skill);
	void deleteSkill(Long id);
}
