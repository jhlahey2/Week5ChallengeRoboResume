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


    /**
     * Constructor
     *
     * @param name
     * @param email
     * @param phone
     */
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

    /**
     * Get user id number
     * @return
     */
    public int getUserID() {
        return userID;
    }

    /**
     * Set user id number
     * @param userID
     */
    public void setUserID(int userID) {
        this.userID = userID;
    }

    /**
     * Get user name
     * @return
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Set user name
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     *  Get user email
     * @return
     */
    public String getUserEmail() {
        return userEmail;
    }

    /**
     * Set user email
     * @param userEmail
     */
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPhone() {
        return userPhone;
    }

    /**
     * Set useer phone
     * @param userPhone
     */
    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    /**
     * Get list of user Educational Achievements
     * @return
     */
    public ArrayList<EducationalAchievement> getEducationalAchievementList() {
        return educationalAchievementList;
    }


    /**
     * Get list of user work experiences
     * @return
     */
    public ArrayList<WorkExperience> getWorkExperienceList() {
        return workExperienceList;
    }


    /**
     * Get list of user skills
     * @return
     */
    public ArrayList<Skill> getSkillList() {
        return skillList;
    }

    //*********************************************************************
    //* ArrayList methods
    //*********************************************************************

    /**
     * Add a skill to a user
     * @param skill
     */
    public void addUserSkill(Skill skill){

        skillList.add(skill);
    }

    /**
     * Add a work experience to a user
     * @param experience
     */
    public void addUserWorkExperience(WorkExperience experience){

        workExperienceList.add(experience);
    }

    /**
     * Add and educational achievement to a user
     * @param ea
     */
    public void addUserEducationalAchievement(EducationalAchievement ea){

        educationalAchievementList.add(ea);
    }


}//end public class User
