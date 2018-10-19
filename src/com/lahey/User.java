package com.lahey;
/**
 * @author jack lahey
 */

import java.util.ArrayList;


public class User {

    //static variables
    private static int userCounter = 501;

    //class variables
    private ArrayList<EducationalAchievement> educationalAchievementList;
    private ArrayList<WorkExperience> workExperienceList;
    private ArrayList<Skill> skillList;
    private String userName;
    private String userEmail;
    private String userPhone;
    private int userID;


    //*********************************************************************
    //* constructor
    //*********************************************************************
    public User(String name, String email, String phone){

        educationalAchievementList = new ArrayList<EducationalAchievement>();
        workExperienceList = new ArrayList<WorkExperience>();
        skillList = new ArrayList<Skill>();
        this.userName = name;
        this.userEmail = email;
        this.userPhone = phone;

        this.userID = userCounter++;

    }//end public User(String name, String email, String phone)


    //*********************************************************************
    //* getters && setters
    //*********************************************************************

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public ArrayList<EducationalAchievement> getEducationalAchievementList() {
        return educationalAchievementList;
    }

    public ArrayList<WorkExperience> getWorkExperienceList() {
        return workExperienceList;
    }

    public ArrayList<Skill> getSkillList() {
        return skillList;
    }

    //*********************************************************************
    //* ArrayList methods
    //*********************************************************************
    public void addUserSkill(Skill skill){

        skillList.add(skill);
    }

    public void addUserWorkExperience(WorkExperience experience){

        workExperienceList.add(experience);
    }


    public void addUserEducationalAchievement(EducationalAchievement ea){

        educationalAchievementList.add(ea);
    }


}//end public class User
