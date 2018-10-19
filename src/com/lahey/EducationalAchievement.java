package com.lahey;
/**
 * @author jack lahey
 */

public class EducationalAchievement {

    private String school;
    private String year;
    private String degree;


    public EducationalAchievement(String school, String year, String degree){

        this.school = school;
        this.year = year;
        this.degree = degree;

    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }


}
