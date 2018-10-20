package com.lahey;

public class Skill {

    //    zero or more skills - each with a Competency Proficiency rating (Fundamental, Novice, Intermediate, Advanced, Expert)

    private String skillName;
    private String competencyRating;

    /**
     * Constructor
     * @param skillName
     * @param competencyRating
     */
    public Skill(String skillName, String competencyRating) {
        this.skillName = skillName;
        this.competencyRating = competencyRating;
    }

    //*************************************************************************
    //* getters && setters
    //*************************************************************************

    /**
     * Get skill name
     * @return
     */
    public String getSkillName() {
        return skillName;
    }

    /**
     * Set skill name
     * @param skillName
     */
    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    /**
     * Get competency rating
     * @return
     */
    public String getCompetencyRating() {
        return competencyRating;
    }

    /**
     * Set cmpetency rating
     * @param competencyRating
     */
    public void setCompetencyRating(String competencyRating) {
        this.competencyRating = competencyRating;
    }


}//end public class Skill
