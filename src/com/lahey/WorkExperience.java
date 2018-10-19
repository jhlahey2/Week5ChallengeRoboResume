package com.lahey;

import java.util.ArrayList;

/**
 * @author jack lahey
 */

public class WorkExperience {


    private String companyName;
    private String jobTitle;
    private String jobDateStart;
    private String jobDateEnd;
    private ArrayList<String > jobResponsibilityList;


    public WorkExperience(String companyName, String jobTitle, String jobDateStart, String jobDateEnd) {

        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.jobDateStart = jobDateStart;
        this.jobDateEnd = jobDateEnd;
        jobResponsibilityList = new ArrayList<String>();

    }//end public WorkExperience(String companyName, String jobTitle, String johDescription, String jobDateStart, String jobDateEnd)


    //*********************************************************************
    //* getters & Setters
    //*********************************************************************
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getJobDateStart() {
        return jobDateStart;
    }

    public void setJobDateStart(String jobDateStart) {
        this.jobDateStart = jobDateStart;
    }

    public String getJobDateEnd() {
        return jobDateEnd;
    }

    public void setJobDateEnd(String jobDateEnd) {
        this.jobDateEnd = jobDateEnd;
    }

    //*********************************************************************
    //*
    //*********************************************************************
    public ArrayList<String> getjobResponsibilities(){

        return jobResponsibilityList;
    }

    public void addJobResponsibility(String responsibility){

        jobResponsibilityList.add(responsibility);
    }

}//end public class WorkExperience
