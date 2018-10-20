package com.lahey;
/**
 * @author jack lahey
 */

public class EducationalAchievement {

    private String school;
    private String year;
    private String degree;


    /**
     * Constructor
     *
     * @param school name of school
     * @param year  year graduated
     * @param degree degree earned
     */
    public EducationalAchievement(String school, String year, String degree){

        this.school = school;
        this.year = year;
    }

    /**
     * Get school name
     * @return school name
     */
    public String getSchool() {

        return school;
    }

    /**
     * Set school name
     * @param school
     */
    public void setSchool(String school) {

        this.school = school;
    }

    /**
     * Get year completed
     * @return
     */
    public String getYear() {

        return year;
    }

    /**
     * Set year completed
     * @param year
     */
    public void setYear(String year) {
        this.year = year;
    }

    /**
     * Get degree earned
     * @return
     */
    public String getDegree() {
        return degree;
    }

    /**
     * Set degree earned
     * @param degree
     */
    public void setDegree(String degree) {
        this.degree = degree;
    }


}//public class EducationalAchievement
