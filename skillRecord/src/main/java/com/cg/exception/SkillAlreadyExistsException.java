package com.cg.exception;

public class SkillAlreadyExistsException extends RuntimeException {
    public SkillAlreadyExistsException(String message) {
        super(message);
    }
}
