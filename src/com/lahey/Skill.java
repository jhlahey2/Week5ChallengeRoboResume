package com.lahey;

public class Skill {

    //    zero or more skills - each with a Competency Proficiency rating (Fundamental, Novice, Intermediate, Advanced, Expert)

    private String skillName;
    private String competencyRating;

    public Skill(String skillName, String competencyRating) {
        this.skillName = skillName;
        this.competencyRating = competencyRating;
    }

    //*************************************************************************
    //* getters && setters
    //*************************************************************************
    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public String getCompetencyRating() {
        return competencyRating;
    }

    public void setCompetencyRating(String competencyRating) {
        this.competencyRating = competencyRating;
    }







}//end public class Skill
